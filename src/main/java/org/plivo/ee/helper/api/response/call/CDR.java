package org.plivo.ee.helper.api.response.call;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class CDR implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("bill_duration")
	private Integer billDuration;

	@SerializedName("billed_duration")
	private Integer billedDuration;

	@SerializedName("call_duration")
	private Integer callDuration;

	@SerializedName("total_amount")
	private String totalAmount;

	@SerializedName("parent_call_uuid")
	private String parentCallUUID;

	@SerializedName("call_direction")
	private String callDirection;

	@SerializedName("to_number")
	private String toNumber;

	@SerializedName("total_rate")
	private String totalRate;

	@SerializedName("from_number")
	private String fromNumber;

	@SerializedName("end_time")
	private String endTime;

	@SerializedName("call_uuid")
	private String callUUID;

	@SerializedName("resource_uri")
	private String resourceUri;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	public CDR() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public Integer getBillDuration() {
		return billDuration;
	}

	public void setBillDuration(Integer billDuration) {
		this.billDuration = billDuration;
	}

	public Integer getBilledDuration() {
		return billedDuration;
	}

	public void setBilledDuration(Integer billedDuration) {
		this.billedDuration = billedDuration;
	}

	public Integer getCallDuration() {
		return callDuration;
	}

	public void setCallDuration(Integer callDuration) {
		this.callDuration = callDuration;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getParentCallUUID() {
		return parentCallUUID;
	}

	public void setParentCallUUID(String parentCallUUID) {
		this.parentCallUUID = parentCallUUID;
	}

	public String getCallDirection() {
		return callDirection;
	}

	public void setCallDirection(String callDirection) {
		this.callDirection = callDirection;
	}

	public String getToNumber() {
		return toNumber;
	}

	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}

	public String getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(String totalRate) {
		this.totalRate = totalRate;
	}

	public String getFromNumber() {
		return fromNumber;
	}

	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCallUUID() {
		return callUUID;
	}

	public void setCallUUID(String callUUID) {
		this.callUUID = callUUID;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
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