package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.plivo.ee.helper.xml.type.MessageType;
import org.plivo.ee.helper.xml.type.Method;

@XmlRootElement(name = "Message")
public class Message
{

   public Message()
   {

   }

   public Message(String value)
   {
      this.value = value;
   }

   public Message(String value, String src, String dst)
   {
      this.value = value;
      this.src = src;
      this.dst = dst;
   }

   /**
    * Source Number. For eg.1202322222
    * 
    * Accepts: Must be a purchased, valid number.
    * 
    * Defaults to: None
    */
   @XmlAttribute(required = true)
   public String src;

   /**
    * Destination Number. Can be bulk numbers delimited by <. For eg.1203443444<1203345564
    * 
    * Accepts: Must be a valid number.
    * 
    * Defaults to: None
    */
   @XmlAttribute(required = true)
   public String dst;

   /**
    * Type of the message. For eg. sms
    * 
    * Accepts: sms
    * 
    * Defaults to: sms
    */
   @XmlAttribute
   public MessageType type;

   /**
    * URL that is notified by Plivo when a response is available and to which the response is sent. (Delivery reports)
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: None
    */
   @XmlAttribute
   public String callbackUrl;

   /**
    * The method used to notify the callbackUrl.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method callbackMethod;

   @XmlValue
   public String value;

}
