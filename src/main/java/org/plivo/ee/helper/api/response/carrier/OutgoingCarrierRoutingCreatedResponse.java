package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierRoutingCreatedResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("api_id")
	private String apiId;

	private Object routes;

	private String message;

	private OutgoingCarrierRoutingErrorMessage error;

	private OutgoingCarrierRoutingCreatedResponse() {
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

	public Object getRoutes() {
		return routes;
	}

	public void setRoutes(Object routes) {
		this.routes = routes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OutgoingCarrierRoutingErrorMessage getError() {
		return error;
	}

	public void setError(OutgoingCarrierRoutingErrorMessage error) {
		this.error = error;
	}
}
