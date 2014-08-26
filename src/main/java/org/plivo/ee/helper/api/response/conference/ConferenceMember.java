package org.plivo.ee.helper.api.response.conference;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ConferenceMember implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean muted;

	@SerializedName("member_id")
	private String memberId;

	private Boolean deaf;

	private String from;

	private String to;

	@SerializedName("caller_name")
	private String callerName;

	private String direction;

	@SerializedName("call_uuid")
	private String callUUID;

	@SerializedName("join_time")
	private String joinTime;

	public ConferenceMember() {
	}

	public Boolean getMuted() {
		return muted;
	}

	public void setMuted(Boolean muted) {
		this.muted = muted;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Boolean getDeaf() {
		return deaf;
	}

	public void setDeaf(Boolean deaf) {
		this.deaf = deaf;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getCallUUID() {
		return callUUID;
	}

	public void setCallUUID(String callUUID) {
		this.callUUID = callUUID;
	}

	public String getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}
}
