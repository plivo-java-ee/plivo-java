package org.plivo.ee.helper.api.response.call;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class LiveCallFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("calls")
	private List<String> liveCallList;

	private String error;

	public LiveCallFactory() {
		// empty
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public List<String> getLiveCallList() {
		return liveCallList;
	}

	public void setLiveCallList(List<String> liveCallList) {
		this.liveCallList = liveCallList;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
