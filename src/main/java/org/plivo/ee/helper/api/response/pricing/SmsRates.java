package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;

import org.plivo.ee.helper.api.response.pricing.InboundSmsPricing;
import org.plivo.ee.helper.api.response.pricing.OutboundSmsPricing;

import com.google.gson.annotations.SerializedName;

public class SmsRates implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("inbound")
	private InboundSmsPricing inboundSms;

	@SerializedName("outbound")
	private OutboundSmsPricing outboundSms;

	public SmsRates() {
	}

	public InboundSmsPricing getInboundSms() {
		return inboundSms;
	}

	public void setInboundSms(InboundSmsPricing inboundSms) {
		this.inboundSms = inboundSms;
	}

	public OutboundSmsPricing getOutboundSms() {
		return outboundSms;
	}

	public void setOutboundSms(OutboundSmsPricing outboundSms) {
		this.outboundSms = outboundSms;
	}
}
