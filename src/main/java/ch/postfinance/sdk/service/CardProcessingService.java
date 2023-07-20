package ch.postfinance.sdk.service;

import ch.postfinance.sdk.ApiClient;
import ch.postfinance.sdk.ErrorCode;
import ch.postfinance.sdk.PostFinanceCheckoutSdkException;
import ch.postfinance.sdk.URIBuilderUtil;

import ch.postfinance.sdk.model.AuthenticatedCardDataCreate;
import ch.postfinance.sdk.model.ClientError;
import ch.postfinance.sdk.model.ServerError;
import ch.postfinance.sdk.model.TokenizedCardDataCreate;
import ch.postfinance.sdk.model.Transaction;


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


public class CardProcessingService {
    private ApiClient apiClient;

    public CardProcessingService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Process
    
    * The process method will process the transaction with the given card details without using 3-D secure.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#card-processing-service--process">Process Documentation</a>

    **/
    public Transaction process(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, AuthenticatedCardDataCreate cardData) throws IOException {
        HttpResponse response = processForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData);
        String returnType = "Transaction";
        if(returnType.equals("String")){
          return (Transaction) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Transaction>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Process
    
    * The process method will process the transaction with the given card details without using 3-D secure.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#card-processing-service--process">Process Documentation</a>

    **/
    public Transaction process(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, AuthenticatedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        HttpResponse response = processForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData, params);
        String returnType = "Transaction";
        if(returnType.equals("String")){
            return (Transaction) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Transaction>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse processForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, AuthenticatedCardDataCreate cardData) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling process");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling process");
        }
        // verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling process");
        }
        // verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling process");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/card-processing/process");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (paymentMethodConfigurationId != null) {
            String key = "paymentMethodConfigurationId";
            Object value = paymentMethodConfigurationId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse processForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, java.io.InputStream cardData, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling process");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling process");
        }
        // verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling process");
        }
        // verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling process");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/card-processing/process");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (paymentMethodConfigurationId != null) {
            String key = "paymentMethodConfigurationId";
            Object value = paymentMethodConfigurationId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = cardData == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, cardData);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse processForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, AuthenticatedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling process");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling process");
        }
        // verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling process");
        }
        // verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling process");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/card-processing/process");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'paymentMethodConfigurationId' to the map of query params
        allParams.put("paymentMethodConfigurationId", paymentMethodConfigurationId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Process With 3-D Secure
    
    * The process method will process the transaction with the given card details by eventually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#card-processing-service--process-with3-d-secure">Process With 3-D Secure Documentation</a>

    **/
    public String processWith3DSecure(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, TokenizedCardDataCreate cardData) throws IOException {
        HttpResponse response = processWith3DSecureForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData);
        String returnType = "String";
        if(returnType.equals("String")){
          return (String) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<String>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (String)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Process With 3-D Secure
    
    * The process method will process the transaction with the given card details by eventually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#card-processing-service--process-with3-d-secure">Process With 3-D Secure Documentation</a>

    **/
    public String processWith3DSecure(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, TokenizedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        HttpResponse response = processWith3DSecureForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData, params);
        String returnType = "String";
        if(returnType.equals("String")){
            return (String) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<String>() {};
        if (isNoBodyResponse(response)) {
            throw new PostFinanceCheckoutSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (String)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse processWith3DSecureForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, TokenizedCardDataCreate cardData) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWith3DSecure");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling processWith3DSecure");
        }
        // verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure");
        }
        // verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling processWith3DSecure");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/card-processing/processWith3DSecure");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (paymentMethodConfigurationId != null) {
            String key = "paymentMethodConfigurationId";
            Object value = paymentMethodConfigurationId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse processWith3DSecureForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, java.io.InputStream cardData, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWith3DSecure");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling processWith3DSecure");
        }
        // verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure");
        }
        // verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling processWith3DSecure");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/card-processing/processWith3DSecure");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (paymentMethodConfigurationId != null) {
            String key = "paymentMethodConfigurationId";
            Object value = paymentMethodConfigurationId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = cardData == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, cardData);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse processWith3DSecureForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, TokenizedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWith3DSecure");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling processWith3DSecure");
        }
        // verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure");
        }
        // verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling processWith3DSecure");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/card-processing/processWith3DSecure");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'paymentMethodConfigurationId' to the map of query params
        allParams.put("paymentMethodConfigurationId", paymentMethodConfigurationId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
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
