package org.plivo.ee.helper.api.client.simple;

import java.util.HashMap;
import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.number.NumberGroupFactory;
import org.plivo.ee.helper.api.response.number.NumberResponse;
import org.plivo.ee.helper.api.response.number.NumberSearchFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class NumberRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public NumberRestAPI() {

	}

	public NumberRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public NumberRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Number
	public NumberSearchFactory getNumbers() throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/Number/", new HashMap<String, String>()),
				NumberSearchFactory.class);
	}

	public NumberSearchFactory getNumbers(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("GET", "/Number/", parameters),
				NumberSearchFactory.class);
	}

	@Deprecated
	public NumberSearchFactory searchNumbers(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/AvailableNumber/", parameters),
				NumberSearchFactory.class);
	}

	@Deprecated
	public GenericResponse rentNumber(Map<String, String> parameters)
			throws PlivoException {
		String number = HttpUtils.getKeyValue(parameters, "number");
		return this.gson.fromJson(
				request("POST", String.format("/AvailableNumber/%s/", number,
						parameters), new HashMap<String, String>()),
				GenericResponse.class);
	}

	public NumberGroupFactory searchNumberGroups(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/AvailableNumberGroup/", parameters),
				NumberGroupFactory.class);
	}

	public NumberResponse rentNumbers(Map<String, String> parameters)
			throws PlivoException {
		String groupId = HttpUtils.getKeyValue(parameters, "group_id");
		return this.gson.fromJson(
				request("POST",
						String.format("/AvailableNumberGroup/%s/", groupId),
						parameters), NumberResponse.class);
	}

	public GenericResponse unRentNumber(Map<String, String> parameters)
			throws PlivoException {
		String number = HttpUtils.getKeyValue(parameters, "number");
		return this.gson.fromJson(
				request("DELETE", String.format("/Number/%s/", number),
						parameters), GenericResponse.class);
	}

	public GenericResponse linkApplicationNumber(Map<String, String> parameters)
			throws PlivoException {
		String number = HttpUtils.getKeyValue(parameters, "number");
		return this.gson.fromJson(
				request("POST", String.format("/Number/%s/", number),
						parameters), GenericResponse.class);
	}

	public GenericResponse unlinkApplicationNumber(
			Map<String, String> parameters) throws PlivoException {
		String number = HttpUtils.getKeyValue(parameters, "number");
		parameters.put("app_id", "");
		return this.gson.fromJson(
				request("POST", String.format("/Number/%s/", number),
						parameters), GenericResponse.class);
	}

}
