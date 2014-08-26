package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	public String account_type;
	public String address;
	public String api_id;
	public String auth_id;
	public String auto_recharge;
	public String billing_mode;
	public String cash_credits;
	public String city;
	public String name;
	public String resource_uri;
	public String state;
	public String timezone;

	public Account() {
	}

	@Override
	public String toString() {
		return "Account ["
				+ (account_type != null ? "account_type=" + account_type + ", "
						: "")
				+ (address != null ? "address=" + address + ", " : "")
				+ (api_id != null ? "api_id=" + api_id + ", " : "")
				+ (auth_id != null ? "auth_id=" + auth_id + ", " : "")
				+ (auto_recharge != null ? "auto_recharge=" + auto_recharge
						+ ", " : "")
				+ (billing_mode != null ? "billing_mode=" + billing_mode + ", "
						: "")
				+ (cash_credits != null ? "cash_credits=" + cash_credits + ", "
						: "")
				+ (city != null ? "city=" + city + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (resource_uri != null ? "resource_uri=" + resource_uri + ", "
						: "") + (state != null ? "state=" + state + ", " : "")
				+ (timezone != null ? "timezone=" + timezone : "") + "]";
	}

}
