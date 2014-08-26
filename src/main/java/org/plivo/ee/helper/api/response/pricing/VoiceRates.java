package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;

import org.plivo.ee.helper.api.response.pricing.InboundVoicePricing;
import org.plivo.ee.helper.api.response.pricing.OutboundVoicePricing;

import com.google.gson.annotations.SerializedName;

public class VoiceRates implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("inbound")
	private InboundVoicePricing voiceInbound;

	@SerializedName("outbound")
	private OutboundVoicePricing voiceOutbound;

	public VoiceRates() {
	}

	public InboundVoicePricing getVoiceInbound() {
		return voiceInbound;
	}

	public void setVoiceInbound(InboundVoicePricing voiceInbound) {
		this.voiceInbound = voiceInbound;
	}

	public OutboundVoicePricing getVoiceOutbound() {
		return voiceOutbound;
	}

	public void setVoiceOutbound(OutboundVoicePricing voiceOutbound) {
		this.voiceOutbound = voiceOutbound;
	}
}
