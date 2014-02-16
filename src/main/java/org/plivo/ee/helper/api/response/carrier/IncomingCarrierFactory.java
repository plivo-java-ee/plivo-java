package org.plivo.ee.helper.api.response.carrier;

import java.util.List;

import org.plivo.ee.helper.api.response.carrier.IncomingCarrier;
import org.plivo.ee.helper.api.response.carrier.IncomingCarrierMeta;

import com.google.gson.annotations.SerializedName;

public class IncomingCarrierFactory {
	public IncomingCarrierMeta meta ;

    @SerializedName("api_id")
    public String apiId ;
    
    @SerializedName("objects")
    public List<IncomingCarrier> incomingCarrierList ;
    
    public String error;
    
    public IncomingCarrierFactory() {
    	// empty
    }
}
