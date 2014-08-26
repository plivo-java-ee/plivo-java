package org.plivo.ee.helper.api.util;

import java.util.List;

import javax.ws.rs.core.MediaType;

public interface RequestTemplate
{

   public String getMethod();

   public String getHost();

   public String getPathTemplate();

   public List<String> getQueryParams();

   public List<String> getPathParams();

   public List<String> getFormParams();

   public MediaType getMediaType();

}
