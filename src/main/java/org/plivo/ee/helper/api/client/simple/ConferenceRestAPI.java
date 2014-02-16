package org.plivo.ee.helper.api.client.simple;

import java.util.LinkedHashMap;

import org.plivo.ee.helper.api.common.CommonRestApi;
import org.plivo.ee.helper.api.response.conference.Conference;
import org.plivo.ee.helper.api.response.conference.LiveConferenceFactory;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.api.response.response.Record;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.util.HtmlEntity;
import org.plivo.ee.helper.util.HttpUtils;

import com.google.gson.Gson;

public class ConferenceRestAPI extends CommonRestApi {

	private Gson gson = new Gson();

	public ConferenceRestAPI() {

	}

	public ConferenceRestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			version = LATEST_PLIVO_VERSION;
		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, version, authId);
	}

	public ConferenceRestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;

		this.baseURI = String.format("%s/%s/Account/%s", PLIVO_PROTOCOL
				+ PLIVO_HOST, LATEST_PLIVO_VERSION, authId);
	}

	// Conference
	public LiveConferenceFactory getLiveConferences() throws PlivoException {
		return this.gson.fromJson(
				request("GET", "/Conference/",
						new LinkedHashMap<String, String>()),
				LiveConferenceFactory.class);
	}

	public GenericResponse hangupAllConferences() throws PlivoException {
		return this.gson.fromJson(
				request("DELETE", "/Conference/",
						new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public Conference getLiveConference(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		return this.gson.fromJson(
				request("GET",
						String.format("/Conference/%s/", conference_name),
						new LinkedHashMap<String, String>()), Conference.class);
	}

	public GenericResponse hangupConference(
			LinkedHashMap<String, String> parameters) throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		return this.gson.fromJson(
				request("DELETE",
						String.format("/Conference/%s/", conference_name),
						new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse hangupMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("DELETE", String.format(
						"/Conference/%1$s/Member/%2$s/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse playMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("POST", String.format(
						"/Conference/%1$s/Member/%2$s/Play/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse stopPlayMember(
			LinkedHashMap<String, String> parameters) throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("DELETE", String.format(
						"/Conference/%1$s/Member/%2$s/Play/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse speakMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String text = HtmlEntity.convert(HttpUtils.getKeyValue(parameters,
				"text"));
		parameters.put("text", text);
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("POST", String.format(
						"/Conference/%1$s/Member/%2$s/Speak/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse deafMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String memberId = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("POST", String.format(
						"/Conference/%1$s/Member/%2$s/Deaf/", conference_name,
						memberId), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse undeafMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String memberId = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("DELETE", String.format(
						"/Conference/%1$s/Member/%2$s/Deaf/", conference_name,
						memberId), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse muteMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("POST", String.format(
						"/Conference/%1$s/Member/%2$s/Mute/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse unmuteMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("DELETE", String.format(
						"/Conference/%1$s/Member/%2$s/Mute/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public GenericResponse kickMember(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		String member_id = HttpUtils.getKeyValue(parameters, "member_id");
		return this.gson.fromJson(
				request("POST", String.format(
						"/Conference/%1$s/Member/%2$s/Kick/", conference_name,
						member_id), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

	public Record recordConference(LinkedHashMap<String, String> parameters)
			throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		return this.gson.fromJson(
				request("POST", String.format("/Conference/%s/Record/",
						conference_name), parameters), Record.class);
	}

	public GenericResponse stopRecordConference(
			LinkedHashMap<String, String> parameters) throws PlivoException {
		String conference_name = HttpUtils.getKeyValue(parameters,
				"conference_name");
		return this.gson.fromJson(
				request("DELETE", String.format("/Conference/%s/Record/",
						conference_name), new LinkedHashMap<String, String>()),
				GenericResponse.class);
	}

}
