package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.plivo.ee.helper.api.configuration.ConferenceRequest;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.Conference;
import org.plivo.ee.helper.api.util.RequestUtils;
import org.plivo.ee.helper.api.util.ResponseException;

public class ConferenceApi extends AbstractApi
{

   public ConferenceApi(Client client)
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
    * Get All Conferences
    * 
    * Retrieves a list of all conferences which are active on your account. This API returns the names of all the
    * ongoing conferences.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Conference/
    */
   public ApiResponse getAllConferences(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.LIST.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse getAllConferences() throws Exception
   {
      return getAllConferences(get());
   }

   /*
    * Details of a Conference
    * 
    * Retrieves the details of a particular conference.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/
    */
   public Conference getDetailsConference(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.GET.getTemplate(),
               parameters, Conference.class);
   }

   /*
    * FLUENT API
    */
   public Conference getDetailsConference() throws Exception
   {
      return getDetailsConference(get());
   }

   /*
    * Hangup All Conferences
    * 
    * 
    * This API lets you hangup all ongoing conferences running on your account.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/
    */
   public ApiResponse hangupAllConferences(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.HANGUP_ALL.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse hangupAllConferences() throws Exception
   {
      return hangupAllConferences(get());
   }

   /*
    * Hangup a Particular Conference
    * 
    * 
    * This API lets you hangup a particular conference by using the conference name.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}
    */

   public ApiResponse hangupParticularConference(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.HANGUP.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse hangupParticularConference() throws Exception
   {
      return hangupParticularConference(get());
   }

   /*
    * Hangup a Member
    * 
    * This API lets you hangup a particular member in a conference by using the member ID.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/
    * ￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼
    * 
    * The member_idattribute which is passed in the URL can be one of the following three
    * https://www.plivo.com/docs/api/conference/member/ 1/13 r r/{m e 24/8/2014 Conference Member API Documentation
    * forms: 1. Member ID: The member specified by the member_id. 2. Comma separated list of member IDs: List of member
    * IDs on which this operation will be performed. 3. ‘all’: The string ‘all’, this action will be performed on all
    * members of the conference.
    */
   public ApiResponse hangupMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.HANGUP_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse hangupMember() throws Exception
   {
      return hangupMember(get());
   }

   /*
    * Kick Member
    * 
    * This API lets you kick a member out of a conference. When a member is kicked out of a conference, action is
    * performed based on the next element in the XML.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Kick/
    * 
    * For eg. If the XML to start the conference is the one below, Plivo will play the text in the <Speak> tag after the
    * member has been kicked.
    * 
    * <Response> <Conference enterSound="beep:1">MyConference</Conference> <Speak>
    * 
    * Good bye. You have been kicked out of the conference</Speak> </Response> The member_id attribute which is passed
    * in the URL can be one of the following three forms:
    * 
    * Member ID: The member specified by the member_id.
    * 
    * Comma separated list of member IDs: List of member IDs on which this operation will be performed.
    * 
    * ‘all’: The string ‘all’, this action will be performed on all members of the conference.
    */
   public ApiResponse kickMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.KICK_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse kickMember() throws Exception
   {
      return kickMember(get());
   }

   /*
    * Mute Member
    * 
    * This API lets you mute members in a conference. When a member is muted, audio from their device will be muted and
    * other members in the conference will not be able to hear the caller.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Mute/
    * 
    * The member_id attribute which is passed in the URL can be one of the following three forms:
    * 
    * Member ID: The member specified by the member_id. Comma separated list of member IDs: List of member IDs on which
    * this operation will be performed. ‘all’: The string ‘all’, this action will be performed on all members of the
    * conference.
    */
   public ApiResponse muteMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.MUTE_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse muteMember() throws Exception
   {
      return muteMember(get());
   }

   /*
    * Unmute Member
    * 
    * This API lets you unmute members which have been muted by the Mute Member API.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Mute/
    * 
    * The member_id attribute which is passed in the URL can be one of the following three forms:
    * 
    * Member ID: The member specified by the member_id. Comma separated list of member IDs: List of member IDs on which
    * this operation will be performed. ‘all’: The string ‘all’, this action will be performed on all members of the
    * conference.
    */

   public boolean unmuteMember(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  ConferenceRequest.UNMUTE_MEMBER.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("unmuteMember error"));

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
   public boolean unmuteMember() throws Exception
   {
      return unmuteMember(get());
   }

   /*
    * Play Sound to Member
    * 
    * This API lets you play a mp3 or a wav file to a member in the conference.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Play/
    * 
    * 
    * The member_id attribute which is passed in the URL can be one of the following three forms:
    * 
    * Member ID: The member specified by the member_id. Comma separated list of member IDs: List of member IDs on which
    * this operation will be performed. ‘all’: The string ‘all’, this action will be performed on all members of the
    * conference.
    */
   public ApiResponse playSoundToMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.PLAY_SOUND_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse playSoundToMember() throws Exception
   {
      return playSoundToMember(get());
   }

   /*
    * Stop Playing Sound to Member Play Text to Member
    * 
    * This API will stop the file which is being played to a member initiated by the Play API
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Play/
    * 
    * The member_id attribute which is passed in the URL can be one of the following three forms:
    * 
    * Member ID: The member specified by the member_id. Comma separated list of member IDs: List of member IDs on which
    * this operation will be performed. ‘all’: The string ‘all’, this action will be performed on all members of the
    * conference.
    */
   public ApiResponse stopPlayngSoundToMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.STOP_PLAY_SOUND_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse stopPlayngSoundToMember() throws Exception
   {
      return stopPlayngSoundToMember(get());
   }

   /*
    * Play Text to Member
    * 
    * This API will play text to a member in a conference.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Speak/
    * 
    * The member_id attribute which is passed in the URL can be one of the following three forms:
    * 
    * Member ID: The member specified by the member_id. Comma separated list of member IDs: List of member IDs on which
    * this operation will be performed. ‘all’: The string ‘all’, this action will be performed on all members of the
    * conference.
    */
   public ApiResponse playTextToMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.PLAY_TEXT_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse playTextToMember() throws Exception
   {
      return playTextToMember(get());
   }

   /*
    * Stop Playing Text to Member
    * 
    * This API will stop playing text to a member in a conference which was initiated by the Play Text API
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Speak/
    */
   public ApiResponse stopPlayTextToMember(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.STOP_PLAY_TEXT_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse stopPlayTextToMember() throws Exception
   {
      return stopPlayTextToMember(get());
   }

   /*
    * 
    * Make Member Deaf
    * 
    * This API lets you deaf a particular member. When this operation is made on a conference member, the member will
    * not be able to hear any audio from the conference.
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Deaf/
    */
   public ApiResponse makeMemberDeaf(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.MAKE_DEAF_MEMBER.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse makeMemberDeaf() throws Exception
   {
      return makeMemberDeaf(get());
   }

   /*
    * Enable Hearing For Member
    * 
    * 
    * his API lets you un-deaf a member in a conference.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Member/{member_id}/Deaf/
    */
   public boolean enableHearingForMember(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  ConferenceRequest.STOP_MAKE_DEAF_MEMBER.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("enableHearingForMember error"));

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
   public boolean enableHearingForMember() throws Exception
   {
      return enableHearingForMember(get());
   }

   /*
    * Start Recording a Conference
    * 
    * 
    * This API lets you start recording a live conference. You could either use this API call after the conference has
    * been initiated or use the recording capabilities in the Conference XML
    * 
    * POST https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Record/
    */
   public ApiResponse startRecordingConference(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               ConferenceRequest.START_RECORD_CONFERENCE.getTemplate(),
               parameters, ApiResponse.class);
   }

   /*
    * FLUENT API
    */
   public ApiResponse startRecordingConference() throws Exception
   {
      return startRecordingConference(get());
   }

   /*
    * Stop Recording a Conference
    * 
    * If the recording was initiated by the above Record API call, you could use this API call to stop recording the
    * conference. This is useful when you don’t want to record certain parts of a conference which involves critical
    * details being exchanged on the call.
    * 
    * DELETE https://api.plivo.com/v1/Account/{auth_id}/Conference/{conference_name}/Record/
    */

   public boolean stopRecordingConference(Map<String, String> parameters) throws Exception
   {
      Response response = null;
      try
      {
         response = RequestUtils.submit(client,
                  ConferenceRequest.STOP_RECORD_CONFERENCE.getTemplate(),
                  parameters);
         if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
         {
            return true;
         }
         throw new ResponseException(response.getStatus(), response.getStatusInfo() == null ? null : response
                  .getStatusInfo().getReasonPhrase(), new Exception("stopRecordingConference error"));

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
   public boolean stopRecordingConference() throws Exception
   {
      return stopRecordingConference(get());
   }
}