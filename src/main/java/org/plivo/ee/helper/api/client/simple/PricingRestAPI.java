package org.plivo.ee.helper.api.client.simple;

import java.util.LinkedHashMap;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.pricing.PlivoPricing;
import org.plivo.ee.helper.exception.PlivoException;

import com.google.gson.Gson;

public class PricingRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public PricingRestAPI() {

	}

	public PricingRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public PricingRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Pricing
	public PlivoPricing getPricing(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("GET", "/Pricing/", parameters),
				PlivoPricing.class);
	}

}