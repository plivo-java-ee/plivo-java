package org.plivo.ee.helper.api;

//Exceptions
import java.util.Map;

import org.plivo.ee.helper.api.client.simple.AccountRestAPI;
import org.plivo.ee.helper.api.client.simple.ApplicationRestAPI;
import org.plivo.ee.helper.api.client.simple.CallRestAPI;
import org.plivo.ee.helper.api.client.simple.ConferenceRestAPI;
import org.plivo.ee.helper.api.client.simple.EndpointRestAPI;
import org.plivo.ee.helper.api.client.simple.IncomingCarrierRestAPI;
import org.plivo.ee.helper.api.client.simple.MessageRestAPI;
import org.plivo.ee.helper.api.client.simple.NumberRestAPI;
import org.plivo.ee.helper.api.client.simple.OutgoingCarrierRestAPI;
import org.plivo.ee.helper.api.client.simple.OutgoingCarrierRoutingRestAPI;
import org.plivo.ee.helper.api.client.simple.PricingRestAPI;
import org.plivo.ee.helper.api.response.account.Account;
import org.plivo.ee.helper.api.response.account.SubAccount;
import org.plivo.ee.helper.api.response.account.SubAccountFactory;
import org.plivo.ee.helper.api.response.application.Application;
import org.plivo.ee.helper.api.response.application.ApplicationFactory;
import org.plivo.ee.helper.api.response.call.CDR;
import org.plivo.ee.helper.api.response.call.CDRFactory;
import org.plivo.ee.helper.api.response.call.Call;
import org.plivo.ee.helper.api.response.call.LiveCall;
import org.plivo.ee.helper.api.response.call.LiveCallFactory;
import org.plivo.ee.helper.api.response.carrier.IncomingCarrier;
import org.plivo.ee.helper.api.response.carrier.IncomingCarrierFactory;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrier;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierCreatedResponse;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierFactory;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRouting;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingCreatedResponse;
import org.plivo.ee.helper.api.response.carrier.OutgoingCarrierRoutingFactory;
import org.plivo.ee.helper.api.response.conference.Conference;
import org.plivo.ee.helper.api.response.conference.LiveConferenceFactory;
import org.plivo.ee.helper.api.response.endpoint.Endpoint;
import org.plivo.ee.helper.api.response.endpoint.EndpointFactory;
import org.plivo.ee.helper.api.response.message.Message;
import org.plivo.ee.helper.api.response.message.MessageFactory;
import org.plivo.ee.helper.api.response.message.MessageResponse;
import org.plivo.ee.helper.api.response.number.NumberGroupFactory;
import org.plivo.ee.helper.api.response.number.NumberResponse;
import org.plivo.ee.helper.api.response.number.NumberSearchFactory;
import org.plivo.ee.helper.api.response.pricing.PlivoPricing;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.api.response.response.Record;
import org.plivo.ee.helper.exception.PlivoException;

public class RestAPI {
	private static final String LATEST_PLIVO_VERSION = "v1";

	private String authId;
	private String authToken;
	private String version;

	public RestAPI() {

	}

	public RestAPI(String authId, String authToken, String version) {
		this.authId = authId;
		this.authToken = authToken;
		if (version == null || version.trim().isEmpty())
			this.version = LATEST_PLIVO_VERSION;
		else
			this.version = version;
	}

	public RestAPI(String authId, String authToken) {
		this.authId = authId;
		this.authToken = authToken;
		this.version = LATEST_PLIVO_VERSION;
	}

	// Internal methods
	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	// Account
	public Account getAccount() throws PlivoException {
		return new AccountRestAPI(authId, authToken, version).getAccount();
	}

	public GenericResponse editAccount(Map<String, String> parameters)
			throws PlivoException {
		return new AccountRestAPI(authId, authToken, version)
				.editAccount(parameters);
	}

	public SubAccountFactory getSubaccounts() throws PlivoException {
		return new AccountRestAPI(authId, authToken, version).getSubaccounts();
	}

	public SubAccount getSubaccount(Map<String, String> parameters)
			throws PlivoException {
		return new AccountRestAPI(authId, authToken, version)
				.getSubaccount(parameters);
	}

	public GenericResponse createSubaccount(Map<String, String> parameters)
			throws PlivoException {
		return new AccountRestAPI(authId, authToken)
				.createSubaccount(parameters);
	}

	public GenericResponse editSubaccount(Map<String, String> parameters)
			throws PlivoException {
		return new AccountRestAPI(authId, authToken, version)
				.editSubaccount(parameters);
	}

	public GenericResponse deleteSubaccount(Map<String, String> parameters)
			throws PlivoException {
		return new AccountRestAPI(authId, authToken)
				.deleteSubaccount(parameters);
	}

