package org.plivo.ee.helper.api.response.number;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NumberSearchFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	public NumberMeta meta;

	@SerializedName("api_id")
	private String apiId;

	private String error;

	@SerializedName("objects")
	private List<Number> numberList;

	public NumberSearchFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public NumberMeta getMeta() {
		return meta;
	}

	public void setMeta(NumberMeta meta) {
		this.meta = meta;
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

	public List<Number> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Number> numberList) {
		this.numberList = numberList;
	}
}
