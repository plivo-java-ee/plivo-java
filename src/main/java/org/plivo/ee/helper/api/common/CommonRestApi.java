package org.plivo.ee.helper.api.common;

import java.util.LinkedHashMap;

import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;


public class CommonRestApi {

	protected static final String PLIVO_PROTOCOL = "https://";
	protected static final String PLIVO_HOST = "api.plivo.com";
	protected static final int PLIVO_PORT = 443;
	protected static final String LATEST_PLIVO_VERSION = "v1";

	protected String authId;
	protected String authToken;
	protected String baseURI;

	public String request(String method, String resource,
			LinkedHashMap<String, String> parameters) throws PlivoException {
		return HttpUtils.request(method, resource, parameters, PLIVO_HOST,
				PLIVO_PORT, authId, authToken, baseURI);
	}

	// Internal methods
	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getBaseURI() {
		return this.baseURI;
	}

	public void setBaseURI(String baseURI) {
		this.baseURI = baseURI;
	}
}
