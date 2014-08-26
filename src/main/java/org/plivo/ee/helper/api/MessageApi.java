package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;

import org.plivo.ee.helper.api.configuration.MessageRequest;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Message;
import org.plivo.ee.helper.api.util.RequestUtils;

public class MessageApi extends AbstractApi
{

   public MessageApi(Client client)
   {
      this.client = client;
   }

   /*
    * Send a Message
    * 
    * This API enables you to send messages via Plivo’s SMS service. The API supports Unicode UTF-8 encoded texts, so
    * you can send messages in any language. The API also handles long SMS automatically by splitting it into standard
    * SMS sized chunks and sending them. Delivery reports are automatically supported in networks where they are
    * provided by the operator.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Message/
    */

   public ApiResponse sendMessage(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               MessageRequest.SEND.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * Get Details of All Messages
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Message/
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Message> getDetailsAllMessages(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               MessageRequest.LIST.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * Get Details of a Single Message
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Message/{message_uuid}/
    */
   public Message getMessageDetails(Map<String, String> parameters)
            throws Exception
   {
      return RequestUtils.submit(client,
               MessageRequest.GET.getTemplate(),
               parameters, Message.class);
   }

}