package org.plivo.ee.helper.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.plivo.ee.helper.xml.type.Method;

@XmlRootElement(name = "Dial")
public class Dial
{

   /**
    * Redirect to this URL after leaving Dial. See the action Request Parameters table below for more information.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: no default action for Dial
    */
   @XmlAttribute
   public String action;

   /**
    * Submit to action URL using GET or POST.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method method;

   /**
    * The caller can press the '*' key to hang up on the called party but can continue with other operations depending
    * on the application's response.
    * 
    * Accepts: true, false
    * 
    * Defaults to: False
    */
   @XmlAttribute
   public Boolean hangupOnStar;

   /**
    * Used to preset the duration (in seconds) of the call.
    * 
    * Accepts: positive integer (in seconds)
    * 
    * Defaults to: 14400 seconds (4 hours)
    */
   @XmlAttribute
   public Integer timeLimit;

   /**
    * The duration (in seconds) for which the called party has to be given a ring.
    * 
    * Accepts: positive integer (seconds)
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public Integer timeout;

   /**
    * If set to a string, caller number will be set to this string value.Default is current caller number.
    * 
    * Accepts: valid phone number
    * 
    * Defaults to: Current caller's callerId
    */
   @XmlAttribute
   public String callerId;

   /**
    * If set to a string, caller name will be set to this string value.Default is current caller name.
    * 
    * Accepts: String or default
    * 
    * Defaults to: current Caller's callerName
    */
   @XmlAttribute
   public String callerName;

   /**
    * Is a remote URL fetched with POST HTTP request which must return an XML response with Play, Wait and/or Speak
    * elements only (all others are ignored). The sound indicated by the XML is played to the called party when the call
    * is answered. Note: This parameter must be specified for confirmKey to work.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: empty
    */
   @XmlAttribute
   public String confirmSound;

   /**
    * The digit to be pressed by the called party to accept the call.Used in conjunction with confirmSound.
    * 
    * Accepts: any digit, #, *
    * 
    * Defaults: empty
    */
   @XmlAttribute
   public Character confirmKey;

   /**
    * Music to be played to the caller while the call is being connected. This is a remote URL fetched with POST HTTP
    * request which must return an XML with Play, Wait and/or Speak elements only (all others are ignored). The sound
    * indicated by the XML is played to the called party when the call is answered. Other values which can be used is
    * the realMusic which will play the real ringtone of the called party.
    * 
    * Accepts: absolute URL or the string "realMusic"
    * 
    * Defaults: empty
    */
   @XmlAttribute
   public String dialMusic;

   /**
    * URL that is notified by Plivo when one of the following events occur : called party is bridged with caller called
    * party hangs up caller has pressed any digit See the callbackUrl Request Parameters table below for more
    * information.
    * 
    * Accepts: absolute URL
    * 
    * Deafult: empty
    */
   @XmlAttribute
   public String callbackUrl;

   /**
    * Method used to notify callbackUrl.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method callbackMethod;

   /**
    * If set to false, do not redirect to action URL. We expect an XML from the action URL if this parameter is set to
    * true. The call will be controlled based on the XML returned from the action URL.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean redirect;

   /**
    * Set matching key combination for the caller (A leg).
    * 
    * Accepts: List of digit patterns separated by comma empty
    */
   @XmlAttribute
   public String digitsMatch;

   /**
    * The SIP headers are always prefixed with X-PH-. For every HTTP Request called by the dialed leg, the SIP headers
    * will be present. Only [A-Z], [a-z] and [0-9] characters are allowed for SIP headers key. Only [A-Z], [a-z], [0-9]
    * and '%' characters are allowed for SIP headers value (so you can URL encode this value).
    * 
    * Accepts: List of SIP headers to send, separated by commas. Sent as key=value pair.For e.g
    * head1=val1,head2=val2,...,headN=valN.
    * 
    * Defaults to: None
    */
   @XmlAttribute
   public String sipHeaders;

   @XmlElement(name = "Number")
   public List<Number> numbers;

   @XmlElement(name = "User")
   public List<User> users;

}