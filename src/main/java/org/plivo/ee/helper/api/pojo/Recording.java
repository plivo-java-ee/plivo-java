package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recording
{
   public String add_time;
   public String call_uuid;
   public String conference_name;
   public String recording_duration_ms;
   public String recording_end_ms;
   public String recording_format;
   public String recording_id;
   public String recording_start_ms;
   public String recording_type;
   public String recording_url;
   public String resource_uri;

   public Recording()
   {
   }

   @Override
   public String toString()
   {
      return "Recording [" + (add_time != null ? "add_time=" + add_time + ", " : "")
               + (call_uuid != null ? "call_uuid=" + call_uuid + ", " : "")
               + (conference_name != null ? "conference_name=" + conference_name + ", " : "")
               + (recording_duration_ms != null ? "recording_duration_ms=" + recording_duration_ms + ", " : "")
               + (recording_end_ms != null ? "recording_end_ms=" + recording_end_ms + ", " : "")
               + (recording_format != null ? "recording_format=" + recording_format + ", " : "")
               + (recording_id != null ? "recording_id=" + recording_id + ", " : "")
               + (recording_start_ms != null ? "recording_start_ms=" + recording_start_ms + ", " : "")
               + (recording_type != null ? "recording_type=" + recording_type + ", " : "")
               + (recording_url != null ? "recording_url=" + recording_url + ", " : "")
               + (resource_uri != null ? "resource_uri=" + resource_uri : "") + "]";
   }

}
