package org.plivo.ee.helper.api.response.number;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NumberGroupFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private NumberMeta meta;

	@SerializedName("objects")
	private List<NumberGroup> groupList;

	@SerializedName("api_id")
	private String apiId;

	private String error;

	public NumberGroupFactory() {
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

	public List<NumberGroup> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<NumberGroup> groupList) {
		this.groupList = groupList;
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
