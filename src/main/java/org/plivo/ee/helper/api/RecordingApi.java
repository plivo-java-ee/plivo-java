package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.plivo.ee.helper.api.configuration.RecordingRequest;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Recording;
import org.plivo.ee.helper.api.util.RequestUtils;
import org.plivo.ee.helper.api.util.ResponseException;

public class RecordingApi extends AbstractApi
{

   public RecordingApi(Client client)
   {
      this.client = client;
   }

   public Client getClient()
   {
      return client;
   }

   public void setClient(Client client)
   {
      this.client = client;
   }

   /*
    * List All Recordings
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Recording/
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Recording> listAllRecordings(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               RecordingRequest.LIST.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponseList<Recording> listAllRecordings() throws Exception
   {
      return listAllRecordings(get());
   }

   /*
    * List a Specific Recording
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Recording/{recording_id}/
    */

   public Recording getSpecificRecording(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               RecordingRequest.GET.getTemplate(),
               parameters, Recording.class);
   }

   /*
    * FLUENT API
    */
   public Recording getSpecificRecording() throws Exception
   {
      return getSpecificRecording(get());
   }

   /*
    * Delete a Specific Recording
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Recording/{recording_id}/
    */

   public boolean deleteSpecificRecording(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  RecordingRequest.DELETE.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("deleteSpecificRecording error"));

      }
      finally
      {
         if (response != null)
            response.close();
      }
   }

   /*
    * FLUENT API
    */
   public boolean deleteSpecificRecording() throws Exception
   {
      return deleteSpecificRecording(get());
   }

}