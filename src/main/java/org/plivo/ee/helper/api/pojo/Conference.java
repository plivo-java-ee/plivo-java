package org.plivo.ee.helper.api.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conference
{
   public String conference_name;
   public String conference_run_tim;
   public String conference_member_count;
   public List<Member> members;
   public String api_id;

   @Override
   public String toString()
   {
      return "Conference [" + (conference_name != null ? "conference_name=" + conference_name + ", " : "")
               + (conference_run_tim != null ? "conference_run_tim=" + conference_run_tim + ", " : "")
               + (conference_member_count != null ? "conference_member_count=" + conference_member_count + ", " : "")
               + (members != null ? "members=" + members + ", " : "") + (api_id != null ? "api_id=" + api_id : "")
               + "]";
   }

}
