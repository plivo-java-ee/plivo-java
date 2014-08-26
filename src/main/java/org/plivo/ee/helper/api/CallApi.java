package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.plivo.ee.helper.api.configuration.CallRequest;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Call;
import org.plivo.ee.helper.api.util.RequestUtils;
import org.plivo.ee.helper.api.util.ResponseException;

public class CallApi extends AbstractApi
{

   public CallApi(Client client)
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
    * Make an Outbound
    * 
    * Call The following API enables you to make a single call or bulk outbound calls to real phone(s) or SIP
    * endpoint(s).
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Call/
    */
   public ApiResponse makeOutboundCall(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.MAKE_OUTBOUND_CALL.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse makeOutboundCall() throws Exception
   {
      return makeOutboundCall(get());
   }

   /*
    * Get All Call Details
    * 
    * The following API enables you to get information about all completed calls. The maximum number of results that can
    * be fetched with a single API call is 20.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Call/
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Call> getAllCallDetails(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.LIST.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * FLUENT API
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Call> getAllCallDetails() throws Exception
   {
      return getAllCallDetails(get());
   }

   /*
    * Get Call Detail Record Of a Call
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/
    */
   public Call getCallDetailRecordOfCall(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.GET_RECORD.getTemplate(),
               parameters, Call.class);
   }

   /*
    * FLUENT API
    */
   public Call getCallDetailRecordOfCall() throws Exception
   {
      return getCallDetailRecordOfCall(get());
   }

   /*
    * Get All Live Calls
    * 
    * Get all current active calls made from an account.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Call/?status=live
    */
   @SuppressWarnings("unchecked")
   public ApiResponseList<Call> getAllLiveCalls(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.LIST_LIVE_CALLS.getTemplate(),
               parameters, ApiResponseList.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponseList<Call> getAllLiveCalls() throws Exception
   {
      return getAllLiveCalls(get());
   }

   /*
    * Get Details Of a Live Call
    * 
    * 
    * Get information on an active call.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/?status=live
    */
   public Call getDetailsOfLiveCall(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.GET_LIVE_CALL.getTemplate(),
               parameters, Call.class);
   }

   /*
    * FLUENT API
    */
   public Call getDetailsOfLiveCall() throws Exception
   {
      return getDetailsOfLiveCall(get());
   }

   /*
    * Hangup
    * 
    * 
    * A Specific Call Hangup an incoming or outgoing call. If you are looking to hangup an incoming call without
    * answering it, checkout the Hangup XML
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/
    */
   public boolean hangupSpecificCall(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  CallRequest.HANGUP.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("hangupSpecificCall error"));
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
   public boolean hangupSpecificCall() throws Exception
   {
      return hangupSpecificCall(get());
   }

   /*
    * Hangup a Call Request
    * 
    * The following API enables you to hangup a call using the request_uuidreturned by the Outbound Call API.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Request/{request_uuid}/
    */

   public boolean hangupCallRequest(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  CallRequest.HANGUP_REQUEST.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("hangupCallRequest error"));
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
   public boolean hangupCallRequest() throws Exception
   {
      return hangupCallRequest(get());
   }

   /*
    * Transfer a Call
    * 
    * This API enables an in-progress or active call to a different URL and fetch and execute XML from a new URL. If the
    * call (the A leg) is in a Dial, you can also transfer the other party (the B leg) at the same time or only transfer
    * the B leg to an URL. This is useful for many applications where you want to asynchronously change the behavior of
    * a live call. For example, you can play music while the call is on hold, queue calls, transfer calls etc.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/
    */
   public ApiResponse transferCall(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.TRANSFER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse transferCall() throws Exception
   {
      return transferCall(get());
   }

   /*
    * DTMF
    * 
    * The DTMF API lets you send DTMF tones on a call. Its usually used to automate sending of DTMF tones on an outbound
    * call.
    * 
    * Send digits on a call
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/DTMF/
    */
   public ApiResponse sendDigitsDtmf(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.SEND_DIGITS.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse sendDigitsDtmf() throws Exception
   {
      return sendDigitsDtmf(get());
   }

   /*
    * Play a Music File
    * 
    * The Play API lets to play a mp3 or a wav file on a call. Its usually used to play a notification on a live call.
    * You can also stop a file which is being played on the call.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/Play/
    */

   public ApiResponse playMusicFile(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.PLAY_MP3.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse playMusicFile() throws Exception
   {
      return playMusicFile(get());
   }

   /*
    * Stop Playing a Music File
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/Play/
    */
   public boolean stopPlayMusicFile(Map<String, String> parameters) throws Exception
   {

      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  CallRequest.STOP_PLAY_MP3.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("stopPlayMusicFile error"));
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
   public boolean stopPlayMusicFile() throws Exception
   {

      return stopPlayMusicFile(get());
   }

   /*
    * Record a Call
    * 
    * The Record API lets start recording a live call at any time during the call. It also lets you stop the recording.
    * You could use this API if you don’t want to record the whole call due to some sensitive information being
    * exchanged on the call.
    * 
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/Record/
    */

   public ApiResponse recordCall(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.RECORD_CALL.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse recordCall() throws Exception
   {
      return recordCall(get());
   }

   /*
    * Stop Recording a Call
    * 
    * ￼￼DELETE https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/Record/
    */

   public boolean stopRecordCall(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  CallRequest.STOP_RECORD_CALL.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("stopRecordCall error"));
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
   public boolean stopRecordCall() throws Exception
   {
      return stopRecordCall(get());
   }

   /*
    * 
    * Play Text During a Call
    * 
    * This API lets you play text asynchronously on a live call. Its used by playing notifications on the call, for eg.
    * ‘Your balance is running out’, ‘Please hold, while we transfer your call’, etc.
    * 
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/Speak/
    */
   public ApiResponse playTextDuringCall(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               CallRequest.SPEAK_TXT.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse playTextDuringCall() throws Exception
   {
      return playTextDuringCall(get());
   }

   /*
    * Stop Playing Text During a Call
    * 
    * ￼￼DELETE https://api.plivo.com/v1/Account/{auth_id}/Call/{call_uuid}/Speak/
    */

   public boolean stopPlayingTextDuringCall(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  CallRequest.STOP_SPEAK_TXT.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("stopPlayingTextDuringCall error"));
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
   public boolean stopPlayingTextDuringCall() throws Exception
   {
      return stopPlayingTextDuringCall(get());
   }

}