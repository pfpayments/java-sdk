package ch.postfinance.sdk.service;

import static ch.postfinance.sdk.ErrorCode.*;

import ch.postfinance.sdk.ApiClient;
import ch.postfinance.sdk.ErrorCode;
import ch.postfinance.sdk.exception.PostFinanceCheckoutSdkException;
import ch.postfinance.sdk.util.URIBuilderUtil;
import ch.postfinance.sdk.StringUtil;

import ch.postfinance.sdk.model.ClientError;
import ch.postfinance.sdk.model.EntityQuery;
import ch.postfinance.sdk.model.EntityQueryFilter;
import ch.postfinance.sdk.model.ServerError;
import ch.postfinance.sdk.model.SubscriptionAffiliate;
import ch.postfinance.sdk.model.SubscriptionAffiliateCreate;
import ch.postfinance.sdk.model.SubscriptionAffiliateUpdate;


import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import org.apache.http.client.utils.URIBuilder;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;



public class SubscriptionAffiliateService {
    private ApiClient apiClient;

    public SubscriptionAffiliateService(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

  /**
    * Count
    
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param filter The filter which restricts the entities which are used to calculate the count.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--count">Count Documentation</a>

    **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        String returnType = "Long";
        if(returnType.equals("String")){
          return (Long) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Long>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Count
    
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--count">Count Documentation</a>

    **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        String returnType = "Long";
        if(returnType.equals("String")){
            return (Long) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Long>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/count");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse countForHttpResponse(Long spaceId, java.io.InputStream filter, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/count");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = filter == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, filter);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/count");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Create
    
    * Creates the entity with the given properties.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entity The subscription affiliate object with the properties which should be created.
    * @return SubscriptionAffiliate
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--create">Create Documentation</a>

    **/
    public SubscriptionAffiliate create(Long spaceId, SubscriptionAffiliateCreate entity) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity);
        String returnType = "SubscriptionAffiliate";
        if(returnType.equals("String")){
          return (SubscriptionAffiliate) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionAffiliate>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionAffiliate)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create
    
    * Creates the entity with the given properties.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entity The subscription affiliate object with the properties which should be created.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionAffiliate
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--create">Create Documentation</a>

    **/
    public SubscriptionAffiliate create(Long spaceId, SubscriptionAffiliateCreate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity, params);
        String returnType = "SubscriptionAffiliate";
        if(returnType.equals("String")){
            return (SubscriptionAffiliate) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionAffiliate>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionAffiliate)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionAffiliateCreate entity) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling create");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/create");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse createForHttpResponse(Long spaceId, java.io.InputStream entity, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling create");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/create");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = entity == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionAffiliateCreate entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling create");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/create");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Delete
    
    * Deletes the entity with the given id.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id 
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--delete">Delete Documentation</a>

    **/
    public void delete(Long spaceId, Long id) throws IOException {
        deleteForHttpResponse(spaceId, id);
    }

  /**
    * Delete
    
    * Deletes the entity with the given id.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--delete">Delete Documentation</a>

    **/
    public void delete(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        deleteForHttpResponse(spaceId, id, params);
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling delete");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling delete");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/delete");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(id);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, java.io.InputStream id, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling delete");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling delete");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/delete");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = id == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, id);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling delete");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling delete");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/delete");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(id);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Read
    
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the subscription affiliate case which should be returned.
    * @return SubscriptionAffiliate
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--read">Read Documentation</a>

    **/
    public SubscriptionAffiliate read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        String returnType = "SubscriptionAffiliate";
        if(returnType.equals("String")){
          return (SubscriptionAffiliate) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionAffiliate>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionAffiliate)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the subscription affiliate case which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionAffiliate
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--read">Read Documentation</a>

    **/
    public SubscriptionAffiliate read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        String returnType = "SubscriptionAffiliate";
        if(returnType.equals("String")){
            return (SubscriptionAffiliate) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionAffiliate>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionAffiliate)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/read");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (id != null) {
            String key = "id";
            Object value = id;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Search
    
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the affiliates which are returned by the search.
    * @return List&lt;SubscriptionAffiliate&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--search">Search Documentation</a>

    **/
    public List<SubscriptionAffiliate> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        String returnType = "List&lt;SubscriptionAffiliate&gt;";
        if(returnType.equals("String")){
          return (List<SubscriptionAffiliate>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<SubscriptionAffiliate>>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<SubscriptionAffiliate>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Search
    
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the affiliates which are returned by the search.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;SubscriptionAffiliate&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--search">Search Documentation</a>

    **/
    public List<SubscriptionAffiliate> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        String returnType = "List&lt;SubscriptionAffiliate&gt;";
        if(returnType.equals("String")){
            return (List<SubscriptionAffiliate>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<SubscriptionAffiliate>>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<SubscriptionAffiliate>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/search");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse searchForHttpResponse(Long spaceId, java.io.InputStream query, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/search");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = query == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Update
    
    * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entity The object with all the properties which should be updated. The id and the version are required properties.
    * @return SubscriptionAffiliate
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--update">Update Documentation</a>

    **/
    public SubscriptionAffiliate update(Long spaceId, SubscriptionAffiliateUpdate entity) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity);
        String returnType = "SubscriptionAffiliate";
        if(returnType.equals("String")){
          return (SubscriptionAffiliate) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionAffiliate>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionAffiliate)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update
    
    * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entity The object with all the properties which should be updated. The id and the version are required properties.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionAffiliate
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service/v1#subscription-affiliate-service--update">Update Documentation</a>

    **/
    public SubscriptionAffiliate update(Long spaceId, SubscriptionAffiliateUpdate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity, params);
        String returnType = "SubscriptionAffiliate";
        if(returnType.equals("String")){
            return (SubscriptionAffiliate) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionAffiliate>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionAffiliate)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateForHttpResponse(Long spaceId, SubscriptionAffiliateUpdate entity) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling update");
        }
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/update");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse updateForHttpResponse(Long spaceId, java.io.InputStream entity, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling update");
        }
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/update");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = entity == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse updateForHttpResponse(Long spaceId, SubscriptionAffiliateUpdate entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling update");
        }
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-affiliate/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }



    private boolean isNoBodyResponse(HttpResponse response) throws IOException {
        java.io.InputStream content = response.getContent();
        return content.available() == 0;
    }
}
