package org.plivo.ee.helper.api.response.endpoint;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class EndpointFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private EndpointMeta meta;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<Endpoint> endpointList;

	public EndpointFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public EndpointMeta getMeta() {
		return meta;
	}

	public void setMeta(EndpointMeta meta) {
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

	public List<Endpoint> getEndpointList() {
		return endpointList;
	}

	public void setEndpointList(List<Endpoint> endpointList) {
		this.endpointList = endpointList;
	}
}
