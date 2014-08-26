package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
public class Response {
	
	@XmlElement(name="Dial")
	public Dial dial;
	
	
	@XmlElement(name="Conference")
	public Conference conference;
	
	@XmlElement(name="GetDigits")
	public GetDigits getDigits;
	
	@XmlElement(name="HangUp")
	public HangUp hangUp;

   @XmlElement(name = "Message")
   public Message message;
	
	@XmlElement(name="Play")
	public Play play;

   @XmlElement(name = "PreAnswer")
   public PreAnswer preAnswer;
	
	@XmlElement(name="Record")
	public Record record;

   @XmlElement(name = "Redirect")
   public Redirect redirect;
	
	@XmlElement(name="Speak")
	public Speak speak;

   @XmlElement(name = "Wait")
   public Wait wait;

   @XmlElement(name = "DTMF")
   public Dtmf dtmf;
	
}
