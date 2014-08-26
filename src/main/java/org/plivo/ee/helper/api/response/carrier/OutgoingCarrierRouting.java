package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierRouting implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("server_code")
	private Integer serverCode ;

    @SerializedName("api_id")
    private String apiId ;
    
    @SerializedName("routing_id")
    private String routingId ;
    
    @SerializedName("digits")
    private String digits ;
    
    @SerializedName("priority")
    private String priority ;
    
    @SerializedName("outgoing_carrier")
    private String outgoingCarrier ;
    
    @SerializedName("resource_uri")
    private String resourceUri ;
    
    public OutgoingCarrierRouting() {
    }

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getRoutingId() {
		return routingId;
	}

	public void setRoutingId(String routingId) {
		this.routingId = routingId;
	}

	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getOutgoingCarrier() {
		return outgoingCarrier;
	}

	public void setOutgoingCarrier(String outgoingCarrier) {
		this.outgoingCarrier = outgoingCarrier;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}
}
