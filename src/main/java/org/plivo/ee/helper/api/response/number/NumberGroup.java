package org.plivo.ee.helper.api.response.number;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class NumberGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("group_id")
	private String groupId;

	@SerializedName("number_type")
	private String numberType;

	@SerializedName("rental_rate")
	private String rentalRate;

	@SerializedName("setup_rate")
	private String setupRate;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("sms_enabled")
	private Boolean isSmsEnabled;

	@SerializedName("sms_rate")
	private String smsRate;

	@SerializedName("voice_enabled")
	private Boolean isVoiceEnabled;

	@SerializedName("voice_rate")
	private String voiceRate;

	@SerializedName("stock")
	private Integer inStock;

	@SerializedName("prefix")
	private String numberPrefix;

	private String region;

	private String error;

	public NumberGroup() {
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
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

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public Boolean getIsSmsEnabled() {
		return isSmsEnabled;
	}

	public void setIsSmsEnabled(Boolean isSmsEnabled) {
		this.isSmsEnabled = isSmsEnabled;
	}

	public String getSmsRate() {
		return smsRate;
	}

	public void setSmsRate(String smsRate) {
		this.smsRate = smsRate;
	}

	public Boolean getIsVoiceEnabled() {
		return isVoiceEnabled;
	}

	public void setIsVoiceEnabled(Boolean isVoiceEnabled) {
		this.isVoiceEnabled = isVoiceEnabled;
	}

	public String getVoiceRate() {
		return voiceRate;
	}

	public void setVoiceRate(String voiceRate) {
		this.voiceRate = voiceRate;
	}

	public Integer getInStock() {
		return inStock;
	}

	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}

	public String getNumberPrefix() {
		return numberPrefix;
	}

	public void setNumberPrefix(String numberPrefix) {
		this.numberPrefix = numberPrefix;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
