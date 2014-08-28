package org.plivo.ee.helper.api.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.ResponseProcessingException;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class RequestUtils
{
   private static Logger logger = Logger.getLogger(RequestUtils.class.getName());

   public static <T> T submit(Client client, RequestTemplate requestTemplate,
            Map<String, String> params, Class<T> clazz) throws ClientErrorException
   {
      Response response = submit(client, requestTemplate, params);
      if (response == null)
      {
         throw new ResponseProcessingException(null, "no response");
      }
      if (response.getStatus() < 200 || response.getStatus() >= 300)
      {
         logger.log(Level.SEVERE, response.getStatusInfo() == null ? "no status info"
                  : response.getStatusInfo().getReasonPhrase());
         throw new ClientErrorException(response);
      }
      try
      {
         return response.readEntity(clazz);
      }
      catch (Exception e)
      {
         logger.log(Level.SEVERE, e.getMessage(), e);
         throw new ClientErrorException(response);
      }
      finally
      {
         response.close();
      }
   }

   public static Response submit(Client client,
            RequestTemplate requestTemplate,
            Map<String, String> params) throws ClientErrorException
   {
      try
      {
         WebTarget webTarget = client.target(requestTemplate.getHost())
                  .path(requestTemplate.getPathTemplate());
         return submit(webTarget, requestTemplate, params);
      }
      catch (ClientErrorException re)
      {
         throw (re);
      }
      catch (Exception e)
      {
         logger.log(Level.SEVERE, e.getMessage(), e);
         return null;
      }

   }

   public static Response submit(WebTarget webTarget,
            RequestTemplate requestTemplate,
            Map<String, ? extends Object> params) throws ClientErrorException
   {
      Response response = null;
      try
      {
         if (requestTemplate.getPathParams() != null)
         {
            for (String pathParam : requestTemplate.getPathParams())
            {
               Object paramValue = params.get(pathParam);
               if (paramValue != null)
               {
                  webTarget = webTarget.resolveTemplate(pathParam,
                           paramValue.toString());
               }
            }
         }
         if (requestTemplate.getQueryParams() != null)
         {
            for (String queryParam : requestTemplate.getQueryParams())
            {
               Object paramValue = params.get(queryParam);
               if (paramValue != null)
               {
                  webTarget = webTarget.queryParam(queryParam,
                           paramValue.toString());
               }
            }
         }
         Builder request = webTarget.request();
         switch (requestTemplate.getMethod())
         {
         case HttpMethod.GET:
            response = request.get();
            break;
         case HttpMethod.DELETE:
            response = request.delete();
            break;
         case HttpMethod.HEAD:
            response = request.head();
            break;
         case HttpMethod.POST:
            if (requestTemplate.getMediaType() != null
                     && requestTemplate.getMediaType().equals(MediaType.APPLICATION_FORM_URLENCODED))
            {
               response = request.post(Entity.form(getForm(requestTemplate.getFormParams(), params)));
            }
            else
            {
               response = request.post(Entity.entity(getMap(requestTemplate.getFormParams(), params),
                        MediaType.APPLICATION_JSON));
            }

            break;
         case HttpMethod.PUT:
            if (requestTemplate.getMediaType() != null
                     && requestTemplate.getMediaType().equals(MediaType.APPLICATION_FORM_URLENCODED))
            {
               response = request.put(Entity.form(getForm(requestTemplate.getFormParams(), params)));
            }
            else
            {
               response = request.put(Entity.entity(getMap(requestTemplate.getFormParams(), params),
                        MediaType.APPLICATION_JSON));
            }
            break;
         default:
            break;
         }
         return response;
      }
      catch (Exception e)
      {
         logger.log(Level.SEVERE, e.getMessage(), e);
         throw new ClientErrorException(e.getMessage(), Status.INTERNAL_SERVER_ERROR, e);
      }
   }

   private static Form getForm(List<String> formParams, Map<String, ? extends Object> params)
   {
      Form form = new Form();
      for (String queryParam : formParams)
      {
         Object paramValue = params.get(queryParam);
         if (paramValue != null)
         {
            form.param(queryParam, paramValue.toString());
         }
      }
      return form;
   }

   private static Map<String, String> getMap(List<String> formParams, Map<String, ? extends Object> params)
   {
      Map<String, String> map = new HashMap<String, String>();
      for (String queryParam : formParams)
      {
         Object paramValue = params.get(queryParam);
         if (paramValue != null)
         {
            map.put(queryParam, paramValue.toString());
         }
      }
      return map;
   }
}