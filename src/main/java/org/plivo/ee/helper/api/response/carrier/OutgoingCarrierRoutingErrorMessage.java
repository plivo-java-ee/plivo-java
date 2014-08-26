package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierRoutingErrorMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	public List<String> prefixes;
	private List<String> priority;

	@SerializedName("outgoing_carrier")
	private List<String> outgoingCarrier;

	private String error;

	public OutgoingCarrierRoutingErrorMessage() {
	}

	public List<String> getPrefixes() {
		return prefixes;
	}

	public void setPrefixes(List<String> prefixes) {
		this.prefixes = prefixes;
	}

	public List<String> getPriority() {
		return priority;
	}

	public void setPriority(List<String> priority) {
		this.priority = priority;
	}

	public List<String> getOutgoingCarrier() {
		return outgoingCarrier;
	}

	public void setOutgoingCarrier(List<String> outgoingCarrier) {
		this.outgoingCarrier = outgoingCarrier;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}