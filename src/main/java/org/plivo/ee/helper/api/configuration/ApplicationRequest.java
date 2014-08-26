package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum ApplicationRequest
{

   CREATE(new DefaultRequestTemplate(HttpMethod.GET, GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/AvailableNumberGroup/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.ANSWER_URL, GlobalConstant.APP_NAME,
                     GlobalConstant.ANSWER_METHOD,
                     GlobalConstant.HANGUP_URL,
                     GlobalConstant.HANGUP_METHOD,
                     GlobalConstant.FALLBACK_ANSWER_URL, GlobalConstant.FALLBACK_METHOD,
                     GlobalConstant.MESSAGE_URL,
                     GlobalConstant.MESSAGE_METHOD, GlobalConstant.DEFAULT_NUMBER_APP,
                     GlobalConstant.DEFAULT_ENDPOINT_APP)),

   LIST(new DefaultRequestTemplate(HttpMethod.GET, GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Application/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.SUBACCOUNT, GlobalConstant.LIMIT,
                     GlobalConstant.OFFSET)),

   GET(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Application/{app_id}/")
            .pathParams(GlobalConstant.AUTH_ID)),

   UPDATE(new DefaultRequestTemplate(HttpMethod.POST, GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Application/{app_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.APP_ID).formParams(GlobalConstant.ANSWER_URL,
                     GlobalConstant.ANSWER_METHOD,
                     GlobalConstant.HANGUP_URL,
                     GlobalConstant.HANGUP_METHOD,
                     GlobalConstant.FALLBACK_ANSWER_URL, GlobalConstant.FALLBACK_METHOD,
                     GlobalConstant.MESSAGE_URL, GlobalConstant.MESSAGE_METHOD,
                     GlobalConstant.DEFAULT_NUMBER_APP, GlobalConstant.DEFAULT_ENDPOINT_APP)),

   DELETE(new DefaultRequestTemplate(HttpMethod.DELETE, GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Application/{app_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.APP_ID));

   private DefaultRequestTemplate template;

   ApplicationRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
