package org.plivo.ee.helper.api.response.pricing;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class RatesPrefixes {
	public String rate ;
	
	@SerializedName("prefix")
	public ArrayList<String> numberPrefixes ;
	
	public RatesPrefixes() {
		// empty
	}

}
