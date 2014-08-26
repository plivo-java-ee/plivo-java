package org.plivo.ee.helper.api.response.endpoint;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Endpoint implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode ;

    private String username ;

    @SerializedName("sip_uri")
    private String sipUri ;
    
    private String alias ;
    
    @SerializedName("endpoint_id")
    private String endpointId ;
    
    private String password ;
    
    @SerializedName("resource_uri")
    private String resourceUri ;
    
    @SerializedName("api_id")
    private String apiId ;
    
    private String error ;
    
    public Endpoint() {
    }

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSipUri() {
		return sipUri;
	}

	public void setSipUri(String sipUri) {
		this.sipUri = sipUri;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEndpointId() {
		return endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
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
