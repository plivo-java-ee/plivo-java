package org.plivo.ee.helper.api.response.carrier;

import java.util.List;

import org.plivo.ee.helper.api.response.carrier.OutgoingCarrier;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierMeta;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierFactory {
	@SerializedName("server_code")
	public Integer serverCode ;

	public OutgoingCarrierMeta meta ;

    @SerializedName("api_id")
    public String apiId ;
    
    @SerializedName("objects")
    public List<OutgoingCarrier> outgoingCarrierList ;
    
    public String error;
    
    public OutgoingCarrierFactory() {
    	// empty
    }
}
