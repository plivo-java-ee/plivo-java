package org.plivo.ee.helper.api.client.simple;

import java.util.HashMap;
import java.util.Map;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.account.Account;
import org.plivo.ee.helper.api.response.account.SubAccount;
import org.plivo.ee.helper.api.response.account.SubAccountFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class AccountRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public AccountRestAPI() {

	}

	public AccountRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public AccountRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Account
	public Account getAccount() throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/", new HashMap<String, String>()),
				Account.class);
	}

	public GenericResponse editAccount(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("POST", "/", parameters),
				GenericResponse.class);
	}

	public SubAccountFactory getSubaccounts() throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/Subaccount/", new HashMap<String, String>()),
				SubAccountFactory.class);
	}

	public SubAccount getSubaccount(Map<String, String> parameters)
			throws PlivoException {
		String subauth_id = HttpUtils.getKeyValue(parameters, "subauth_id");
		return this.gson.fromJson(
				request("GET", String.format("/Subaccount/%s/", subauth_id),
						parameters), SubAccount.class);
	}

	public GenericResponse createSubaccount(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("POST", "/Subaccount/", parameters),
				GenericResponse.class);
	}

	public GenericResponse editSubaccount(Map<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("POST", "/Subaccount/", parameters),
				GenericResponse.class);
	}

	public GenericResponse deleteSubaccount(Map<String, String> parameters)
			throws PlivoException {
		String subauth_id = HttpUtils.getKeyValue(parameters, "subauth_id");
		return this.gson.fromJson(
				request("DELETE", String.format("/Subaccount/%s/", subauth_id),
						parameters), GenericResponse.class);
	}
}
