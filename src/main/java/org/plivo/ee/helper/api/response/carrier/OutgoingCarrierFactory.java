package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private OutgoingCarrierMeta meta;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<OutgoingCarrier> outgoingCarrierList;

	private String error;

	public OutgoingCarrierFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public OutgoingCarrierMeta getMeta() {
		return meta;
	}

	public void setMeta(OutgoingCarrierMeta meta) {
		this.meta = meta;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public List<OutgoingCarrier> getOutgoingCarrierList() {
		return outgoingCarrierList;
	}

	public void setOutgoingCarrierList(List<OutgoingCarrier> outgoingCarrierList) {
		this.outgoingCarrierList = outgoingCarrierList;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
