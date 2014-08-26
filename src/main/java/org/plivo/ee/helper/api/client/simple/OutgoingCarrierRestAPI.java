package org.plivo.ee.helper.api.client.simple;

import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrier;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierCreatedResponse;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class OutgoingCarrierRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public OutgoingCarrierRestAPI() {

	}

	public OutgoingCarrierRestAPI(String authId, String authToken,
			String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public OutgoingCarrierRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Outgoing Carrier
	public OutgoingCarrierFactory getOutgoingCarriers(
			Map<String, String> parameters) throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/OutgoingCarrier/", parameters),
				OutgoingCarrierFactory.class);
	}

	public OutgoingCarrier getOutgoingCarrier(Map<String, String> parameters)
			throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "carrier_id");
		return this.gson.fromJson(
				request("GET", String.format("/OutgoingCarrier/%s/", carrier),
						parameters), OutgoingCarrier.class);
	}

	public OutgoingCarrierCreatedResponse addOutgoingCarrier(
			Map<String, String> parameters) throws PlivoException {
		return this.gson.fromJson(
				request("POST", "/OutgoingCarrier/", parameters),
				OutgoingCarrierCreatedResponse.class);
	}

	public GenericResponse editOutgoingCarrier(Map<String, String> parameters)
			throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "carrier_id");
		return this.gson.fromJson(
				request("POST", String.format("/OutgoingCarrier/%s/", carrier),
						parameters), GenericResponse.class);
	}

	public GenericResponse dropOutgoingCarrier(Map<String, String> parameters)
			throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "carrier_id");
		return this.gson.fromJson(
				request("DELETE",
						String.format("/OutgoingCarrier/%s/", carrier),
						parameters), GenericResponse.class);
	}

}
