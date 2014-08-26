package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Redirect")
public class Redirect
{

   /**
    * Used to specify the HTTP request mode to obtain the Redirect URL.
    * 
    * Accepts: GET, POST
    * 
* Defaults to: POST
    */
   @XmlAttribute
   public Method method;

}
