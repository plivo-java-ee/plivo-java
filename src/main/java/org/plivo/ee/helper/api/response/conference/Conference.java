package org.plivo.ee.helper.api.response.conference;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Conference implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("conference_name")
	private String conferenceName;

	@SerializedName("conference_run_time")
	private String conferenceRunTime;

	@SerializedName("conference_member_count")
	private String conferenceMemberCount;

	private List<ConferenceMember> members;

	@SerializedName("api_id")
	private String apiId;

	private String error;

	public Conference() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}

	public String getConferenceRunTime() {
		return conferenceRunTime;
	}

	public void setConferenceRunTime(String conferenceRunTime) {
		this.conferenceRunTime = conferenceRunTime;
	}

	public String getConferenceMemberCount() {
		return conferenceMemberCount;
	}

	public void setConferenceMemberCount(String conferenceMemberCount) {
		this.conferenceMemberCount = conferenceMemberCount;
	}

	public List<ConferenceMember> getMembers() {
		return members;
	}

	public void setMembers(List<ConferenceMember> members) {
		this.members = members;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
