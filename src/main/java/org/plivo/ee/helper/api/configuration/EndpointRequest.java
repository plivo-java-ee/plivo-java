package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum EndpointRequest
{

   CREATE(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Endpoint/")
            .pathParams(GlobalConstant.AUTH_ID).formParams(GlobalConstant.USERNAME, GlobalConstant.PASSWORD,
                     GlobalConstant.ALIAS,
                     GlobalConstant.APP_ID)),

   GET(new DefaultRequestTemplate(HttpMethod.GET,
            "https://api.plivo.com", "/v1/Account/{auth_id}/Endpoint/{endpoint_id}")
            .pathParams(GlobalConstant.AUTH_ID)),

   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            "https://api.plivo.com", "/v1/Account/{auth_id}/Endpoint/")
            .pathParams(GlobalConstant.AUTH_ID)),

   MODIFY(new DefaultRequestTemplate(HttpMethod.POST,
            "https://api.plivo.com",
            "/v1/Account/{auth_id}/Endpoint/{endpoint_id}")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.ENDPOINT_ID)
            .formParams(GlobalConstant.PASSWORD, GlobalConstant.ALIAS, GlobalConstant.APP_ID)),

   DELETE(new DefaultRequestTemplate(HttpMethod.DELETE,
            "https://api.plivo.com",
            "/v1/Account/{auth_id}/Endpoint/{endpoint_id}")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.ENDPOINT_ID)),

   ;

   private DefaultRequestTemplate template;

   EndpointRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
