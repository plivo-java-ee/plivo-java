package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member
{
   public String muted;
   public String member_id;
   public String deaf;
   public String from;
   public String to;
   public String caller_name;
   public String direction;
   public String call_uuid;
   public String join_time;

   @Override
   public String toString()
   {
      return "Member [" + (muted != null ? "muted=" + muted + ", " : "")
               + (member_id != null ? "member_id=" + member_id + ", " : "")
               + (deaf != null ? "deaf=" + deaf + ", " : "") + (from != null ? "from=" + from + ", " : "")
               + (to != null ? "to=" + to + ", " : "")
               + (caller_name != null ? "caller_name=" + caller_name + ", " : "")
               + (direction != null ? "direction=" + direction + ", " : "")
               + (call_uuid != null ? "call_uuid=" + call_uuid + ", " : "")
               + (join_time != null ? "join_time=" + join_time : "") + "]";
   }

}
