package org.plivo.ee.helper.api.client.simple;


import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRouting;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingCreatedResponse;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class OutgoingCarrierRoutingRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public OutgoingCarrierRoutingRestAPI() {

	}

	public OutgoingCarrierRoutingRestAPI(String authId, String authToken,
			String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public OutgoingCarrierRoutingRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Outgoing Carrier Routing
	public OutgoingCarrierRoutingFactory getOutgoingCarrierRoutings(
			Map<String, String> parameters) throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/OutgoingCarrierRouting/", parameters),
				OutgoingCarrierRoutingFactory.class);
	}

	public OutgoingCarrierRouting getOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		String carrier = HttpUtils.getKeyValue(parameters, "routing_id");
		return this.gson.fromJson(
				request("GET",
						String.format("/OutgoingCarrierRouting/%s/", carrier),
						parameters), OutgoingCarrierRouting.class);
	}

	public OutgoingCarrierRoutingCreatedResponse addOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		return this.gson.fromJson(
				request("POST", "/OutgoingCarrierRouting/", parameters),
				OutgoingCarrierRoutingCreatedResponse.class);
	}

	public GenericResponse editOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		String routing_id = HttpUtils.getKeyValue(parameters, "routing_id");
		return this.gson.fromJson(
				request("POST", String.format("/OutgoingCarrierRouting/%s/",
						routing_id), parameters), GenericResponse.class);
	}

	public GenericResponse dropOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		String routing_id = HttpUtils.getKeyValue(parameters, "routing_id");
		return this.gson.fromJson(
				request("DELETE", String.format("/OutgoingCarrierRouting/%s/",
						routing_id), parameters), GenericResponse.class);
	}

}
