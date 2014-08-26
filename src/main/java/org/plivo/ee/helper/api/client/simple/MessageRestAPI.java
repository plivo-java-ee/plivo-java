package org.plivo.ee.helper.api.client.simple;

import java.util.HashMap;
import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.message.Message;
import org.plivo.ee.helper.api.response.message.MessageFactory;
import org.plivo.ee.helper.api.response.message.MessageResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class MessageRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public MessageRestAPI() {

	}

	public MessageRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public MessageRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Message
	public MessageResponse sendMessage(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("POST", "/Message/", parameters),
				MessageResponse.class);
	}

	public Message getMessage(Map<String, String> parameters)
			throws PlivoException {
		String record_id = HttpUtils.getKeyValue(parameters, "record_id");
		return this.gson.fromJson(
				request("GET", String.format("/Message/%s/", record_id),
						new HashMap<String, String>()), Message.class);
	}

	public MessageFactory getMessages() throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/Message/", new HashMap<String, String>()),
				MessageFactory.class);
	}

	public MessageFactory getMessages(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("GET", "/Message/", parameters),
				MessageFactory.class);
	}

}
