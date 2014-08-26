package org.plivo.ee.helper.api.response.account;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class SubAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	private String account;

	private String error;
	@SerializedName("api_id")
	private String apiId;

	@SerializedName("auth_id")
	private String authId;

	@SerializedName("auth_token")
	private String authToken;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("created")
	private String createdOn;

	@SerializedName("enabled")
	private Boolean isEnabled;

	@SerializedName("modified")
	private String lastModifiedOn;

	private String name;

	public SubAccount() {
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(String lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
