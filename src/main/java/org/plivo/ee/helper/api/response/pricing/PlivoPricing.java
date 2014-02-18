package org.plivo.ee.helper.api.response.pricing;

import org.plivo.ee.helper.api.response.pricing.PhoneNumbers;
import org.plivo.ee.helper.api.response.pricing.SmsRates;
import org.plivo.ee.helper.api.response.pricing.VoiceRates;

import com.google.gson.annotations.SerializedName;

public class PlivoPricing {
	@SerializedName("server_code")
	public Integer serverCode ;

	@SerializedName("country_code")
	public String countryCode ;
	
	@SerializedName("country_iso")
	public String countryIso;
	
	public String country ;
	
	@SerializedName("api_id")
	public String apiId ;
	
	@SerializedName("phone_numbers")
	public PhoneNumbers phoneNumbers ;
	
	@SerializedName("voice")
	public VoiceRates voiceRates ;
	
	@SerializedName("message")
	public SmsRates smsRates ;
	
	public PlivoPricing() {
		// empty
	}
}