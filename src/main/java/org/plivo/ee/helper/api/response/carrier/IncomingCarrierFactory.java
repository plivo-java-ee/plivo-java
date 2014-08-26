package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class IncomingCarrierFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	private IncomingCarrierMeta meta;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<IncomingCarrier> incomingCarrierList;

	private String error;

	public IncomingCarrierFactory() {
	}

	public IncomingCarrierMeta getMeta() {
		return meta;
	}

	public void setMeta(IncomingCarrierMeta meta) {
		this.meta = meta;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public List<IncomingCarrier> getIncomingCarrierList() {
		return incomingCarrierList;
	}

	public void setIncomingCarrierList(List<IncomingCarrier> incomingCarrierList) {
		this.incomingCarrierList = incomingCarrierList;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
