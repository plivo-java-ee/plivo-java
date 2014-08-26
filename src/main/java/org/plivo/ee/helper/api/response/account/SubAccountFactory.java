package org.plivo.ee.helper.api.response.account;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SubAccountFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private SubAccountMeta meta;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<SubAccount> subAccountList;

	public SubAccountFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public SubAccountMeta getMeta() {
		return meta;
	}

	public void setMeta(SubAccountMeta meta) {
		this.meta = meta;
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

	public List<SubAccount> getSubAccountList() {
		return subAccountList;
	}

	public void setSubAccountList(List<SubAccount> subAccountList) {
		this.subAccountList = subAccountList;
	}
}
