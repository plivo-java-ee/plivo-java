package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrier implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("carrier_id")
	private String carrierId;

	private String ips;

	private String name;

	private String address;

	private String prefix;

	@SerializedName("failover_address")
	private String failoverAddress;

	@SerializedName("failover_prefix")
	private String failoverPrefix;

	private String suffix;

	private Boolean enabled;

	private Integer retries;

	@SerializedName("retry_seconds")
	private Integer retrySeconds;

	@SerializedName("resource_uri")
	private String resourceUri;

	public OutgoingCarrier() {
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

	public String getIps() {
		return ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFailoverAddress() {
		return failoverAddress;
	}

	public void setFailoverAddress(String failoverAddress) {
		this.failoverAddress = failoverAddress;
	}

	public String getFailoverPrefix() {
		return failoverPrefix;
	}

	public void setFailoverPrefix(String failoverPrefix) {
		this.failoverPrefix = failoverPrefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getRetries() {
		return retries;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	public Integer getRetrySeconds() {
		return retrySeconds;
	}

	public void setRetrySeconds(Integer retrySeconds) {
		this.retrySeconds = retrySeconds;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}
}
