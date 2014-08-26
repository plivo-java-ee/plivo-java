package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class IncomingCarrier implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("carrier_id")
	private String carrierId;

	@SerializedName("ip_set")
	private String ipSet;

	@SerializedName("name")
	private String name;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("sms")
	private Boolean sms;

	@SerializedName("voice")
	private Boolean voice;

	public IncomingCarrier() {
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

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public String getIpSet() {
		return ipSet;
	}

	public void setIpSet(String ipSet) {
		this.ipSet = ipSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public Boolean getSms() {
		return sms;
	}

	public void setSms(Boolean sms) {
		this.sms = sms;
	}

	public Boolean getVoice() {
		return voice;
	}

	public void setVoice(Boolean voice) {
		this.voice = voice;
	}
}
