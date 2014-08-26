package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.plivo.ee.helper.api.configuration.AccountRequest;
import org.plivo.ee.helper.api.configuration.SubaccountRequest;
import org.plivo.ee.helper.api.pojo.Account;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Subaccount;
import org.plivo.ee.helper.api.util.RequestUtils;
import org.plivo.ee.helper.api.util.ResponseException;

public class AccountApi extends AbstractApi
{

   public AccountApi(Client client)
   {
      this.client = client;
   }

   /*
    * Get Account Details
    * 
    * You can call this API to retrieve details like email address, cash credits, postal address, auto recharge
    * settings, etc which is associated with your Plivo account. Returns an object representing your Plivo account.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/
    */
   public Account getAccountDetails(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               AccountRequest.GET.getTemplate(),
               parameters, Account.class);
   }

   /*
    * Modify an Account
    * 
    * If you would like to modify your account details, you could do so with this API. You can make changes to the name,
    * city and the address fields.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/
    */

   public ApiResponse modifyAccount(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               AccountRequest.UPDATE.getTemplate(), parameters,
               ApiResponse.class);
   }

   /*
    * Create a Subaccount
    * 
    * A subaccount is an account that is owned by a parent account. Using a subaccount makes it easier to segment,
    * manage, and keep track of the account usages of each user independently.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Subaccount/
    */

   public ApiResponse createSubaccount(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               SubaccountRequest.CREATE.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * Modify a Subaccount
    * 
    * If you would like to modify your subaccount, you could do so with this API. You can make changes to the name of
    * the subaccount and specify whether to enable or disable it.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Subaccount/{subauth_id}/
    */
   public ApiResponse modifySubaccount(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               SubaccountRequest.UPDATE.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * Get Details of a Specific Subaccount
    * 
    * 
    * You can call this API to retrieve details of a subaccount like auth_id, auth_token, etc. Returns an object
    * representing your Plivo subaccount.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Subaccount/{subauth_id}/
    */

   public Subaccount getDetailsSubaccount(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               SubaccountRequest.GET.getTemplate(),
               parameters, Subaccount.class);
   }

   /*
    * Get Details of all Subaccounts
    * 
    * You can get details of all subaccounts associated with your main Plivo account. We return a list of all
    * subaccounts.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Subaccount/
    */

   @SuppressWarnings("unchecked")
   public ApiResponseList<Subaccount> getDetailsAllSubaccounts(
            Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               SubaccountRequest.LIST.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * Delete a Subaccount
    * 
    * You can delete a subaccount with this API. This API would delete the subaccount and associate all Number,
    * Endpoints and Applications (which are linked to the subaccount) to the main Plivo account.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Subaccount/{subauth_id}/
    */

   public boolean deleteSubAccount(Map<String, String> parameters)
            throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils
                  .submit(client,
                           SubaccountRequest.DELETE.getTemplate(),
                           parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("deleteSubAccount error"));
      }

      finally
      {
         if (response != null)
            response.close();
      }

   }

   // FLUENTLY METHODS
   public ApiResponse createSubaccount() throws Exception
   {
      return createSubaccount(get());
   }

   public boolean deleteSubAccount() throws Exception
   {
      return deleteSubAccount(get());
   }

   public Account getAccountDetails() throws Exception
   {
      return getAccountDetails(get());
   }

   public ApiResponseList<Subaccount> getDetailsAllSubaccounts() throws Exception
   {
      return getDetailsAllSubaccounts(get());
   }

   public Subaccount getDetailsSubaccount() throws Exception
   {
      return getDetailsSubaccount(get());
   }

   public ApiResponse modifyAccount() throws Exception
   {
      return modifyAccount(get());
   }

   public ApiResponse modifySubaccount() throws Exception
   {
      return modifySubaccount(get());
   }

}