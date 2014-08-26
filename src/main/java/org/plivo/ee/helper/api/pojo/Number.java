package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Number
{

   public String stock;
   public String status;
   public String setup_rate;
   public String rental_rate;
   public String prefix;
   public String group_id;
   public String added_on;
   public String alias;
   public String api_id;
   public String application;
   public String carrier;
   public String monthly_rental_rate;
   public String number;
   public String number_type;
   public String region;

   public String resource_uri;
   public String sms_enabled;
   public String sms_rate;
   public String sub_account;
   public String voice_enabled;
   public String voice_rate;

   public Number()
   {
   }

   @Override
   public String toString()
   {
      return "Number [" + (stock != null ? "stock=" + stock + ", " : "")
               + (status != null ? "status=" + status + ", " : "")
               + (setup_rate != null ? "setup_rate=" + setup_rate + ", " : "")
               + (rental_rate != null ? "rental_rate=" + rental_rate + ", " : "")
               + (prefix != null ? "prefix=" + prefix + ", " : "")
               + (group_id != null ? "group_id=" + group_id + ", " : "")
               + (added_on != null ? "added_on=" + added_on + ", " : "")
               + (alias != null ? "alias=" + alias + ", " : "") + (api_id != null ? "api_id=" + api_id + ", " : "")
               + (application != null ? "application=" + application + ", " : "")
               + (carrier != null ? "carrier=" + carrier + ", " : "")
               + (monthly_rental_rate != null ? "monthly_rental_rate=" + monthly_rental_rate + ", " : "")
               + (number != null ? "number=" + number + ", " : "")
               + (number_type != null ? "number_type=" + number_type + ", " : "")
               + (region != null ? "region=" + region + ", " : "")
               + (resource_uri != null ? "resource_uri=" + resource_uri + ", " : "")
               + (sms_enabled != null ? "sms_enabled=" + sms_enabled + ", " : "")
               + (sms_rate != null ? "sms_rate=" + sms_rate + ", " : "")
               + (sub_account != null ? "sub_account=" + sub_account + ", " : "")
               + (voice_enabled != null ? "voice_enabled=" + voice_enabled + ", " : "")
               + (voice_rate != null ? "voice_rate=" + voice_rate : "") + "]";
   }

}
