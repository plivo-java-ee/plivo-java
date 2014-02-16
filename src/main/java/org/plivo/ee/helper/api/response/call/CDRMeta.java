package org.plivo.ee.helper.api.response.call;

import com.google.gson.annotations.SerializedName;

public class CDRMeta {
    public String previous ;
    
    @SerializedName("total_count")
    public Integer totalCount ;
    
    public Integer offset ;
    
    public Integer limit ;
    
    public String next ;
    
    public CDRMeta() {
        // empty
    }
}
