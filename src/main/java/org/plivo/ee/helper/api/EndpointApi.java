package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.plivo.ee.helper.api.configuration.EndpointRequest;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Conference;
import org.plivo.ee.helper.api.util.RequestUtils;
import org.plivo.ee.helper.api.util.ResponseException;

public class EndpointApi extends AbstractApi
{

   public EndpointApi(Client client)
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
    * Create an Endpoint
    * 
    * 
    * This API lets you create a new endpoint on Plivo. Check out our tutorial on getting started with SIP endpoints.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Endpoint/
    */
   public ApiResponse createEndpoint(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               EndpointRequest.CREATE.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse createEndpoint() throws Exception
   {
      return createEndpoint(get());
   }

   /*
    * Get Details of a Single Endpoint
    * 
    * 
    * This API lets you get details of a single endpoint on your account using the endpoint_id.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Endpoint/{endpoint_id}/
    */
   public Conference getDetailsSingleEndpoint(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               EndpointRequest.GET.getTemplate(),
               parameters, Conference.class);
   }

   /*
    * FLUENT API
    */
   public Conference getDetailsSingleEndpoint() throws Exception
   {
      return getDetailsSingleEndpoint(get());
   }

   /*
    * Get Details of All Endpoints
    * 
    * 
    * This API lets you get details of all endpoints. This is pretty useful in use-cases where you want statuses of your
    * endpoints and whether they have been registered using a SIP client.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Endpoint/
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Conference> getDetailsAllEndpoints(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               EndpointRequest.LIST.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponseList<Conference> getDetailsAllEndpoints() throws Exception
   {
      return getDetailsAllEndpoints(get());
   }

   /*
    * Modify an Endpoint
    * 
    * 
    * This API lets you modify an endpoint’s password, alias or the application attached to it.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Endpoint/{endpoint_id}/
    */

   public ApiResponse modifyEndpoint(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               EndpointRequest.MODIFY.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse modifyEndpoint() throws Exception
   {
      return modifyEndpoint(get());
   }

   /*
    * Delete an Endpoint
    * 
    * 
    * This API lets you delete an endpoint. This operation cannot be undone.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Endpoint/{endpoint_id}/
    */
   public boolean deleteEndpoint(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  EndpointRequest.DELETE.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("deleteEndpoint error"));

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
   public boolean deleteEndpoint() throws Exception
   {
      return deleteEndpoint(get());
   }

}