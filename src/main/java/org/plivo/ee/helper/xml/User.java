package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "User")
public class User
{

   public User()
   {
   }

   public User(String value)
   {
      this.value = value;
   }

   /**
    * The sendDigits attribute tells the Plivo API to play DTMF tones when the call is answered. This is useful when
    * dialing a phone number and an extension. Plivo will dial the number, and when the automated system picks up, the
    * DTMF tones are sent to connect to the extension.
    * 
    * Accepts: Any digits
    * 
    * Defaults: none
    */
   @XmlAttribute
   public String sendDigits;

   /**
    * If set to true, sendDigits is executed when called party is in early media instead of answer state.
    * 
    * Accepts: true or false
    * 
* Defaults to: false
    */
   @XmlAttribute
   public Boolean sendOnPreanswer;

   /**
    * List of SIP headers to send separated by comma. E.g. head1=val1,head2=val2,head3=val3,...,headN=valN. The SIP
    * headers are always prefixed with X-PH-. For each HTTP Request called by the dialed leg, the SIP headers will be
    * present.
    * 
    * Accepts: Only [A-Z], [a-z] and [0-9] characters are allowed for SIP headers key. Only [A-Z], [a-z], [0-9] and '%'
    * characters are allowed to ensure so you can encode this value in a URL.
    * 
* Defaults to: empty
    */
   @XmlAttribute
   public String sipHeaders;

   @XmlValue
   public String value;

}