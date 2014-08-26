package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum MessageRequest
{

   SEND(new DefaultRequestTemplate(HttpMethod.POST,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Message/")
            .pathParams(GlobalConstant.AUTH_ID)
            .formParams(GlobalConstant.SRC, GlobalConstant.DST, GlobalConstant.TEXT, GlobalConstant.TYPE,
                     GlobalConstant.URL, GlobalConstant.METHOD, GlobalConstant.LOG)),

   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            "https://api.plivo.com", "/v1/Account/{auth_id}/Message/")
            .pathParams(GlobalConstant.AUTH_ID)
            .formParams(GlobalConstant.LIMIT, GlobalConstant.OFFSET)),

   GET(new DefaultRequestTemplate(HttpMethod.GET,
            "https://api.plivo.com",
            "/v1/Account/{auth_id}/Message/{message_uuid}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.MESSGE_UUID));

   private DefaultRequestTemplate template;

   MessageRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
