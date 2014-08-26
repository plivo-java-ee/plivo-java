package org.plivo.ee.helper.api.response.message;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("cloud_rate")
	private String cloudRate;

	@SerializedName("carrier_rate")
	private String carrierRate;

	@SerializedName("message_direction")
	private String messageDirection;

	@SerializedName("to_number")
	private String toNumber;

	@SerializedName("message_state")
	private String messageState;

	@SerializedName("total_amount")
	private String totalAmount;

	@SerializedName("from_number")
	private String fromNumber;

	@SerializedName("message_uuid")
	private String messageUUID;

	@SerializedName("message_time")
	private String messageTime;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("message_type")
	private String messageType;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	public Message() {
	}

	public String getCloudRate() {
		return cloudRate;
	}

	public void setCloudRate(String cloudRate) {
		this.cloudRate = cloudRate;
	}

	public String getCarrierRate() {
		return carrierRate;
	}

	public void setCarrierRate(String carrierRate) {
		this.carrierRate = carrierRate;
	}

	public String getMessageDirection() {
		return messageDirection;
	}

	public void setMessageDirection(String messageDirection) {
		this.messageDirection = messageDirection;
	}

	public String getToNumber() {
		return toNumber;
	}

	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}

	public String getMessageState() {
		return messageState;
	}

	public void setMessageState(String messageState) {
		this.messageState = messageState;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getFromNumber() {
		return fromNumber;
	}

	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}

	public String getMessageUUID() {
		return messageUUID;
	}

	public void setMessageUUID(String messageUUID) {
		this.messageUUID = messageUUID;
	}

	public String getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
}
