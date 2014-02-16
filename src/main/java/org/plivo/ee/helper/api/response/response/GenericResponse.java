package org.plivo.ee.helper.api.response.response;

import com.google.gson.annotations.SerializedName;

public class GenericResponse {
	@SerializedName("server_code")
	public Integer serverCode ;

    public String message ;
    
    public String error ;
    
    @SerializedName("api_id")
    public String apiId ;
    
    public GenericResponse() {
        // empty
    }
}
