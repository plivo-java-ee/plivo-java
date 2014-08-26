package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierCreatedResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("carrier_id")
	private Object carrierId;

	private String message;

	private OutgoingCarrierErrorMessage error;

	public OutgoingCarrierCreatedResponse() {
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

	public Object getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Object carrierId) {
		this.carrierId = carrierId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OutgoingCarrierErrorMessage getError() {
		return error;
	}

	public void setError(OutgoingCarrierErrorMessage error) {
		this.error = error;
	}
}
