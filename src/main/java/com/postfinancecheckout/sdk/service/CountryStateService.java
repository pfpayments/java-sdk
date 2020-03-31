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
import com.postfinancecheckout.sdk.model.RestCountryState;
import com.postfinancecheckout.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * Build call for all
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--all">All Documentation</a>
     */
    public com.squareup.okhttp.Call allCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/country-state/all";

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
     * This operation returns all states of all countries.
     * @return List&lt;RestCountryState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--all">All Documentation</a>
     */
    public List<RestCountryState> all() throws ApiException {
        ApiResponse<List<RestCountryState>> resp = allWithHttpInfo();
        return resp.getData();
    }

    /**
     * All
     * This operation returns all states of all countries.
     * @return ApiResponse&lt;List&lt;RestCountryState&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--all">All Documentation</a>
     */
    public ApiResponse<List<RestCountryState>> allWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = allValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<RestCountryState>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All (asynchronously)
     * This operation returns all states of all countries.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--all">All Documentation</a>
     */
    public com.squareup.okhttp.Call allAsync(final ApiCallback<List<RestCountryState>> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<List<RestCountryState>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for country
     * @param code The country code in ISO code two letter format for which all states should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>
     */
    public com.squareup.okhttp.Call countryCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/country-state/country";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("code", code));

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
    private com.squareup.okhttp.Call countryValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling country(Async)");
        }
        

        com.squareup.okhttp.Call call = countryCall(code, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find by Country
     * This operation returns all states for a given country.
     * @param code The country code in ISO code two letter format for which all states should be returned. (required)
     * @return List&lt;RestCountryState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>
     */
    public List<RestCountryState> country(String code) throws ApiException {
        ApiResponse<List<RestCountryState>> resp = countryWithHttpInfo(code);
        return resp.getData();
    }

    /**
     * Find by Country
     * This operation returns all states for a given country.
     * @param code The country code in ISO code two letter format for which all states should be returned. (required)
     * @return ApiResponse&lt;List&lt;RestCountryState&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>
     */
    public ApiResponse<List<RestCountryState>> countryWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = countryValidateBeforeCall(code, null, null);
        Type localVarReturnType = new TypeToken<List<RestCountryState>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find by Country (asynchronously)
     * This operation returns all states for a given country.
     * @param code The country code in ISO code two letter format for which all states should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>
     */
    public com.squareup.okhttp.Call countryAsync(String code, final ApiCallback<List<RestCountryState>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = countryValidateBeforeCall(code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<RestCountryState>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
