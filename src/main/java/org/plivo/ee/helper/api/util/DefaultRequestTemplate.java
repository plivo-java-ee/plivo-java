package org.plivo.ee.helper.api.util;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

public class DefaultRequestTemplate implements RequestTemplate
{

   private String method;
   private String host;
   private String pathTemplate;
   private List<String> queryParams;
   private List<String> pathParams;
   private List<String> formParams;
   private MediaType mediaType;

   public DefaultRequestTemplate(String method, String host, String pathTemplate)
   {
      this.host = host;
      this.method = method;
      this.pathTemplate = pathTemplate;
   }

   public DefaultRequestTemplate(String method, String host, String pathTemplate,
            List<String> queryParams, List<String> pathParams,
            List<String> formParams)
   {
      this(host, method, pathTemplate);
      this.queryParams = queryParams;
      this.pathParams = pathParams;
      this.formParams = formParams;
   }

   public DefaultRequestTemplate(String method, String host, String pathTemplate,
            List<String> queryParams, List<String> pathParams,
            List<String> formParams, MediaType mediaType)
   {
      this(host, method, pathTemplate);
      this.queryParams = queryParams;
      this.pathParams = pathParams;
      this.formParams = formParams;
      this.mediaType = mediaType;
   }

   public String getMethod()
   {
      return method;
   }

   public MediaType getMediaType()
   {
      return mediaType;
   }

   public String getHost()
   {
      return host;
   }

   public String getPathTemplate()
   {
      return pathTemplate;
   }

   public List<String> getQueryParams()
   {
      return queryParams;
   }

   public List<String> getPathParams()
   {
      return pathParams;
   }

   public List<String> getFormParams()
   {
      return formParams;
   }

   public DefaultRequestTemplate queryParams(String... params)
   {
      if (params != null && params.length > 0)
      {
         queryParams = Arrays.asList(params);
      }
      return this;
   }

   public DefaultRequestTemplate pathParams(String... params)
   {
      if (params != null && params.length > 0)
      {
         pathParams = Arrays.asList(params);
      }
      return this;
   }

   public DefaultRequestTemplate formParams(String... params)
   {
      if (params != null && params.length > 0)
      {
         formParams = Arrays.asList(params);
      }
      return this;
   }

}
