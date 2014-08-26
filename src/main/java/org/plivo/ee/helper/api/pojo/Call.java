package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Call
{
   public String api_id;
   public Integer bill_duration;
   public Integer billed_duration;
   public CallDirection call_direction;
   public Integer call_duration;
   public String call_uuid;
   public String end_time;
   public String from_number;
   public String parent_call_uuid;
   public String resource_uri;
   public String to_number;
   public String total_amount;
   public String total_rate;

   public Call()
   {
   }

   @Override
   public String toString()
   {
      return "Call [api_id=" + api_id + ", bill_duration=" + bill_duration + ", billed_duration=" + billed_duration
               + ", call_direction=" + call_direction + ", call_duration=" + call_duration + ", call_uuid=" + call_uuid
               + ", end_time=" + end_time + ", from_number=" + from_number + ", parent_call_uuid=" + parent_call_uuid
               + ", resource_uri=" + resource_uri + ", to_number=" + to_number + ", total_amount=" + total_amount
               + ", total_rate=" + total_rate + "]";
   }

}
