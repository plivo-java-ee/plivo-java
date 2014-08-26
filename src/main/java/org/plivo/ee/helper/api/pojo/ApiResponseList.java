package org.plivo.ee.helper.api.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApiResponseList<T>
{
   public String api_id;

   @XmlElement(name = "meta")
   public ApiReponseMeta meta;

   @XmlElement(name = "objects")
   public List<T> objects;

   @Override
   public String toString()
   {
      return "ApiResponseList [" + (api_id != null ? "api_id=" + api_id + ", " : "")
               + (meta != null ? "meta=" + meta + ", " : "") + (objects != null ? "objects=" + objects : "") + "]";
   }

}
