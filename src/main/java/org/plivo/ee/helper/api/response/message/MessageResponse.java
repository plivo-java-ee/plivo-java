package org.plivo.ee.helper.api.response.message;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MessageResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private String message;

	@SerializedName("message_uuid")
	private List<String> messageUuids;

	private String error;

	@SerializedName("api_id")
	private String apiId;

	public MessageResponse() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getMessageUuids() {
		return messageUuids;
	}

	public void setMessageUuids(List<String> messageUuids) {
		this.messageUuids = messageUuids;
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
}
