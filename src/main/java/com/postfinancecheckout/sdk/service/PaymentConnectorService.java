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
import com.postfinancecheckout.sdk.model.PaymentConnector;
import com.postfinancecheckout.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentConnectorService {
    private ApiClient apiClient;

    public PaymentConnectorService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for all
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--all">All Documentation</a>
     */
    public com.squareup.okhttp.Call allCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-connector/all";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call allValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = allCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * All
     * This operation returns all entities which are available.
     * @return List&lt;PaymentConnector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--all">All Documentation</a>
     */
    public List<PaymentConnector> all() throws ApiException {
        ApiResponse<List<PaymentConnector>> resp = allWithHttpInfo();
        return resp.getData();
    }

    /**
     * All
     * This operation returns all entities which are available.
     * @return ApiResponse&lt;List&lt;PaymentConnector&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--all">All Documentation</a>
     */
    public ApiResponse<List<PaymentConnector>> allWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = allValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<PaymentConnector>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All (asynchronously)
     * This operation returns all entities which are available.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--all">All Documentation</a>
     */
    public com.squareup.okhttp.Call allAsync(final ApiCallback<List<PaymentConnector>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = allValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentConnector>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param id The id of the connector which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-connector/read";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call readValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
        }
        

        com.squareup.okhttp.Call call = readCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param id The id of the connector which should be returned. (required)
     * @return PaymentConnector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--read">Read Documentation</a>
     */
    public PaymentConnector read(Long id) throws ApiException {
        ApiResponse<PaymentConnector> resp = readWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param id The id of the connector which should be returned. (required)
     * @return ApiResponse&lt;PaymentConnector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--read">Read Documentation</a>
     */
    public ApiResponse<PaymentConnector> readWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<PaymentConnector>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param id The id of the connector which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#payment-connector-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long id, final ApiCallback<PaymentConnector> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentConnector>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
