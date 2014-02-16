package org.plivo.ee.helper.api.response.pricing;

import java.util.ArrayList;

import org.plivo.ee.helper.api.response.pricing.LocalOutboundPricing;
import org.plivo.ee.helper.api.response.pricing.SipOutboundPricing;
import org.plivo.ee.helper.api.response.pricing.TollfreeOutboundPricing;

import com.google.gson.annotations.SerializedName;

public class OutboundVoicePricing {
	@SerializedName("local")
	public LocalOutboundPricing localOutbound ;
	
	@SerializedName("tollfree")
	public TollfreeOutboundPricing tollfreeOutbound ;
	
	@SerializedName("ip")
	public SipOutboundPricing ipOutbound ;
	
	@SerializedName("rates")
	public ArrayList<RatesPrefixes> prefixesRates ;
	
	public OutboundVoicePricing() {
		// empty
	}
}
