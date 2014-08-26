package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;

public class LocalNumberRental implements Serializable {

	private static final long serialVersionUID = 1L;
	private String rate;

	public LocalNumberRental() {
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
}
