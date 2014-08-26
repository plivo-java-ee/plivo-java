package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RatesPrefixes implements Serializable {

	private static final long serialVersionUID = 1L;
	private String rate;

	@SerializedName("prefix")
	private List<String> numberPrefixes;

	public RatesPrefixes() {
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public List<String> getNumberPrefixes() {
		return numberPrefixes;
	}

	public void setNumberPrefixes(List<String> numberPrefixes) {
		this.numberPrefixes = numberPrefixes;
	}

}
