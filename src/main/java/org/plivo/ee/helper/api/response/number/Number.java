package org.plivo.ee.helper.api.response.number;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Number implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private String region;

	@SerializedName("voice_enabled")
	private Boolean isVoiceEnabled;

	@SerializedName("sms_enabled")
	private Boolean isSmsEnabled;

	@SerializedName("fax_enabled")
	private Boolean isFaxEnabled;

	private String number;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("voice_rate")
	private String voiceRate;

	private String application;
	@SerializedName("sms_rate")
	private String smsRate;

	@SerializedName("number_type")
	private String numberType;

	@SerializedName("sub_account")
	private String subAccount;

	@SerializedName("added_on")
	private String addedOn;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("prefix")
	private String numberPrefix;

	@SerializedName("rental_rate")
	private String rentalRate;

	@SerializedName("setup_rate")
	private String setupRate;

	@Deprecated
	private String country;

	@Deprecated
	private Integer lata;

	@Deprecated
	@SerializedName("monthly_rental_rate")
	private String monthlyRentalRrate;

	private String error;

	@SerializedName("carrier")
	private String inboundCarrier;

	public Number() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Boolean getIsVoiceEnabled() {
		return isVoiceEnabled;
	}

	public void setIsVoiceEnabled(Boolean isVoiceEnabled) {
		this.isVoiceEnabled = isVoiceEnabled;
	}

	public Boolean getIsSmsEnabled() {
		return isSmsEnabled;
	}

	public void setIsSmsEnabled(Boolean isSmsEnabled) {
		this.isSmsEnabled = isSmsEnabled;
	}

	public Boolean getIsFaxEnabled() {
		return isFaxEnabled;
	}

	public void setIsFaxEnabled(Boolean isFaxEnabled) {
		this.isFaxEnabled = isFaxEnabled;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getVoiceRate() {
		return voiceRate;
	}

	public void setVoiceRate(String voiceRate) {
		this.voiceRate = voiceRate;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getSmsRate() {
		return smsRate;
	}

	public void setSmsRate(String smsRate) {
		this.smsRate = smsRate;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	public String getSubAccount() {
		return subAccount;
	}

	public void setSubAccount(String subAccount) {
		this.subAccount = subAccount;
	}

	public String getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(String addedOn) {
		this.addedOn = addedOn;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getNumberPrefix() {
		return numberPrefix;
	}

	public void setNumberPrefix(String numberPrefix) {
		this.numberPrefix = numberPrefix;
	}

	public String getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(String rentalRate) {
		this.rentalRate = rentalRate;
	}

	public String getSetupRate() {
		return setupRate;
	}

	public void setSetupRate(String setupRate) {
		this.setupRate = setupRate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getLata() {
		return lata;
	}

	public void setLata(Integer lata) {
		this.lata = lata;
	}

	public String getMonthlyRentalRrate() {
		return monthlyRentalRrate;
	}

	public void setMonthlyRentalRrate(String monthlyRentalRrate) {
		this.monthlyRentalRrate = monthlyRentalRrate;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getInboundCarrier() {
		return inboundCarrier;
	}

	public void setInboundCarrier(String inboundCarrier) {
		this.inboundCarrier = inboundCarrier;
	}
}
