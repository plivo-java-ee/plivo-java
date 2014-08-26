package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

/**
 * The Call API is one of the core APIs of the Plivo platform which lets you initiate outbound calls. It also lets you
 * view live calls, retrive call logs and transfer ongoing calls to a different flow.
 * 
 * @author pisi79
 * 
 */
public enum CallRequest
{

   GET(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/")
            .pathParams(GlobalConstant.AUTH_ID)),

   MAKE_OUTBOUND_CALL(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/").pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.FROM,
            GlobalConstant.TO,
            GlobalConstant.ANSWER_URL,
            GlobalConstant.ANSWER_METHOD, GlobalConstant.RING_URL, GlobalConstant.RING_METHOD,
            GlobalConstant.HANGUP_URL,
            GlobalConstant.HANGUP_METHOD,
            GlobalConstant.FALLBACK_URL,
            GlobalConstant.FALLBACK_METHOD, GlobalConstant.CALLER_NAME, GlobalConstant.SEND_DIGITS,
            GlobalConstant.SEND_ON_PREANSWER, GlobalConstant.TIME_LIMIT, GlobalConstant.HANGUP_ON_RING,
            GlobalConstant.MACHINE_DETECTION,
            GlobalConstant.MACHINE_DETECTION_TIME,
            GlobalConstant.MACHINE_DETECTION_URL, GlobalConstant.MACHINE_DETECTION_METHOD,
            GlobalConstant.SIP_HEADERS, GlobalConstant.RING_TIMEOUT)),

   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/").pathParams(GlobalConstant.AUTH_ID).queryParams(GlobalConstant.SUBACCOUNT,
            GlobalConstant.CALL_DIRECTION,
            GlobalConstant.FROM_NUMBER, GlobalConstant.TO_NUMBER, GlobalConstant.BILL_DURATION,
            GlobalConstant.BILL_DURATION_GT,
            GlobalConstant.BILL_DURATION_GTE,
            GlobalConstant.BILL_DURATION_LT, GlobalConstant.BILL_DURATION_LTE,
            GlobalConstant.END_TIME, GlobalConstant.END_TIME_GT, GlobalConstant.END_TIME_GTE,
            GlobalConstant.END_TIME_LT, GlobalConstant.END_TIME_LTE, GlobalConstant.LIMIT, GlobalConstant.OFFSET
            )),

   GET_RECORD(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/").pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CALL_UUID)
            .queryParams(
                     GlobalConstant.SUBACCOUNT,
                     GlobalConstant.LIMIT,
                     GlobalConstant.OFFSET)),

   LIST_LIVE_CALLS(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/?status=live").pathParams(GlobalConstant.AUTH_ID)),

   GET_LIVE_CALL(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/?status=live").pathParams(GlobalConstant.AUTH_ID,
            GlobalConstant.CALL_UUID)),

   HANGUP(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Request/{request_uuid}/").pathParams(GlobalConstant.AUTH_ID,
            GlobalConstant.REQUEST_UUID)),

   HANGUP_REQUEST(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/").pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CALL_UUID)),

   TRANSFER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/").pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CALL_UUID)
            .formParams(
                     GlobalConstant.LEGS,
                     GlobalConstant.ALEG_URL, GlobalConstant.ALEG_METHOD, GlobalConstant.BLEG_URL,
                     GlobalConstant.BLEG_METHOD)),

   SEND_DIGITS(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/DTMF/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CALL_UUID).formParams(
                     "digits", GlobalConstant.LEGS)),

   PLAY_MP3(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/Play/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CALL_UUID).formParams(
                     "urls", "length", GlobalConstant.LEGS, GlobalConstant.LOOP, GlobalConstant.MIX)),

   STOP_PLAY_MP3(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/Play/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CALL_UUID)),

   RECORD_CALL(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/Record/").pathParams(GlobalConstant.AUTH_ID,
            GlobalConstant.CALL_UUID)
            .formParams(
                     GlobalConstant.TIME_LIMIT, GlobalConstant.FILE_FORMAT, GlobalConstant.TRANSCRIPTION_TYPE,
                     GlobalConstant.TRANSCRIPTION_URL,
                     GlobalConstant.TRANSCRIPTION_METHOD,
                     GlobalConstant.CALLBACK_URL, GlobalConstant.CALLBACK_METHOD)),

   STOP_RECORD_CALL(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/Record/").pathParams(GlobalConstant.AUTH_ID,
            GlobalConstant.CALL_UUID)
            .formParams("URL")),

   SPEAK_TXT(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/Speak/").pathParams(GlobalConstant.AUTH_ID,
            GlobalConstant.CALL_UUID)
            .formParams(
                     GlobalConstant.TEXT, GlobalConstant.VOICE, GlobalConstant.LANGUAGE, GlobalConstant.LEGS,
                     GlobalConstant.LOOP, GlobalConstant.MIX)),

   STOP_SPEAK_TXT(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Call/{call_uuid}/Speak/").pathParams(GlobalConstant.AUTH_ID,
            GlobalConstant.CALL_UUID)),

   ;

   private DefaultRequestTemplate template;

   CallRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}