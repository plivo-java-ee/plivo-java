package org.plivo.ee.helper.api.response.application;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ApplicationFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode ;

   @SerializedName("objects")
    private List<Application> applicationList ;
    
    @SerializedName("meta")
    private ApplicationMeta meta ;
    
    @SerializedName("api_id")
    private String apiId ;
    
    private String error ;
    
    public ApplicationFactory() {
    }

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public List<Application> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}

	public ApplicationMeta getMeta() {
		return meta;
	}

	public void setMeta(ApplicationMeta meta) {
		this.meta = meta;
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
