package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum ConferenceRequest
{

   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Conference/")
            .pathParams(GlobalConstant.AUTH_ID)),

   GET(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Conference/{conference_name}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME)),

   HANGUP(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Subaccount/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.NAME, GlobalConstant.ENABLED)),

   HANGUP_ALL(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Subaccount/{subauth_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.SUBAUTH_ID).formParams(GlobalConstant.NAME,
                     GlobalConstant.ENABLED)),

   HANGUP_MEMBER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   KICK_MEMBER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Kick/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   MUTE_MEMBER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Mute/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   UNMUTE_MEMBER(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Mute/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   PLAY_SOUND_MEMBER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Play/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID).formParams(
                     GlobalConstant.URL)),

   STOP_PLAY_SOUND_MEMBER(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Play/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   PLAY_TEXT_MEMBER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Speak/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)
            .formParams(GlobalConstant.TEXT, GlobalConstant.VOICE, GlobalConstant.LANGUAGE)),

   STOP_PLAY_TEXT_MEMBER(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Speak/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   MAKE_DEAF_MEMBER(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Deaf/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   STOP_MAKE_DEAF_MEMBER(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Deaf/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   START_RECORD_CONFERENCE(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Record/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID).formParams(
                     GlobalConstant.FILE_FORMAT,
                     GlobalConstant.TRANSCRIPTION_TYPE, GlobalConstant.TRANSCRIPTION_URL,
                     GlobalConstant.TRANSCRIPTION_METHOD, GlobalConstant.CALLBACK_URL,
                     GlobalConstant.CALLBACK_METHOD)),

   STOP_RECORD_CONFERENCE(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Conference/{conference_name}/Record/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.CONFERENCE_NAME, GlobalConstant.MEMBER_ID)),

   ;

   private DefaultRequestTemplate template;

   ConferenceRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
