package org.plivo.ee.helper.api.response.call;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Call implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode ;

    private String message;
    
    @SerializedName("request_uuid")
    private String requestUUID ;
    
    @SerializedName("api_id")
    private String apiId ;
    
    private String error;
    
    public Call() {
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

	public String getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
