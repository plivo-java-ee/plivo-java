package org.plivo.ee.helper.api.response.pricing;

import org.plivo.ee.helper.api.response.pricing.InboundSmsPricing;
import org.plivo.ee.helper.api.response.pricing.OutboundSmsPricing;

import com.google.gson.annotations.SerializedName;

public class SmsRates {
	@SerializedName("inbound")
	public InboundSmsPricing inboundSms ;
	
	@SerializedName("outbound")
	public OutboundSmsPricing outboundSms ;
	
	public SmsRates() {
		// empty
	}
}
