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
import com.postfinancecheckout.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionMobileSdkService {
    private ApiClient apiClient;

    public TransactionMobileSdkService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentFormUrl
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-mobile-sdk-service--payment-form-url">Build Mobile SDK URL Documentation</a>
     */
    public com.squareup.okhttp.Call paymentFormUrlCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-mobile-sdk/payment-form-url";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (credentials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("credentials", credentials));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/plain;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentFormUrlValidateBeforeCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new ApiException("Missing the required parameter 'credentials' when calling paymentFormUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = paymentFormUrlCall(credentials, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Build Mobile SDK URL
     * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-mobile-sdk-service--payment-form-url">Build Mobile SDK URL Documentation</a>
     */
    public String paymentFormUrl(String credentials) throws ApiException {
        ApiResponse<String> resp = paymentFormUrlWithHttpInfo(credentials);
        return resp.getData();
    }

    /**
     * Build Mobile SDK URL
     * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-mobile-sdk-service--payment-form-url">Build Mobile SDK URL Documentation</a>
     */
    public ApiResponse<String> paymentFormUrlWithHttpInfo(String credentials) throws ApiException {
        com.squareup.okhttp.Call call = paymentFormUrlValidateBeforeCall(credentials, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build Mobile SDK URL (asynchronously)
     * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-mobile-sdk-service--payment-form-url">Build Mobile SDK URL Documentation</a>
     */
    public com.squareup.okhttp.Call paymentFormUrlAsync(String credentials, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentFormUrlValidateBeforeCall(credentials, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
