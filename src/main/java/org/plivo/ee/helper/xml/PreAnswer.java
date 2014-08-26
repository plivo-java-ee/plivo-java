package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PreAnswer")
public class PreAnswer
{

   @XmlElement(name = "Speak")
   public Speak speak;

   @XmlElement(name = "Play")
   public Play play;

   @XmlElement(name = "Wait")
   public Wait wait;
}
