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
import com.postfinancecheckout.sdk.model.Refund;
import com.postfinancecheckout.sdk.model.RefundCreate;
import com.postfinancecheckout.sdk.model.RenderedDocument;
import com.postfinancecheckout.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefundService {
    private ApiClient apiClient;

    public RefundService(ApiClient apiClient) {
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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = filter;

        // create path and map variables
        String localVarPath = "/refund/count";

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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--count">Count Documentation</a>
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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--count">Count Documentation</a>
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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--count">Count Documentation</a>
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
     * Build call for fail
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as failed. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--fail">fail Documentation</a>
     */
    public com.squareup.okhttp.Call failCall(Long spaceId, Long refundId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/refund/fail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (refundId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refundId", refundId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call failValidateBeforeCall(Long spaceId, Long refundId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling fail(Async)");
        }
        
        // verify the required parameter 'refundId' is set
        if (refundId == null) {
            throw new ApiException("Missing the required parameter 'refundId' when calling fail(Async)");
        }
        

        com.squareup.okhttp.Call call = failCall(spaceId, refundId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * fail
     * This operation allows to mark a refund as failed which is in state MANUAL_CHECK.
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as failed. (required)
     * @return Refund
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--fail">fail Documentation</a>
     */
    public Refund fail(Long spaceId, Long refundId) throws ApiException {
        ApiResponse<Refund> resp = failWithHttpInfo(spaceId, refundId);
        return resp.getData();
    }

    /**
     * fail
     * This operation allows to mark a refund as failed which is in state MANUAL_CHECK.
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as failed. (required)
     * @return ApiResponse&lt;Refund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--fail">fail Documentation</a>
     */
    public ApiResponse<Refund> failWithHttpInfo(Long spaceId, Long refundId) throws ApiException {
        com.squareup.okhttp.Call call = failValidateBeforeCall(spaceId, refundId, null, null);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * fail (asynchronously)
     * This operation allows to mark a refund as failed which is in state MANUAL_CHECK.
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as failed. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--fail">fail Documentation</a>
     */
    public com.squareup.okhttp.Call failAsync(Long spaceId, Long refundId, final ApiCallback<Refund> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = failValidateBeforeCall(spaceId, refundId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRefundDocument
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document">getRefundDocument Documentation</a>
     */
    public com.squareup.okhttp.Call getRefundDocumentCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/refund/getRefundDocument";

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
    private com.squareup.okhttp.Call getRefundDocumentValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getRefundDocument(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRefundDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = getRefundDocumentCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getRefundDocument
     * Returns the PDF document for the refund with given id.
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @return RenderedDocument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document">getRefundDocument Documentation</a>
     */
    public RenderedDocument getRefundDocument(Long spaceId, Long id) throws ApiException {
        ApiResponse<RenderedDocument> resp = getRefundDocumentWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * getRefundDocument
     * Returns the PDF document for the refund with given id.
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @return ApiResponse&lt;RenderedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document">getRefundDocument Documentation</a>
     */
    public ApiResponse<RenderedDocument> getRefundDocumentWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = getRefundDocumentValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getRefundDocument (asynchronously)
     * Returns the PDF document for the refund with given id.
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document">getRefundDocument Documentation</a>
     */
    public com.squareup.okhttp.Call getRefundDocumentAsync(Long spaceId, Long id, final ApiCallback<RenderedDocument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRefundDocumentValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRefundDocumentWithTargetMediaType
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the refund should be generated for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document-with-target-media-type">getRefundDocumentWithTargetMediaType Documentation</a>
     */
    public com.squareup.okhttp.Call getRefundDocumentWithTargetMediaTypeCall(Long spaceId, Long id, Long targetMediaTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/refund/getRefundDocumentWithTargetMediaType";

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
    private com.squareup.okhttp.Call getRefundDocumentWithTargetMediaTypeValidateBeforeCall(Long spaceId, Long id, Long targetMediaTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getRefundDocumentWithTargetMediaType(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRefundDocumentWithTargetMediaType(Async)");
        }
        
        // verify the required parameter 'targetMediaTypeId' is set
        if (targetMediaTypeId == null) {
            throw new ApiException("Missing the required parameter 'targetMediaTypeId' when calling getRefundDocumentWithTargetMediaType(Async)");
        }
        

        com.squareup.okhttp.Call call = getRefundDocumentWithTargetMediaTypeCall(spaceId, id, targetMediaTypeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getRefundDocumentWithTargetMediaType
     * Returns the PDF document for the refund with given id and the given target media type.
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the refund should be generated for. (required)
     * @return RenderedDocument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document-with-target-media-type">getRefundDocumentWithTargetMediaType Documentation</a>
     */
    public RenderedDocument getRefundDocumentWithTargetMediaType(Long spaceId, Long id, Long targetMediaTypeId) throws ApiException {
        ApiResponse<RenderedDocument> resp = getRefundDocumentWithTargetMediaTypeWithHttpInfo(spaceId, id, targetMediaTypeId);
        return resp.getData();
    }

    /**
     * getRefundDocumentWithTargetMediaType
     * Returns the PDF document for the refund with given id and the given target media type.
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the refund should be generated for. (required)
     * @return ApiResponse&lt;RenderedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document-with-target-media-type">getRefundDocumentWithTargetMediaType Documentation</a>
     */
    public ApiResponse<RenderedDocument> getRefundDocumentWithTargetMediaTypeWithHttpInfo(Long spaceId, Long id, Long targetMediaTypeId) throws ApiException {
        com.squareup.okhttp.Call call = getRefundDocumentWithTargetMediaTypeValidateBeforeCall(spaceId, id, targetMediaTypeId, null, null);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getRefundDocumentWithTargetMediaType (asynchronously)
     * Returns the PDF document for the refund with given id and the given target media type.
     * @param spaceId  (required)
     * @param id The id of the refund to get the document for. (required)
     * @param targetMediaTypeId The id of the target media type for which the refund should be generated for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--get-refund-document-with-target-media-type">getRefundDocumentWithTargetMediaType Documentation</a>
     */
    public com.squareup.okhttp.Call getRefundDocumentWithTargetMediaTypeAsync(Long spaceId, Long id, Long targetMediaTypeId, final ApiCallback<RenderedDocument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRefundDocumentWithTargetMediaTypeValidateBeforeCall(spaceId, id, targetMediaTypeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param spaceId  (required)
     * @param id The id of the refund which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/refund/read";

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
     * @param id The id of the refund which should be returned. (required)
     * @return Refund
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--read">Read Documentation</a>
     */
    public Refund read(Long spaceId, Long id) throws ApiException {
        ApiResponse<Refund> resp = readWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the refund which should be returned. (required)
     * @return ApiResponse&lt;Refund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--read">Read Documentation</a>
     */
    public ApiResponse<Refund> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the refund which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<Refund> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for refund
     * @param spaceId  (required)
     * @param refund The refund object which should be created. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--refund">create Documentation</a>
     */
    public com.squareup.okhttp.Call refundCall(Long spaceId, RefundCreate refund, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = refund;

        // create path and map variables
        String localVarPath = "/refund/refund";

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
    private com.squareup.okhttp.Call refundValidateBeforeCall(Long spaceId, RefundCreate refund, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling refund(Async)");
        }
        
        // verify the required parameter 'refund' is set
        if (refund == null) {
            throw new ApiException("Missing the required parameter 'refund' when calling refund(Async)");
        }
        

        com.squareup.okhttp.Call call = refundCall(spaceId, refund, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create
     * This operation creates and executes a refund of a particular transaction.
     * @param spaceId  (required)
     * @param refund The refund object which should be created. (required)
     * @return Refund
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--refund">create Documentation</a>
     */
    public Refund refund(Long spaceId, RefundCreate refund) throws ApiException {
        ApiResponse<Refund> resp = refundWithHttpInfo(spaceId, refund);
        return resp.getData();
    }

    /**
     * create
     * This operation creates and executes a refund of a particular transaction.
     * @param spaceId  (required)
     * @param refund The refund object which should be created. (required)
     * @return ApiResponse&lt;Refund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--refund">create Documentation</a>
     */
    public ApiResponse<Refund> refundWithHttpInfo(Long spaceId, RefundCreate refund) throws ApiException {
        com.squareup.okhttp.Call call = refundValidateBeforeCall(spaceId, refund, null, null);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * This operation creates and executes a refund of a particular transaction.
     * @param spaceId  (required)
     * @param refund The refund object which should be created. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--refund">create Documentation</a>
     */
    public com.squareup.okhttp.Call refundAsync(Long spaceId, RefundCreate refund, final ApiCallback<Refund> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = refundValidateBeforeCall(spaceId, refund, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param spaceId  (required)
     * @param query The query restricts the refunds which are returned by the search. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = query;

        // create path and map variables
        String localVarPath = "/refund/search";

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
     * @param query The query restricts the refunds which are returned by the search. (required)
     * @return List&lt;Refund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--search">Search Documentation</a>
     */
    public List<Refund> search(Long spaceId, EntityQuery query) throws ApiException {
        ApiResponse<List<Refund>> resp = searchWithHttpInfo(spaceId, query);
        return resp.getData();
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the refunds which are returned by the search. (required)
     * @return ApiResponse&lt;List&lt;Refund&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--search">Search Documentation</a>
     */
    public ApiResponse<List<Refund>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, null, null);
        Type localVarReturnType = new TypeToken<List<Refund>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the refunds which are returned by the search. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<Refund>> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<List<Refund>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for succeed
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as successful. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--succeed">succeed Documentation</a>
     */
    public com.squareup.okhttp.Call succeedCall(Long spaceId, Long refundId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/refund/succeed";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (refundId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refundId", refundId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call succeedValidateBeforeCall(Long spaceId, Long refundId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling succeed(Async)");
        }
        
        // verify the required parameter 'refundId' is set
        if (refundId == null) {
            throw new ApiException("Missing the required parameter 'refundId' when calling succeed(Async)");
        }
        

        com.squareup.okhttp.Call call = succeedCall(spaceId, refundId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * succeed
     * This operation allows to mark a refund as successful which is in state MANUAL_CHECK.
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as successful. (required)
     * @return Refund
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--succeed">succeed Documentation</a>
     */
    public Refund succeed(Long spaceId, Long refundId) throws ApiException {
        ApiResponse<Refund> resp = succeedWithHttpInfo(spaceId, refundId);
        return resp.getData();
    }

    /**
     * succeed
     * This operation allows to mark a refund as successful which is in state MANUAL_CHECK.
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as successful. (required)
     * @return ApiResponse&lt;Refund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--succeed">succeed Documentation</a>
     */
    public ApiResponse<Refund> succeedWithHttpInfo(Long spaceId, Long refundId) throws ApiException {
        com.squareup.okhttp.Call call = succeedValidateBeforeCall(spaceId, refundId, null, null);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * succeed (asynchronously)
     * This operation allows to mark a refund as successful which is in state MANUAL_CHECK.
     * @param spaceId  (required)
     * @param refundId The id of the refund which should be marked as successful. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#refund-service--succeed">succeed Documentation</a>
     */
    public com.squareup.okhttp.Call succeedAsync(Long spaceId, Long refundId, final ApiCallback<Refund> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = succeedValidateBeforeCall(spaceId, refundId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