	// Application
	public ApplicationFactory getApplications() throws PlivoException {
		return new ApplicationRestAPI(authId, authToken, version)
				.getApplications();
	}

	public Application getApplication(Map<String, String> parameters)
			throws PlivoException {
		return new ApplicationRestAPI(authId, authToken)
				.getApplication(parameters);
	}

	public GenericResponse createApplication(Map<String, String> parameters)
			throws PlivoException {
		return new ApplicationRestAPI(authId, authToken)
				.createApplication(parameters);
	}

	public GenericResponse editApplication(Map<String, String> parameters)
			throws PlivoException {
		return new ApplicationRestAPI(authId, authToken)
				.editApplication(parameters);
	}

	public GenericResponse deleteApplication(Map<String, String> parameters)
			throws PlivoException {
		return new ApplicationRestAPI(authId, authToken)
				.deleteApplication(parameters);
	}

	// Call
	public CDRFactory getCDRs(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version).getCDRs(parameters);
	}

	public CDR getCDR(Map<String, String> parameters) throws PlivoException {
		return new CallRestAPI(authId, authToken, version).getCDR(parameters);
	}

	public LiveCallFactory getLiveCalls() throws PlivoException {
		return new CallRestAPI(authId, authToken, version).getLiveCalls();
	}

	public LiveCall getLiveCall(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version)
				.getLiveCall(parameters);
	}

	public Call makeCall(Map<String, String> parameters) throws PlivoException {
		return new CallRestAPI(authId, authToken, version).makeCall(parameters);
	}

	public GenericResponse hangupAllCalls() throws PlivoException {
		return new CallRestAPI(authId, authToken, version).hangupAllCalls();
	}

	public GenericResponse hangupCall(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version)
				.hangupCall(parameters);
	}

	public GenericResponse transferCall(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version)
				.transferCall(parameters);
	}

	public Record record(Map<String, String> parameters) throws PlivoException {
		return new CallRestAPI(authId, authToken, version).record(parameters);
	}

	public GenericResponse stopRecord(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version)
				.stopRecord(parameters);
	}

	public GenericResponse play(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version).play(parameters);
	}

	public GenericResponse stopPlay(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version).stopPlay(parameters);
	}

	public GenericResponse speak(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version).speak(parameters);
	}

	public GenericResponse stopSpeak(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version)
				.stopSpeak(parameters);
	}

	public GenericResponse sendDigits(Map<String, String> parameters)
			throws PlivoException {
		return new CallRestAPI(authId, authToken, version)
				.sendDigits(parameters);
	}

	// Conference
	public LiveConferenceFactory getLiveConferences() throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.getLiveConferences();
	}

	public GenericResponse hangupAllConferences() throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.hangupAllConferences();
	}

	public Conference getLiveConference(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.getLiveConference(parameters);
	}

	public GenericResponse hangupConference(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.hangupConference(parameters);
	}

	public GenericResponse hangupMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.hangupMember(parameters);
	}

	public GenericResponse playMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.playMember(parameters);
	}

	public GenericResponse stopPlayMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.stopPlayMember(parameters);
	}

	public GenericResponse speakMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.speakMember(parameters);
	}

	public GenericResponse deafMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.deafMember(parameters);
	}

	public GenericResponse undeafMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.undeafMember(parameters);
	}

	public GenericResponse muteMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.muteMember(parameters);
	}

	public GenericResponse unmuteMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.unmuteMember(parameters);
	}

	public GenericResponse kickMember(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken, version)
				.kickMember(parameters);
	}

	public Record recordConference(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.recordConference(parameters);
	}

	public GenericResponse stopRecordConference(Map<String, String> parameters)
			throws PlivoException {
		return new ConferenceRestAPI(authId, authToken)
				.stopRecordConference(parameters);
	}

	// Endpoint
	public EndpointFactory getEndpoints(Map<String, String> parameters)
			throws PlivoException {
		return new EndpointRestAPI(authId, authToken, version)
				.getEndpoints(parameters);
	}

	public GenericResponse createEndpoint(Map<String, String> parameters)
			throws PlivoException {
		return new EndpointRestAPI(authId, authToken)
				.createEndpoint(parameters);
	}

	public Endpoint getEndpoint(Map<String, String> parameters)
			throws PlivoException {
		return new EndpointRestAPI(authId, authToken, version)
				.getEndpoint(parameters);
	}

	public GenericResponse editEndpoint(Map<String, String> parameters)
			throws PlivoException {
		return new EndpointRestAPI(authId, authToken)
				.createEndpoint(parameters);
	}

	public GenericResponse deleteEndpoint(Map<String, String> parameters)
			throws PlivoException {
		return new EndpointRestAPI(authId, authToken)
				.deleteEndpoint(parameters);
	}

	// Number
	public NumberSearchFactory getNumbers() throws PlivoException {
		return new NumberRestAPI(authId, authToken, version).getNumbers();
	}

	public NumberSearchFactory getNumbers(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken, version).getNumbers();
	}

	@Deprecated
	public NumberSearchFactory searchNumbers(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken, version)
				.searchNumbers(parameters);
	}

	@Deprecated
	public GenericResponse rentNumber(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken, version)
				.rentNumber(parameters);
	}

	public NumberGroupFactory searchNumberGroups(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken)
				.searchNumberGroups(parameters);
	}

	public NumberResponse rentNumbers(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken, version)
				.rentNumbers(parameters);
	}

	public GenericResponse unRentNumber(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken, version)
				.unRentNumber(parameters);
	}

	public GenericResponse linkApplicationNumber(Map<String, String> parameters)
			throws PlivoException {
		return new NumberRestAPI(authId, authToken)
				.linkApplicationNumber(parameters);
	}

	public GenericResponse unlinkApplicationNumber(
			Map<String, String> parameters) throws PlivoException {
		return new NumberRestAPI(authId, authToken)
				.unlinkApplicationNumber(parameters);
	}

	// Message
	public MessageResponse sendMessage(Map<String, String> parameters)
			throws PlivoException {
		return new MessageRestAPI(authId, authToken, version)
				.sendMessage(parameters);
	}

	public Message getMessage(Map<String, String> parameters)
			throws PlivoException {
		return new MessageRestAPI(authId, authToken, version)
				.getMessage(parameters);
	}

	public MessageFactory getMessages() throws PlivoException {
		return new MessageRestAPI(authId, authToken, version).getMessages();
	}

	public MessageFactory getMessages(Map<String, String> parameters)
			throws PlivoException {
		return new MessageRestAPI(authId, authToken, version)
				.getMessages(parameters);
	}

	// Incoming Carrier
	public IncomingCarrierFactory getIncomingCarriers(
			Map<String, String> parameters) throws PlivoException {
		return new IncomingCarrierRestAPI().getIncomingCarriers(parameters);
	}

	public IncomingCarrier getIncomingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new IncomingCarrierRestAPI().getIncomingCarrier(parameters);
	}

	public GenericResponse addIncomingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new IncomingCarrierRestAPI().addIncomingCarrier(parameters);
	}

	public GenericResponse editIncomingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new IncomingCarrierRestAPI().editIncomingCarrier(parameters);
	}

	public GenericResponse dropIncomingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new IncomingCarrierRestAPI().dropIncomingCarrier(parameters);
	}

	// Outgoing Carrier
	public OutgoingCarrierFactory getOutgoingCarriers(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRestAPI(authId, authToken)
				.getOutgoingCarriers(parameters);
	}

	public OutgoingCarrier getOutgoingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new OutgoingCarrierRestAPI(authId, authToken)
				.getOutgoingCarrier(parameters);
	}

	public OutgoingCarrierCreatedResponse addOutgoingCarrier(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRestAPI(authId, authToken)
				.addOutgoingCarrier(parameters);
	}

	public GenericResponse editOutgoingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new OutgoingCarrierRestAPI(authId, authToken)
				.editOutgoingCarrier(parameters);
	}

	public GenericResponse dropOutgoingCarrier(Map<String, String> parameters)
			throws PlivoException {
		return new OutgoingCarrierRestAPI(authId, authToken)
				.dropOutgoingCarrier(parameters);
	}

	// Outgoing Carrier Routing
	public OutgoingCarrierRoutingFactory getOutgoingCarrierRoutings(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRoutingRestAPI()
				.getOutgoingCarrierRoutings(parameters);
	}

	public OutgoingCarrierRouting getOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRoutingRestAPI()
				.getOutgoingCarrierRouting(parameters);
	}

	public OutgoingCarrierRoutingCreatedResponse addOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRoutingRestAPI()
				.addOutgoingCarrierRouting(parameters);
	}

	public GenericResponse editOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRoutingRestAPI()
				.editOutgoingCarrierRouting(parameters);
	}

	public GenericResponse dropOutgoingCarrierRouting(
			Map<String, String> parameters) throws PlivoException {
		return new OutgoingCarrierRoutingRestAPI()
				.dropOutgoingCarrierRouting(parameters);
	}

	// Pricing
	public PlivoPricing getPricing(Map<String, String> parameters)
			throws PlivoException {
		return new PricingRestAPI(authId, authToken, version)
				.getPricing(parameters);
	}

}
