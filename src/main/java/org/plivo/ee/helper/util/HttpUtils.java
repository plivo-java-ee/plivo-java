package org.plivo.ee.helper.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolVersion;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.protocol.HTTP;
import org.plivo.ee.helper.exception.PlivoException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HttpUtils {

	private static DefaultHttpClient initClient(String host, int port,
			String authId, String authToken) {
		DefaultHttpClient client = new DefaultHttpClient();
		client.getCredentialsProvider().setCredentials(
				// new AuthScope(PLIVO_HOST, PLIVO_PORT),
				new AuthScope(host, port),
				new UsernamePasswordCredentials(authId, authToken));
		return client;
	}

	public static String request(String method, String resource,
			Map<String, String> parameters, String host, int port,
			String authId, String authToken, String baseURI)
			throws PlivoException {

		HttpResponse response = new BasicHttpResponse(new ProtocolVersion(
				"HTTP", 1, 1), HttpStatus.SC_OK, "OK");
		DefaultHttpClient client = initClient(host, port, authId, authToken);
		try {
			if ("GET".equals(method)) {
				// Prepare a String with GET parameters
				StringBuffer getparams = new StringBuffer("?");
				for (Entry<String, String> pair : parameters.entrySet())
					getparams.append(pair.getKey()).append("=")
							.append(pair.getValue()).append("&");
				// remove the trailing '&'
				// getparams = getparams.substring(0, getparams.length() - 1);

				HttpGet httpget = new HttpGet(baseURI
						+ resource
						+ getparams.toString().substring(0,
								getparams.toString().length() - 1));
				response = client.execute(httpget);
			} else if ("POST".equals(method)) {
				HttpPost httpost = new HttpPost(baseURI + resource);
				Gson gson = new GsonBuilder().serializeNulls().create();
				// Create a String entity with the POST parameters
				StringEntity se = new StringEntity(gson.toJson(parameters),
						"utf-8");
				se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE,
						"application/json"));
				// Now, attach the pay load to the request
				httpost.setEntity(se);
				response = client.execute(httpost);
			} else if ("DELETE".equals(method)) {
				HttpDelete httpdelete = new HttpDelete(baseURI + resource);
				response = client.execute(httpdelete);
			}

			Integer serverCode = response.getStatusLine().getStatusCode();

			if (response.getEntity() != null) {
				return convertStreamToString(response.getEntity().getContent())
						.replaceFirst(
								"\\{",
								String.format("{ \"server_code\": %s, ",
										serverCode.toString()));
			} else {
				// dummy response
				return String
						.format("{\"message\":\"no response\",\"api_id\":\"unknown\", \"server_code\":%s}",
								serverCode.toString());
			}

		} catch (ClientProtocolException e) {
			throw new PlivoException(e.getLocalizedMessage());
		} catch (IOException e) {
			throw new PlivoException(e.getLocalizedMessage());
		} catch (IllegalStateException e) {
			throw new PlivoException(e.getLocalizedMessage());
		} finally {
			client.getConnectionManager().shutdown();
		}

	}

	private static String convertStreamToString(InputStream istream)
			throws IOException {
		BufferedReader breader = new BufferedReader(new InputStreamReader(
				istream));
		StringBuilder responseString = new StringBuilder();
		String line = "";
		while ((line = breader.readLine()) != null) {
			responseString.append(line);
		}
		breader.close();
		return responseString.toString();
	}

	public static String getKeyValue(Map<String, String> params, String key)
			throws PlivoException {
		String value = "";
		if (params.containsKey(key)) {
			value = params.get(key);
			params.remove(key);
		} else {
			throw new PlivoException(String.format(
					"Missing mandatory parameter %s.", key));
		}
		return value;
	}

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("nome", "valore");
		StringEntity se = new StringEntity(gson.toJson(parameters), "utf-8");
		System.out.println(fromStream(se.getContent()));
	}

	public static String fromStream(InputStream in) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuilder out = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		String line;
		while ((line = reader.readLine()) != null) {
			out.append(line);
			out.append(newLine);
		}
		return out.toString();
	}
}
