package org.plivo.ee.helper.api.response.carrier;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierErrorMessage implements Serializable {

	private static final long serialVersionUID = 1L;
    @SerializedName("name")
    private List<String> name ;
    
    @SerializedName("address")
    private List<String> address ;
    
    private String error;
    
    public OutgoingCarrierErrorMessage() {
    }

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}