package org.plivo.ee.helper.api.response.carrier;

import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierErrorMessage;

import com.google.gson.annotations.SerializedName;


public class OutgoingCarrierCreatedResponse {
	@SerializedName("server_code")
	public Integer serverCode ;

	@SerializedName("api_id")
	public String apiId ;

    @SerializedName("carrier_id")
    public Object carrierId ;
    
	public String message ;

	public OutgoingCarrierErrorMessage error ;
    
    public OutgoingCarrierCreatedResponse() {
        // empty
    }
}

