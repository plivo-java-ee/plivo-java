package org.plivo.ee.helper.api.response.pricing;

import org.plivo.ee.helper.api.response.pricing.LocalNumberRental;
import org.plivo.ee.helper.api.response.pricing.TollFreeNumberRental;

import com.google.gson.annotations.SerializedName;

public class PhoneNumbers {
	@SerializedName("local")
	public LocalNumberRental localMonthlyRental ;

	@SerializedName("tollfree")
	public TollFreeNumberRental tollfreeMonthlyRental ;
	
	public PhoneNumbers() {
		// TODO Auto-generated constructor stub
	}
}
