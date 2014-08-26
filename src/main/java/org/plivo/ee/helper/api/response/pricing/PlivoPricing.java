package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;

import org.plivo.ee.helper.api.response.pricing.PhoneNumbers;
import org.plivo.ee.helper.api.response.pricing.SmsRates;
import org.plivo.ee.helper.api.response.pricing.VoiceRates;

import com.google.gson.annotations.SerializedName;

public class PlivoPricing implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("country_code")
	private String countryCode;

	@SerializedName("country_iso")
	private String countryIso;

	private String country;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("phone_numbers")
	private PhoneNumbers phoneNumbers;

	@SerializedName("voice")
	private VoiceRates voiceRates;

	@SerializedName("message")
	private SmsRates smsRates;

	public PlivoPricing() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryIso() {
		return countryIso;
	}

	public void setCountryIso(String countryIso) {
		this.countryIso = countryIso;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public PhoneNumbers getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(PhoneNumbers phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public VoiceRates getVoiceRates() {
		return voiceRates;
	}

	public void setVoiceRates(VoiceRates voiceRates) {
		this.voiceRates = voiceRates;
	}

	public SmsRates getSmsRates() {
		return smsRates;
	}

	public void setSmsRates(SmsRates smsRates) {
		this.smsRates = smsRates;
	}
}
