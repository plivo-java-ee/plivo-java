package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum RecordingRequest
{
   // List All Recordings
   // GET https://api.plivo.com/v1/Account/{auth_id}/Recording/

   LIST(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Recording/")
            .pathParams(GlobalConstant.AUTH_ID).queryParams(GlobalConstant.SUBACCOUNT, GlobalConstant.CALL_UUID,
                     GlobalConstant.ADD_TIME,
                     GlobalConstant.LIMIT, GlobalConstant.OFFSET)),

   // List a Specific Recording
   // GET https://api.plivo.com/v1/Account/{auth_id}/Recording/{recording_id}/
   GET(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Recording/{recording_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.RECORDING_ID)),

   // Delete a Specific Recording
   // DELETE https://api.plivo.com/v1/Account/{auth_id}/Recording/{recording_id}/
   DELETE(new DefaultRequestTemplate(HttpMethod.DELETE,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Recording/{recording_id}/")
            .pathParams(GlobalConstant.AUTH_ID, GlobalConstant.RECORDING_ID)), ;

   private DefaultRequestTemplate template;

   RecordingRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
