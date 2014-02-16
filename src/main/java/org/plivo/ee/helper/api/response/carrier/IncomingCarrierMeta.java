package org.plivo.ee.helper.api.response.carrier;

import com.google.gson.annotations.SerializedName;

public class IncomingCarrierMeta {
    public String previous ;

    @SerializedName("total_count")
    public Integer totalCount ;
    
    public Integer offset ;
    
    public Integer limit ;
    
    public String next ;
    
    public IncomingCarrierMeta() {
        // empty
    }

}