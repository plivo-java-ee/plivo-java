package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum NumberRequest
{
   // GET https://api.plivo.com/v1/Account/{auth_id}/Number/
   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.NUMBER_TYPE, "number_startswith",
                     GlobalConstant.SUBACCOUNT, GlobalConstant.ALIAS,
                     GlobalConstant.SERVICES,
                     GlobalConstant.LIMIT, GlobalConstant.OFFSET)),
   // GET https://api.plivo.com/v1/Account/{auth_id}/Number/{number}/
   GET(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Number/{number}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.NUMBER)),
   // POST https://api.plivo.com/v1/Account/{auth_id}/Number/
   CREATE(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Number/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.NUMBERS, GlobalConstant.CARRIER,
                     GlobalConstant.REGION, GlobalConstant.NUMBER_TYPE,
                     GlobalConstant.APP_ID,
                     GlobalConstant.SUBACCOUNT)),

   // POST https://api.plivo.com/v1/Account/{auth_id}/Number/{number}/
   MODIFY(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Number/{number}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.NUMBER).formParams(GlobalConstant.APP_ID,
                     GlobalConstant.SUBACCOUNT,
                     GlobalConstant.ALIAS)),

   // DELETE https://api.plivo.com/v1/Account/{auth_id}/Number/{number}/
   DELETE(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/Number/{number}/").pathParams(
            GlobalConstant.AUTH_ID, GlobalConstant.NUMBER)),

   // GET https://api.plivo.com/v1/Account/{auth_id}/AvailableNumberGroup/
   SEARCH_FOR_RENT(new DefaultRequestTemplate(HttpMethod.GET, GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/AvailableNumberGroup/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.COUNTRY_ISO,
                     GlobalConstant.NUMBER_TYPE, GlobalConstant.PREFIX,
                     GlobalConstant.REGION,
                     GlobalConstant.SERVICES, GlobalConstant.LIMIT,
                     GlobalConstant.OFFSET)),

   RENT(new DefaultRequestTemplate(HttpMethod.POST, GlobalConstant.PLIVO_API,
            "/v1/Account/{auth_id}/AvailableNumberGroup/{group_id}/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.QUANTITY, GlobalConstant.APP_ID));

   private DefaultRequestTemplate template;

   NumberRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
