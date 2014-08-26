package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum AccountRequest
{

   GET(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/")
            .pathParams(GlobalConstant.AUTH_ID)),

   UPDATE(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/").pathParams(
            GlobalConstant.AUTH_ID).formParams(GlobalConstant.NAME, GlobalConstant.CITY, GlobalConstant.ADDRESS));

   private DefaultRequestTemplate template;

   AccountRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
