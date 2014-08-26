package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum SubaccountRequest
{

   CREATE(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Subaccount/").pathParams(GlobalConstant.AUTH_ID)
            .formParams(GlobalConstant.NAME, GlobalConstant.ENABLED)),

   UPDATE(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Subaccount/{subauth_id}/").pathParams(
            GlobalConstant.AUTH_ID, GlobalConstant.SUBAUTH_ID).formParams(GlobalConstant.NAME, GlobalConstant.ENABLED)),

   GET(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Subaccount/{subauth_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.SUBAUTH_ID)),

   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Subaccount/")
            .pathParams(GlobalConstant.AUTH_ID).queryParams(GlobalConstant.LIMIT, GlobalConstant.OFFSET)),

   DELETE(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "v1/Account/{auth_id}/Subaccount/{subauth_id}/").pathParams(
            GlobalConstant.AUTH_ID, GlobalConstant.SUBAUTH_ID));

   private DefaultRequestTemplate template;

   SubaccountRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
