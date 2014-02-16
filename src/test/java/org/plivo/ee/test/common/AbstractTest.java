package org.plivo.ee.test.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.junit.Before;
import org.plivo.ee.helper.api.RestAPI;


public class AbstractTest {

	public String auth_id;
	public String auth_token;
	public String src;
	public String dst;
	public LinkedHashMap<String, String> parameters;

	protected RestAPI getRestApi() {
		RestAPI restAPI = new RestAPI(auth_id, auth_token);
		return restAPI;
	}

	protected LinkedHashMap<String, String> getParameters() {
		return parameters;
	}

	protected void addSrc() {
		getParameters().put("src", src);
	}

	protected void addDst() {
		getParameters().put("dst", dst);
	}

	protected void addFrom() {
		getParameters().put("from", src);
	}

	protected void addTo() {
		getParameters().put("to", dst);
	}

	@Before
	public void init() {
		parameters = new LinkedHashMap<String, String>();
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("src/test/resources/account.properties");
			prop.load(input);

			this.auth_id = prop.getProperty("auth_id");
			this.auth_token = prop.getProperty("auth_token");
			this.dst = prop.getProperty("dst");
			this.src = prop.getProperty("src");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
