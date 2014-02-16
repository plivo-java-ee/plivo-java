package org.plivo.ee.helper.api.response.carrier;

import java.util.List;

import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRouting;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingMeta;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierRoutingFactory {
	@SerializedName("server_code")
	public Integer serverCode ;

	public OutgoingCarrierRoutingMeta meta ;

    @SerializedName("api_id")
    public String apiId ;
    
    @SerializedName("objects")
    public List<OutgoingCarrierRouting> outgoingCarrierRoutingList ;
    
    public String error;
    
    public OutgoingCarrierRoutingFactory() {
    	// empty
    }
}
