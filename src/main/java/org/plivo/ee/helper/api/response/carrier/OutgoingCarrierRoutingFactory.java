package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;
import java.util.List;

import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRouting;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingMeta;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierRoutingFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private OutgoingCarrierRoutingMeta meta;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<OutgoingCarrierRouting> outgoingCarrierRoutingList;

	private String error;

	public OutgoingCarrierRoutingFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public OutgoingCarrierRoutingMeta getMeta() {
		return meta;
	}

	public void setMeta(OutgoingCarrierRoutingMeta meta) {
		this.meta = meta;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public List<OutgoingCarrierRouting> getOutgoingCarrierRoutingList() {
		return outgoingCarrierRoutingList;
	}

	public void setOutgoingCarrierRoutingList(
			List<OutgoingCarrierRouting> outgoingCarrierRoutingList) {
		this.outgoingCarrierRoutingList = outgoingCarrierRoutingList;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
