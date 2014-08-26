package org.plivo.ee.helper.api.response.call;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CDRFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private CDRMeta meta;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<CDR> cdrList;

	public CDRFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public CDRMeta getMeta() {
		return meta;
	}

	public void setMeta(CDRMeta meta) {
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

	public List<CDR> getCdrList() {
		return cdrList;
	}

	public void setCdrList(List<CDR> cdrList) {
		this.cdrList = cdrList;
	}
}
