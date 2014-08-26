package org.plivo.ee.helper.api.response.conference;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class LiveConferenceFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	private List<String> conferences;

	public LiveConferenceFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
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

	public List<String> getConferences() {
		return conferences;
	}

	public void setConferences(List<String> conferences) {
		this.conferences = conferences;
	}
}
