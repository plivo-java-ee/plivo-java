package org.plivo.ee.helper.api.client.simple;

import java.util.LinkedHashMap;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.call.CDR;
import org.plivo.ee.helper.api.response.call.CDRFactory;
import org.plivo.ee.helper.api.response.call.Call;
import org.plivo.ee.helper.api.response.call.LiveCall;
import org.plivo.ee.helper.api.response.call.LiveCallFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.api.response.response.Record;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HtmlEntity;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class CallRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public CallRestAPI() {

	}

	public CallRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public CallRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Call
	public CDRFactory getCDRs(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("GET", "/Call/", parameters),
				CDRFactory.class);
	}

	public CDR getCDR(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String record_id = HttpUtils.getKeyValue(parameters, "record_id");
		return this.gson.fromJson(
				request("GET", String.format("/Call/%s/", record_id),
						new LinkedHashMap<String, String>()), CDR.class);
	}

	public LiveCallFactory getLiveCalls() throws PlivoException {
		LinkedHashMap<String, String> parameters = new LinkedHashMap<String, String>();
		parameters.put("status", "live");
		return this.gson.fromJson(request("GET", "/Call/", parameters),
				LiveCallFactory.class);
	}

	public LiveCall getLiveCall(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		parameters.put("status", "live");
		return this.gson.fromJson(
				request("GET", String.format("/Call/%s/", call_uuid),
						parameters), LiveCall.class);
	}

	public Call makeCall(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		return this.gson.fromJson(request("POST", "/Call/", parameters),
				Call.class);
	}

	public GenericResponse hangupAllCalls() throws PlivoException {
		return this.gson
				.fromJson(
						request("DELETE", "/Call/",
								new LinkedHashMap<String, String>()),
						GenericResponse.class);
	}

	public GenericResponse hangupCall(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("DELETE", String.format("/Call/%s/", call_uuid),
						new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse transferCall(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("POST", String.format("/Call/%s/", call_uuid),
						parameters), GenericResponse.class);
	}

	public Record record(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("POST", String.format("/Call/%s/Record/", call_uuid),
						parameters), Record.class);
	}

	public GenericResponse stopRecord(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("DELETE", String.format("/Call/%s/Record/", call_uuid),
						new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse play(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("POST", String.format("/Call/%s/Play/", call_uuid),
						parameters), GenericResponse.class);
	}

	public GenericResponse stopPlay(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("DELETE", String.format("/Call/%s/Play/", call_uuid),
						new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse speak(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String text = HtmlEntity.convert(HttpUtils.getKeyValue(parameters,
				"text"));
		parameters.put("text", text);
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("POST", String.format("/Call/%s/Speak/", call_uuid),
						parameters), GenericResponse.class);
	}

	public GenericResponse stopSpeak(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("DELETE", String.format("/Call/%s/Speak/", call_uuid),
						new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse sendDigits(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String call_uuid = HttpUtils.getKeyValue(parameters, "call_uuid");
		return this.gson.fromJson(
				request("POST", String.format("/Call/%s/DTMF/", call_uuid),
						parameters), GenericResponse.class);
	}
}
