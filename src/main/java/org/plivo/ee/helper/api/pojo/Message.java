package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
   public String cloud_rate;
   public String carrier_rate;
   public String message_direction;
   public String to_number;
   public String message_state;
   public String total_amount;
   public String from_number;
   public String message_uuid;
   public String message_time;
   public String resource_uri;
   public String message_type;
   public String api_id;
   public String total_rate;
   public String units;

   public Message()
   {
   }

   @Override
   public String toString()
   {
      return "Message [" + (cloud_rate != null ? "cloud_rate=" + cloud_rate + ", " : "")
               + (carrier_rate != null ? "carrier_rate=" + carrier_rate + ", " : "")
               + (message_direction != null ? "message_direction=" + message_direction + ", " : "")
               + (to_number != null ? "to_number=" + to_number + ", " : "")
               + (message_state != null ? "message_state=" + message_state + ", " : "")
               + (total_amount != null ? "total_amount=" + total_amount + ", " : "")
               + (from_number != null ? "from_number=" + from_number + ", " : "")
               + (message_uuid != null ? "message_uuid=" + message_uuid + ", " : "")
               + (message_time != null ? "message_time=" + message_time + ", " : "")
               + (resource_uri != null ? "resource_uri=" + resource_uri + ", " : "")
               + (message_type != null ? "message_type=" + message_type + ", " : "")
               + (api_id != null ? "api_id=" + api_id + ", " : "")
               + (total_rate != null ? "total_rate=" + total_rate + ", " : "")
               + (units != null ? "units=" + units : "") + "]";
   }

}
