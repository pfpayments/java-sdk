package ch.postfinance.checkout.sdk.service;

import ch.postfinance.checkout.sdk.ApiClient;

import ch.postfinance.checkout.sdk.model.ClientError;
import ch.postfinance.checkout.sdk.model.RestCountryState;
import ch.postfinance.checkout.sdk.model.ServerError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class CountryStateService {
    private ApiClient apiClient;

    public CountryStateService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * All
    * This operation returns all states of all countries.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @return List&lt;RestCountryState&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--all">All Documentation</a>

    **/
    public List<RestCountryState> all() throws IOException {
        HttpResponse response = allForHttpResponse();
        String returnType = "List&lt;RestCountryState&gt;";
        if(returnType.equals("String")){
          return (List<RestCountryState>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RestCountryState>>() {};
        return (List<RestCountryState>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * All
    * This operation returns all states of all countries.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;RestCountryState&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--all">All Documentation</a>

    **/
    public List<RestCountryState> all(Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(params);
        String returnType = "List&lt;RestCountryState&gt;";
        if(returnType.equals("String")){
            return (List<RestCountryState>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RestCountryState>>() {};
        return (List<RestCountryState>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse allForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/all");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

    public HttpResponse allForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/all");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Find by Country
    * This operation returns all states for a given country.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param code The country code in ISO code two letter format for which all states should be returned.
    * @return List&lt;RestCountryState&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>

    **/
    public List<RestCountryState> country(String code) throws IOException {
        HttpResponse response = countryForHttpResponse(code);
        String returnType = "List&lt;RestCountryState&gt;";
        if(returnType.equals("String")){
          return (List<RestCountryState>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RestCountryState>>() {};
        return (List<RestCountryState>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Find by Country
    * This operation returns all states for a given country.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param code The country code in ISO code two letter format for which all states should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;RestCountryState&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>

    **/
    public List<RestCountryState> country(String code, Map<String, Object> params) throws IOException {
        HttpResponse response = countryForHttpResponse(code, params);
        String returnType = "List&lt;RestCountryState&gt;";
        if(returnType.equals("String")){
            return (List<RestCountryState>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RestCountryState>>() {};
        return (List<RestCountryState>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse countryForHttpResponse(String code) throws IOException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new IllegalArgumentException("Missing the required parameter 'code' when calling country");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/country");
        if (code != null) {
            String key = "code";
            Object value = code;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

    public HttpResponse countryForHttpResponse(String code, Map<String, Object> params) throws IOException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new IllegalArgumentException("Missing the required parameter 'code' when calling country");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/country");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'code' to the map of query params
        allParams.put("code", code);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

}
