package org.plivo.ee.helper.api.response.number;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NumberResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("numbers")
	private List<NumberStatus> numberStatusList;

	private String status;

	private String error;

	@SerializedName("api_id")
	public String apiId;

	public NumberResponse() {
		// empty
	}

	public List<NumberStatus> getNumberStatusList() {
		return numberStatusList;
	}

	public void setNumberStatusList(List<NumberStatus> numberStatusList) {
		this.numberStatusList = numberStatusList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
