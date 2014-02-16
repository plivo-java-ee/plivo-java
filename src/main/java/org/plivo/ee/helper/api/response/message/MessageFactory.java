package org.plivo.ee.helper.api.response.message;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MessageFactory {
	@SerializedName("server_code")
	public Integer serverCode ;

    public MessageMeta meta ;

    @SerializedName("api_id")
    public String apiId ;
    
    @SerializedName("objects")
    public List<Message> messageList ;
    
    public String error;
    
    public MessageFactory() {
        // empty
    }
}
