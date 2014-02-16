package org.plivo.ee.helper.api.response.pricing;

import org.plivo.ee.helper.api.response.pricing.LocalInboundPricing;
import org.plivo.ee.helper.api.response.pricing.TollfreeInboundPricing;

import com.google.gson.annotations.SerializedName;

public class InboundVoicePricing {
	@SerializedName("local")
	public LocalInboundPricing localInbound ;
	
	@SerializedName("tollfree")
	public TollfreeInboundPricing tollfreeInbound ;
	
	@SerializedName("ip")
	public SipInboundPricing ipInboundRate ;
	
	public InboundVoicePricing() {
		// empty
	}
}
