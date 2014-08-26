package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Price
{
   public String api_id;
   public String country;
   public String country_code;
   public String country_iso;
   @XmlElement(name = "message")
   public PriceMessageInfo message;
   @XmlElement(name = "phone_numbers")
   public PricePhoneInfo phone_numbers;
   @XmlElement(name = "voice")
   public PriceVoiceInfo voice;

   public Price()
   {
   }

   @Override
   public String toString()
   {
      return "Price [" + (api_id != null ? "api_id=" + api_id + ", " : "")
               + (country != null ? "country=" + country + ", " : "")
               + (country_code != null ? "country_code=" + country_code + ", " : "")
               + (country_iso != null ? "country_iso=" + country_iso + ", " : "")
               + (message != null ? "message=" + message + ", " : "")
               + (phone_numbers != null ? "phone_numbers=" + phone_numbers + ", " : "")
               + (voice != null ? "voice=" + voice : "") + "]";
   }

}
