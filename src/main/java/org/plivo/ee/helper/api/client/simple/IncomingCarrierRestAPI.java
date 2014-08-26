package org.plivo.ee.helper.api.client.simple;


import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.carrier.IncomingCarrier;
import org.plivo.ee.helper.api.response.carrier.IncomingCarrierFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class IncomingCarrierRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public IncomingCarrierRestAPI() {

	}

	public IncomingCarrierRestAPI(String authId, String authToken,
			String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public IncomingCarrierRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Incoming Carrier
	public IncomingCarrierFactory getIncomingCarriers(
			Map<String, String> parameters) throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/IncomingCarrier/", parameters),
				IncomingCarrierFactory.class);
	}

	public IncomingCarrier getIncomingCarrier(
			Map<String, String> parameters) throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "carrier_id");
		return this.gson.fromJson(
				request("GET", String.format("/IncomingCarrier/%s/", carrier),
						parameters), IncomingCarrier.class);
	}

	public GenericResponse addIncomingCarrier(
			Map<String, String> parameters) throws PlivoException {
		return this.gson.fromJson(
				request("POST", "/IncomingCarrier/", parameters),
				GenericResponse.class);
	}

	public GenericResponse editIncomingCarrier(
			Map<String, String> parameters) throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "carrier_id");
		return this.gson.fromJson(
				request("POST", String.format("/IncomingCarrier/", carrier),
						parameters), GenericResponse.class);
	}

	public GenericResponse dropIncomingCarrier(
			Map<String, String> parameters) throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "carrier_id");
		return this.gson.fromJson(
				request("DELETE",
						String.format("/IncomingCarrier/%s/", carrier),
						parameters), GenericResponse.class);
	}

}
