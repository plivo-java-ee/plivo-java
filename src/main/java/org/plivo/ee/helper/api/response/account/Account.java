package org.plivo.ee.helper.api.response.account;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@SerializedName("server_code")
	private Integer serverCode;

	private String city;

	private String name;

	@SerializedName("cash_credits")
	private String cashCredits;

	private String created;

	private String enabled;

	private String modified;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	private String postpaid;

	private String state;

	private String address;

	private String timezone;

	@SerializedName("auth_id")
	private String authID;

	@SerializedName("resource_uri")
	private String resourceURI;

	public Account() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCashCredits() {
		return cashCredits;
	}

	public void setCashCredits(String cashCredits) {
		this.cashCredits = cashCredits;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
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

	public String getPostpaid() {
		return postpaid;
	}

	public void setPostpaid(String postpaid) {
		this.postpaid = postpaid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getAuthID() {
		return authID;
	}

	public void setAuthID(String authID) {
		this.authID = authID;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
}
