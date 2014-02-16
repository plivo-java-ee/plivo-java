package org.plivo.ee.helper.api.response.carrier;

import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingErrorMessage;

import com.google.gson.annotations.SerializedName;


public class OutgoingCarrierRoutingCreatedResponse {
	@SerializedName("server_code")
	public Integer serverCode ;

	@SerializedName("api_id")
	public String apiId ;

    public Object routes ;
    
	public String message ;

	public OutgoingCarrierRoutingErrorMessage error ;
    
    public OutgoingCarrierRoutingCreatedResponse() {
        // empty
    }
}

