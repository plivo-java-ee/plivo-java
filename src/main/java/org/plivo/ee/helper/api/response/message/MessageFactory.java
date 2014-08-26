package org.plivo.ee.helper.api.response.message;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MessageFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode;

	private MessageMeta meta;

	@SerializedName("api_id")
	private String apiId;

	@SerializedName("objects")
	private List<Message> messageList;

	private String error;

	public MessageFactory() {
	}

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public MessageMeta getMeta() {
		return meta;
	}

	public void setMeta(MessageMeta meta) {
		this.meta = meta;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
