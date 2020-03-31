/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.postfinancecheckout.sdk.service;

import com.postfinancecheckout.sdk.ApiCallback;
import com.postfinancecheckout.sdk.ApiClient;
import com.postfinancecheckout.sdk.ApiException;
import com.postfinancecheckout.sdk.ApiResponse;
import com.postfinancecheckout.sdk.Pair;
import com.postfinancecheckout.sdk.ProgressRequestBody;
import com.postfinancecheckout.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.postfinancecheckout.sdk.model.ClientError;
import com.postfinancecheckout.sdk.model.EntityQuery;
import com.postfinancecheckout.sdk.model.EntityQueryFilter;
import com.postfinancecheckout.sdk.model.RenderedDocument;
import com.postfinancecheckout.sdk.model.ServerError;
import com.postfinancecheckout.sdk.model.TransactionInvoice;
import com.postfinancecheckout.sdk.model.TransactionInvoiceReplacement;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionInvoiceService {
    private ApiClient apiClient;

    public TransactionInvoiceService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for count
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = filter;

        // create path and map variables
        String localVarPath = "/transaction-invoice/count";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call countValidateBeforeCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling count(Async)");
        }
        

        com.squareup.okhttp.Call call = countCall(spaceId, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>
     */
    public Long count(Long spaceId, EntityQueryFilter filter) throws ApiException {
        ApiResponse<Long> resp = countWithHttpInfo(spaceId, filter);
        return resp.getData();
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>
     */
    public ApiResponse<Long> countWithHttpInfo(Long spaceId, EntityQueryFilter filter) throws ApiException {
        com.squareup.okhttp.Call call = countValidateBeforeCall(spaceId, filter, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Count (asynchronously)
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countAsync(Long spaceId, EntityQueryFilter filter, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = countValidateBeforeCall(spaceId, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInvoiceDocument
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>
     */
    public com.squareup.okhttp.Call getInvoiceDocumentCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-invoice/getInvoiceDocument";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInvoiceDocumentValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getInvoiceDocument(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInvoiceDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = getInvoiceDocumentCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getInvoiceDocument
     * Returns the PDF document for the transaction invoice with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @return RenderedDocument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>
     */
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id) throws ApiException {
        ApiResponse<RenderedDocument> resp = getInvoiceDocumentWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * getInvoiceDocument
     * Returns the PDF document for the transaction invoice with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @return ApiResponse&lt;RenderedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>
     */
    public ApiResponse<RenderedDocument> getInvoiceDocumentWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = getInvoiceDocumentValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getInvoiceDocument (asynchronously)
     * Returns the PDF document for the transaction invoice with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>
     */
    public com.squareup.okhttp.Call getInvoiceDocumentAsync(Long spaceId, Long id, final ApiCallback<RenderedDocument> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInvoiceDocumentValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInvoiceDocumentWithTargetMediaType
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>
     */
    public com.squareup.okhttp.Call getInvoiceDocumentWithTargetMediaTypeCall(Long spaceId, Long id, Long targetMediaTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-invoice/getInvoiceDocumentWithTargetMediaType";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));
        if (targetMediaTypeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("targetMediaTypeId", targetMediaTypeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInvoiceDocumentWithTargetMediaTypeValidateBeforeCall(Long spaceId, Long id, Long targetMediaTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getInvoiceDocumentWithTargetMediaType(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInvoiceDocumentWithTargetMediaType(Async)");
        }
        
        // verify the required parameter 'targetMediaTypeId' is set
        if (targetMediaTypeId == null) {
            throw new ApiException("Missing the required parameter 'targetMediaTypeId' when calling getInvoiceDocumentWithTargetMediaType(Async)");
        }
        

        com.squareup.okhttp.Call call = getInvoiceDocumentWithTargetMediaTypeCall(spaceId, id, targetMediaTypeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getInvoiceDocumentWithTargetMediaType
     * Returns the PDF document for the transaction invoice with given id and target media type id.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for. (required)
     * @return RenderedDocument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>
     */
    public RenderedDocument getInvoiceDocumentWithTargetMediaType(Long spaceId, Long id, Long targetMediaTypeId) throws ApiException {
        ApiResponse<RenderedDocument> resp = getInvoiceDocumentWithTargetMediaTypeWithHttpInfo(spaceId, id, targetMediaTypeId);
        return resp.getData();
    }

    /**
     * getInvoiceDocumentWithTargetMediaType
     * Returns the PDF document for the transaction invoice with given id and target media type id.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for. (required)
     * @return ApiResponse&lt;RenderedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>
     */
    public ApiResponse<RenderedDocument> getInvoiceDocumentWithTargetMediaTypeWithHttpInfo(Long spaceId, Long id, Long targetMediaTypeId) throws ApiException {
        com.squareup.okhttp.Call call = getInvoiceDocumentWithTargetMediaTypeValidateBeforeCall(spaceId, id, targetMediaTypeId, null, null);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getInvoiceDocumentWithTargetMediaType (asynchronously)
     * Returns the PDF document for the transaction invoice with given id and target media type id.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>
     */
    public com.squareup.okhttp.Call getInvoiceDocumentWithTargetMediaTypeAsync(Long spaceId, Long id, Long targetMediaTypeId, final ApiCallback<RenderedDocument> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInvoiceDocumentWithTargetMediaTypeValidateBeforeCall(spaceId, id, targetMediaTypeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for isReplacementPossible
     * @param spaceId  (required)
     * @param id The invoice which should be checked if a replacement is possible. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>
     */
    public com.squareup.okhttp.Call isReplacementPossibleCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-invoice/isReplacementPossible";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call isReplacementPossibleValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling isReplacementPossible(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling isReplacementPossible(Async)");
        }
        

        com.squareup.okhttp.Call call = isReplacementPossibleCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * isReplacementPossible
     * Returns whether the transaction invoice with the given id can be replaced.
     * @param spaceId  (required)
     * @param id The invoice which should be checked if a replacement is possible. (required)
     * @return Boolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>
     */
    public Boolean isReplacementPossible(Long spaceId, Long id) throws ApiException {
        ApiResponse<Boolean> resp = isReplacementPossibleWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * isReplacementPossible
     * Returns whether the transaction invoice with the given id can be replaced.
     * @param spaceId  (required)
     * @param id The invoice which should be checked if a replacement is possible. (required)
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>
     */
    public ApiResponse<Boolean> isReplacementPossibleWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = isReplacementPossibleValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * isReplacementPossible (asynchronously)
     * Returns whether the transaction invoice with the given id can be replaced.
     * @param spaceId  (required)
     * @param id The invoice which should be checked if a replacement is possible. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>
     */
    public com.squareup.okhttp.Call isReplacementPossibleAsync(Long spaceId, Long id, final ApiCallback<Boolean> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = isReplacementPossibleValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for markAsDerecognized
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as derecognized. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>
     */
    public com.squareup.okhttp.Call markAsDerecognizedCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-invoice/markAsDerecognized";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call markAsDerecognizedValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling markAsDerecognized(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling markAsDerecognized(Async)");
        }
        

        com.squareup.okhttp.Call call = markAsDerecognizedCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Mark as Derecognized
     * Marks the transaction invoice with the given id as derecognized.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as derecognized. (required)
     * @return TransactionInvoice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>
     */
    public TransactionInvoice markAsDerecognized(Long spaceId, Long id) throws ApiException {
        ApiResponse<TransactionInvoice> resp = markAsDerecognizedWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Mark as Derecognized
     * Marks the transaction invoice with the given id as derecognized.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as derecognized. (required)
     * @return ApiResponse&lt;TransactionInvoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>
     */
    public ApiResponse<TransactionInvoice> markAsDerecognizedWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = markAsDerecognizedValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Mark as Derecognized (asynchronously)
     * Marks the transaction invoice with the given id as derecognized.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as derecognized. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>
     */
    public com.squareup.okhttp.Call markAsDerecognizedAsync(Long spaceId, Long id, final ApiCallback<TransactionInvoice> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = markAsDerecognizedValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for markAsPaid
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as paid. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>
     */
    public com.squareup.okhttp.Call markAsPaidCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-invoice/markAsPaid";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call markAsPaidValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling markAsPaid(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling markAsPaid(Async)");
        }
        

        com.squareup.okhttp.Call call = markAsPaidCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Mark as Paid
     * Marks the transaction invoice with the given id as paid.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as paid. (required)
     * @return TransactionInvoice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>
     */
    public TransactionInvoice markAsPaid(Long spaceId, Long id) throws ApiException {
        ApiResponse<TransactionInvoice> resp = markAsPaidWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Mark as Paid
     * Marks the transaction invoice with the given id as paid.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as paid. (required)
     * @return ApiResponse&lt;TransactionInvoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>
     */
    public ApiResponse<TransactionInvoice> markAsPaidWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = markAsPaidValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Mark as Paid (asynchronously)
     * Marks the transaction invoice with the given id as paid.
     * @param spaceId  (required)
     * @param id The id of the transaction invoice which should be marked as paid. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>
     */
    public com.squareup.okhttp.Call markAsPaidAsync(Long spaceId, Long id, final ApiCallback<TransactionInvoice> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = markAsPaidValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-invoice/read";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling read(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
        }
        

        com.squareup.okhttp.Call call = readCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be returned. (required)
     * @return TransactionInvoice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>
     */
    public TransactionInvoice read(Long spaceId, Long id) throws ApiException {
        ApiResponse<TransactionInvoice> resp = readWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be returned. (required)
     * @return ApiResponse&lt;TransactionInvoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>
     */
    public ApiResponse<TransactionInvoice> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<TransactionInvoice> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for replace
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be replaced. (required)
     * @param replacement  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>
     */
    public com.squareup.okhttp.Call replaceCall(Long spaceId, Long id, TransactionInvoiceReplacement replacement, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = replacement;

        // create path and map variables
        String localVarPath = "/transaction-invoice/replace";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceValidateBeforeCall(Long spaceId, Long id, TransactionInvoiceReplacement replacement, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling replace(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling replace(Async)");
        }
        
        // verify the required parameter 'replacement' is set
        if (replacement == null) {
            throw new ApiException("Missing the required parameter 'replacement' when calling replace(Async)");
        }
        

        com.squareup.okhttp.Call call = replaceCall(spaceId, id, replacement, progressListener, progressRequestListener);
        return call;

    }

    /**
     * replace
     * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be replaced. (required)
     * @param replacement  (required)
     * @return TransactionInvoice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>
     */
    public TransactionInvoice replace(Long spaceId, Long id, TransactionInvoiceReplacement replacement) throws ApiException {
        ApiResponse<TransactionInvoice> resp = replaceWithHttpInfo(spaceId, id, replacement);
        return resp.getData();
    }

    /**
     * replace
     * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be replaced. (required)
     * @param replacement  (required)
     * @return ApiResponse&lt;TransactionInvoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>
     */
    public ApiResponse<TransactionInvoice> replaceWithHttpInfo(Long spaceId, Long id, TransactionInvoiceReplacement replacement) throws ApiException {
        com.squareup.okhttp.Call call = replaceValidateBeforeCall(spaceId, id, replacement, null, null);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * replace (asynchronously)
     * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
     * @param spaceId  (required)
     * @param id The id of the transaction invoices which should be replaced. (required)
     * @param replacement  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>
     */
    public com.squareup.okhttp.Call replaceAsync(Long spaceId, Long id, TransactionInvoiceReplacement replacement, final ApiCallback<TransactionInvoice> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = replaceValidateBeforeCall(spaceId, id, replacement, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionInvoice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param spaceId  (required)
     * @param query The query restricts the transaction invoices which are returned by the search. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = query;

        // create path and map variables
        String localVarPath = "/transaction-invoice/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchValidateBeforeCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling search(Async)");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCall(spaceId, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the transaction invoices which are returned by the search. (required)
     * @return List&lt;TransactionInvoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>
     */
    public List<TransactionInvoice> search(Long spaceId, EntityQuery query) throws ApiException {
        ApiResponse<List<TransactionInvoice>> resp = searchWithHttpInfo(spaceId, query);
        return resp.getData();
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the transaction invoices which are returned by the search. (required)
     * @return ApiResponse&lt;List&lt;TransactionInvoice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>
     */
    public ApiResponse<List<TransactionInvoice>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, null, null);
        Type localVarReturnType = new TypeToken<List<TransactionInvoice>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the transaction invoices which are returned by the search. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<TransactionInvoice>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TransactionInvoice>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
