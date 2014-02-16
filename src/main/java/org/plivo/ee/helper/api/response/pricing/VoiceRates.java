package org.plivo.ee.helper.api.response.pricing;

import org.plivo.ee.helper.api.response.pricing.InboundVoicePricing;
import org.plivo.ee.helper.api.response.pricing.OutboundVoicePricing;

import com.google.gson.annotations.SerializedName;

public class VoiceRates {
	@SerializedName("inbound")	
	public InboundVoicePricing voiceInbound ;

	@SerializedName("outbound")	
	public OutboundVoicePricing voiceOutbound ;
	
	public VoiceRates() {
		// empty
	}
}
