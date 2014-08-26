package org.plivo.ee.helper.api.response.call;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class LiveCall implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private String direction;

	private String from;

	@SerializedName("call_status")
	private String callStatus;

	@SerializedName("api_id")
	private String apiId;

	private String to;

	@SerializedName("caller_name")
	private String callerName;

	@SerializedName("call_uuid")
	private String callUuuid;

	@SerializedName("session_start")
	private String sessionStart;

	private String error;

	public LiveCall() {
		// empty
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getCallStatus() {
		return callStatus;
	}

	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCallerName() {
		return callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}

	public String getCallUuuid() {
		return callUuuid;
	}

	public void setCallUuuid(String callUuuid) {
		this.callUuuid = callUuuid;
	}

	public String getSessionStart() {
		return sessionStart;
	}

	public void setSessionStart(String sessionStart) {
		this.sessionStart = sessionStart;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
