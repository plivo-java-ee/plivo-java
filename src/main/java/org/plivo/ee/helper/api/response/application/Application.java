package org.plivo.ee.helper.api.response.application;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Application implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	@SerializedName("fallback_method")
	private String fallbackMethod;

	@SerializedName("default_app")
	private Boolean isDefaultApplication;

	@SerializedName("app_name")
	private String applicationName;

	@SerializedName("production_app")
	private Boolean isProductionApplication;

	@SerializedName("app_id")
	private String applicationID;

	@SerializedName("hangup_url")
	private String hangupUrl;

	@SerializedName("answer_url")
	private String answerUrl;

	@SerializedName("message_url")
	private String messageUrl;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("answer_method")
	private String answerMethod;

	@SerializedName("hangup_method")
	private String hangupMethod;

	@SerializedName("message_method")
	private String messageMethod;

	@SerializedName("fallback_answer_url")
	private String fallbackAnswerUrl;

	private String error;

	public Application() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getFallbackMethod() {
		return fallbackMethod;
	}

	public void setFallbackMethod(String fallbackMethod) {
		this.fallbackMethod = fallbackMethod;
	}

	public Boolean getIsDefaultApplication() {
		return isDefaultApplication;
	}

	public void setIsDefaultApplication(Boolean isDefaultApplication) {
		this.isDefaultApplication = isDefaultApplication;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public Boolean getIsProductionApplication() {
		return isProductionApplication;
	}

	public void setIsProductionApplication(Boolean isProductionApplication) {
		this.isProductionApplication = isProductionApplication;
	}

	public String getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public String getHangupUrl() {
		return hangupUrl;
	}

	public void setHangupUrl(String hangupUrl) {
		this.hangupUrl = hangupUrl;
	}

	public String getAnswerUrl() {
		return answerUrl;
	}

	public void setAnswerUrl(String answerUrl) {
		this.answerUrl = answerUrl;
	}

	public String getMessageUrl() {
		return messageUrl;
	}

	public void setMessageUrl(String messageUrl) {
		this.messageUrl = messageUrl;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getAnswerMethod() {
		return answerMethod;
	}

	public void setAnswerMethod(String answerMethod) {
		this.answerMethod = answerMethod;
	}

	public String getHangupMethod() {
		return hangupMethod;
	}

	public void setHangupMethod(String hangupMethod) {
		this.hangupMethod = hangupMethod;
	}

	public String getMessageMethod() {
		return messageMethod;
	}

	public void setMessageMethod(String messageMethod) {
		this.messageMethod = messageMethod;
	}

	public String getFallbackAnswerUrl() {
		return fallbackAnswerUrl;
	}

	public void setFallbackAnswerUrl(String fallbackAnswerUrl) {
		this.fallbackAnswerUrl = fallbackAnswerUrl;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}