package org.plivo.ee.helper.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
public class Response
{

   public Response()
   {
   }

   public Response(Conference conference)
   {
      this.conference = conference;
   }

   public Response(GetDigits getDigits)
   {
      this.getDigits = getDigits;
   }

   public Response(HangUp hangUp)
   {
      this.hangUp = hangUp;
   }

   public Response(Message message)
   {
      this.message = message;
   }

   public Response(Play play)
   {
      this.play = play;
   }

   public Response(PreAnswer preAnswer)
   {
      this.preAnswer = preAnswer;
   }

   public Response(Redirect redirect)
   {
      this.redirect = redirect;
   }

   public Response(Speak speak)
   {
      this.speak = speak;
   }

   public Response(Wait wait)
   {
      this.wait = wait;
   }

   public Response(List<Dial> dials)
   {
      this.dials = dials;
   }

   public Response(Dial dial)
   {
      dial(dial);
   }

   @XmlElement(name = "Dial")
   public List<Dial> dials;

   public Response dial(Dial dial)
   {
      if (dials == null)
      {
         dials = new ArrayList<>();
      }
      dials.add(dial);
      return this;
   }

   @XmlElement(name = "Conference")
   public Conference conference;

   @XmlElement(name = "GetDigits")
   public GetDigits getDigits;

   @XmlElement(name = "HangUp")
   public HangUp hangUp;

   @XmlElement(name = "Message")
   public Message message;

   @XmlElement(name = "Play")
   public Play play;

   @XmlElement(name = "PreAnswer")
   public PreAnswer preAnswer;

   @XmlElement(name = "Record")
   public Record record;

   @XmlElement(name = "Redirect")
   public Redirect redirect;

   @XmlElement(name = "Speak")
   public Speak speak;

   @XmlElement(name = "Wait")
   public Wait wait;

   @XmlElement(name = "DTMF")
   public Dtmf dtmf;

}
