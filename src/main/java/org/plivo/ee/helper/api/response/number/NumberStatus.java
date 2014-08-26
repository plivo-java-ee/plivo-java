package org.plivo.ee.helper.api.response.number;

import java.io.Serializable;

public class NumberStatus implements Serializable {

	private static final long serialVersionUID = 1L;
	private String number;

	public String status;

	public NumberStatus() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
