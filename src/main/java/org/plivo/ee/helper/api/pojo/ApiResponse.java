package org.plivo.ee.helper.api.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApiResponse
{
   public String message;
   public String api_id;

   // SUBACCOUNT
   public String auth_id;
   public String auth_token;

   // CALL
   public String request_uuid;

   // MESSAGE
   public List<String> message_uuid;

   // RECORD
   public String url;
   public String recording_id;

   // CONFERENCE
   public List<String> conferences;
   public String conference_name;
   public String member_id;

   // ENDPOINT

   public String username;
   public String alias;
   public String endpoint_id;

   // NUMBER
   @XmlElement(name = "numbers")
   public List<Number> numbers;
   public String status;
   public String details;

   public ApiResponse()
   {
   }

   @Override
   public String toString()
   {
      return "ApiResponse [" + (message != null ? "message=" + message + ", " : "")
               + (api_id != null ? "api_id=" + api_id + ", " : "")
               + (auth_id != null ? "auth_id=" + auth_id + ", " : "")
               + (auth_token != null ? "auth_token=" + auth_token + ", " : "")
               + (request_uuid != null ? "request_uuid=" + request_uuid + ", " : "")
               + (message_uuid != null ? "message_uuid=" + message_uuid + ", " : "")
               + (url != null ? "url=" + url + ", " : "")
               + (recording_id != null ? "recording_id=" + recording_id + ", " : "")
               + (conferences != null ? "conferences=" + conferences + ", " : "")
               + (conference_name != null ? "conference_name=" + conference_name + ", " : "")
               + (member_id != null ? "member_id=" + member_id + ", " : "")
               + (username != null ? "username=" + username + ", " : "")
               + (alias != null ? "alias=" + alias + ", " : "")
               + (endpoint_id != null ? "endpoint_id=" + endpoint_id + ", " : "")
               + (numbers != null ? "numbers=" + numbers + ", " : "")
               + (status != null ? "status=" + status + ", " : "") + (details != null ? "details=" + details : "")
               + "]";
   }

}
