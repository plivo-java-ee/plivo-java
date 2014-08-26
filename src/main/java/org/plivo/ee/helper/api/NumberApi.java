package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.plivo.ee.helper.api.configuration.NumberRequest;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Conference;
import org.plivo.ee.helper.api.pojo.Number;
import org.plivo.ee.helper.api.util.RequestUtils;
import org.plivo.ee.helper.api.util.ResponseException;

public class NumberApi extends AbstractApi
{

   public NumberApi(Client client)
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
    * List All Rented Numbers
    * 
    * This API lets you list of numbers rented on Plivo and numbers added to your account.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Number/
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Conference> getListAllRentedNumbers(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               NumberRequest.LIST.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponseList<Conference> getListAllRentedNumbers() throws Exception
   {
      return getListAllRentedNumbers(get());
   }

   /*
    * Get Details of a Rented Number
    * 
    * This API lets you get details of a single number on your Plivo account.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Number/{number}/
    */
   public Number getDetailsOfRentedNumber(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               NumberRequest.GET.getTemplate(),
               parameters, Number.class);
   }

   /*
    * FLUENT API
    */
   public Number getDetailsOfRentedNumber() throws Exception
   {
      return getDetailsOfRentedNumber(get());
   }

   /*
    * Add a number from your own carrier
    * 
    * This API enables you to add a number of your own carrier.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Number/
    */
   public ApiResponse addNumber(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               NumberRequest.CREATE.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse addNumber() throws Exception
   {
      return addNumber(get());
   }

   /*
    * Edit a Number
    * 
    * This API enables you to change the application and subaccount associated with a number you rented.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Number/{number}/
    */
   public ApiResponse editNumber(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               NumberRequest.MODIFY.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse editNumber() throws Exception
   {
      return editNumber(get());
   }

   /*
    * Unrent a Number
    * 
    * This API lets you unrent a number on Plivo. This operation cannot be undone.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Number/{number}/
    */

   public boolean unrentNumber(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  NumberRequest.DELETE.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("unrentNumber error"));

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
   public boolean unrentNumber() throws Exception
   {
      return unrentNumber(get());
   }

   /*
    * Search for New Numbers
    * 
    * 
    * This API lets you search for local, national and tollfree numbers for you to rent. Searches can be performed based
    * on the country ISO, prefix, number type and region. We return a list of group IDs which must be used to rent the
    * numbers on your account.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/AvailableNumberGroup/
    */

   @SuppressWarnings("unchecked")
   public ApiResponseList<Number> searchForNewNumbers(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               NumberRequest.SEARCH_FOR_RENT.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponseList<Number> searchForNewNumbers() throws Exception
   {
      return searchForNewNumbers(get());
   }

   /*
    * Rent Numbers
    * 
    * 
    * The group_id parameter that is obtained from the number search API above should be passed in the URL of this POST
    * request.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/AvailableNumberGroup/{group_id}/
    */

   public ApiResponse rentNumbers(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               NumberRequest.RENT.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse rentNumbers() throws Exception
   {
      return rentNumbers(get());
   }

}