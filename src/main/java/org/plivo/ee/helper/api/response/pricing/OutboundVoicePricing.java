package org.plivo.ee.helper.api.response.pricing;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class OutboundVoicePricing implements Serializable {

	private static final long serialVersionUID = 1L;
	@SerializedName("local")
	private LocalOutboundPricing localOutbound;

	@SerializedName("tollfree")
	public TollfreeOutboundPricing tollfreeOutbound;

	@SerializedName("ip")
	private SipOutboundPricing ipOutbound;

	@SerializedName("rates")
	private ArrayList<RatesPrefixes> prefixesRates;

	public OutboundVoicePricing() {
	}

	public LocalOutboundPricing getLocalOutbound() {
		return localOutbound;
	}

	public void setLocalOutbound(LocalOutboundPricing localOutbound) {
		this.localOutbound = localOutbound;
	}

	public TollfreeOutboundPricing getTollfreeOutbound() {
		return tollfreeOutbound;
	}

	public void setTollfreeOutbound(TollfreeOutboundPricing tollfreeOutbound) {
		this.tollfreeOutbound = tollfreeOutbound;
	}

	public SipOutboundPricing getIpOutbound() {
		return ipOutbound;
	}

	public void setIpOutbound(SipOutboundPricing ipOutbound) {
		this.ipOutbound = ipOutbound;
	}

	public ArrayList<RatesPrefixes> getPrefixesRates() {
		return prefixesRates;
	}

	public void setPrefixesRates(ArrayList<RatesPrefixes> prefixesRates) {
		this.prefixesRates = prefixesRates;
	}
}
