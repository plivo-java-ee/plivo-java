package org.plivo.ee.helper.xml.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)
public enum Language
{

   @XmlEnumValue("da-DK")
   Danish("da-DK"),
   @XmlEnumValue("nl-NL")
   Dutch("nl-NL"),
   @XmlEnumValue("en-AU")
   English_Australian("en-AU"),
   @XmlEnumValue("en-AU")
   English_British("en-AU"),
   @XmlEnumValue("en-US")
   English_USA("en-US"),
   @XmlEnumValue("fr-FR")
   French("fr-FR"),
   @XmlEnumValue("fr-CA")
   French_Canadian("fr-CA"),
   @XmlEnumValue("de-DE")
   German("de-DE"),
   @XmlEnumValue("it-IT")
   Italian("it-IT"),
   @XmlEnumValue("pl-PL")
   Polish("pl-PL"),
   @XmlEnumValue("pt-PT")
   Portuguese("pt-PT"),
   @XmlEnumValue("pt-BR")
   Portuguese_Brazilian("pt-BR"),
   @XmlEnumValue("ru-RU")
   Russian("ru-RU"),
   @XmlEnumValue("es-ES")
   Spanish("es-ES"),
   @XmlEnumValue("es-US")
   Spanish_USA("es-US"),
   @XmlEnumValue("sv-SE")
   Swedish("sv-SE");

   private String lang;

   Language(String lang)
   {
      this.lang = lang;
   }

   public String getLang()
   {
      return lang;
   }

}
