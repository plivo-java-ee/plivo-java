package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;

import org.plivo.ee.helper.api.response.pricing.LocalNumberRental;
import org.plivo.ee.helper.api.response.pricing.TollFreeNumberRental;

import com.google.gson.annotations.SerializedName;

public class PhoneNumbers implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("local")
	private LocalNumberRental localMonthlyRental;

	@SerializedName("tollfree")
	private TollFreeNumberRental tollfreeMonthlyRental;

	public PhoneNumbers() {
	}

	public LocalNumberRental getLocalMonthlyRental() {
		return localMonthlyRental;
	}

	public void setLocalMonthlyRental(LocalNumberRental localMonthlyRental) {
		this.localMonthlyRental = localMonthlyRental;
	}

	public TollFreeNumberRental getTollfreeMonthlyRental() {
		return tollfreeMonthlyRental;
	}

	public void setTollfreeMonthlyRental(
			TollFreeNumberRental tollfreeMonthlyRental) {
		this.tollfreeMonthlyRental = tollfreeMonthlyRental;
	}
}
