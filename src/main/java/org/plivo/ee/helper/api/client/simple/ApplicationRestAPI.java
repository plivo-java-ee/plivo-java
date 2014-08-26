package org.plivo.ee.helper.api.client.simple;

import java.util.HashMap;
import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.application.Application;
import org.plivo.ee.helper.api.response.application.ApplicationFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class ApplicationRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public ApplicationRestAPI() {

	}

	public ApplicationRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public ApplicationRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Application
	public ApplicationFactory getApplications() throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/Application/", new HashMap<String, String>()),
				ApplicationFactory.class);
	}

	public Application getApplication(Map<String, String> parameters)
			throws PlivoException {
		String app_id = HttpUtils.getKeyValue(parameters, "app_id");
		return this.gson.fromJson(
				request("GET", String.format("/Application/%s/", app_id),
						new HashMap<String, String>()), Application.class);
	}

	public GenericResponse createApplication(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("POST", "/Application/", parameters),
				GenericResponse.class);
	}

	public GenericResponse editApplication(Map<String, String> parameters)
			throws PlivoException {
		String app_id = HttpUtils.getKeyValue(parameters, "app_id");
		return this.gson.fromJson(
				request("POST", String.format("/Application/%s/", app_id),
						parameters), GenericResponse.class);
	}

	public GenericResponse deleteApplication(Map<String, String> parameters)
			throws PlivoException {
		String app_id = HttpUtils.getKeyValue(parameters, "app_id");
		return this.gson.fromJson(
				request("DELETE", String.format("/Application/%s/", app_id),
						parameters), GenericResponse.class);
	}
}
