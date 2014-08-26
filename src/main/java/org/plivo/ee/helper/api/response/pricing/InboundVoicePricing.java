package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;

import org.plivo.ee.helper.api.response.pricing.LocalInboundPricing;
import org.plivo.ee.helper.api.response.pricing.TollfreeInboundPricing;

import com.google.gson.annotations.SerializedName;

public class InboundVoicePricing implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("local")
	private LocalInboundPricing localInbound ;
	
	@SerializedName("tollfree")
	private TollfreeInboundPricing tollfreeInbound ;
	
	@SerializedName("ip")
	private SipInboundPricing ipInboundRate ;
	
	public InboundVoicePricing() {
	}

	public LocalInboundPricing getLocalInbound() {
		return localInbound;
	}

	public void setLocalInbound(LocalInboundPricing localInbound) {
		this.localInbound = localInbound;
	}

	public TollfreeInboundPricing getTollfreeInbound() {
		return tollfreeInbound;
	}

	public void setTollfreeInbound(TollfreeInboundPricing tollfreeInbound) {
		this.tollfreeInbound = tollfreeInbound;
	}

	public SipInboundPricing getIpInboundRate() {
		return ipInboundRate;
	}

	public void setIpInboundRate(SipInboundPricing ipInboundRate) {
		this.ipInboundRate = ipInboundRate;
	}
}
