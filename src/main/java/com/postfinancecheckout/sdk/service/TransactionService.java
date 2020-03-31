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
import com.postfinancecheckout.sdk.model.EntityExportRequest;
import com.postfinancecheckout.sdk.model.EntityQuery;
import com.postfinancecheckout.sdk.model.EntityQueryFilter;
import com.postfinancecheckout.sdk.model.PaymentMethodConfiguration;
import com.postfinancecheckout.sdk.model.RenderedDocument;
import com.postfinancecheckout.sdk.model.ServerError;
import com.postfinancecheckout.sdk.model.TokenVersion;
import com.postfinancecheckout.sdk.model.Transaction;
import com.postfinancecheckout.sdk.model.TransactionCreate;
import com.postfinancecheckout.sdk.model.TransactionLineItemUpdateRequest;
import com.postfinancecheckout.sdk.model.TransactionLineItemVersion;
import com.postfinancecheckout.sdk.model.TransactionPending;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionService {
    private ApiClient apiClient;

    public TransactionService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for confirm
     * @param spaceId  (required)
     * @param transactionModel The transaction JSON object to update and confirm. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--confirm">Confirm Documentation</a>
     */
    public com.squareup.okhttp.Call confirmCall(Long spaceId, TransactionPending transactionModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transactionModel;

        // create path and map variables
        String localVarPath = "/transaction/confirm";

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
    private com.squareup.okhttp.Call confirmValidateBeforeCall(Long spaceId, TransactionPending transactionModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling confirm(Async)");
        }
        
        // verify the required parameter 'transactionModel' is set
        if (transactionModel == null) {
            throw new ApiException("Missing the required parameter 'transactionModel' when calling confirm(Async)");
        }
        

        com.squareup.okhttp.Call call = confirmCall(spaceId, transactionModel, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Confirm
     * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
     * @param spaceId  (required)
     * @param transactionModel The transaction JSON object to update and confirm. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--confirm">Confirm Documentation</a>
     */
    public Transaction confirm(Long spaceId, TransactionPending transactionModel) throws ApiException {
        ApiResponse<Transaction> resp = confirmWithHttpInfo(spaceId, transactionModel);
        return resp.getData();
    }

    /**
     * Confirm
     * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
     * @param spaceId  (required)
     * @param transactionModel The transaction JSON object to update and confirm. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--confirm">Confirm Documentation</a>
     */
    public ApiResponse<Transaction> confirmWithHttpInfo(Long spaceId, TransactionPending transactionModel) throws ApiException {
        com.squareup.okhttp.Call call = confirmValidateBeforeCall(spaceId, transactionModel, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Confirm (asynchronously)
     * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
     * @param spaceId  (required)
     * @param transactionModel The transaction JSON object to update and confirm. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--confirm">Confirm Documentation</a>
     */
    public com.squareup.okhttp.Call confirmAsync(Long spaceId, TransactionPending transactionModel, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = confirmValidateBeforeCall(spaceId, transactionModel, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = filter;

        // create path and map variables
        String localVarPath = "/transaction/count";

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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--count">Count Documentation</a>
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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--count">Count Documentation</a>
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
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--count">Count Documentation</a>
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
     * Build call for create
     * @param spaceId  (required)
     * @param transaction The transaction object which should be created. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create">Create Documentation</a>
     */
    public com.squareup.okhttp.Call createCall(Long spaceId, TransactionCreate transaction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transaction;

        // create path and map variables
        String localVarPath = "/transaction/create";

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
    private com.squareup.okhttp.Call createValidateBeforeCall(Long spaceId, TransactionCreate transaction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling create(Async)");
        }
        
        // verify the required parameter 'transaction' is set
        if (transaction == null) {
            throw new ApiException("Missing the required parameter 'transaction' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(spaceId, transaction, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create
     * Creates the entity with the given properties.
     * @param spaceId  (required)
     * @param transaction The transaction object which should be created. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create">Create Documentation</a>
     */
    public Transaction create(Long spaceId, TransactionCreate transaction) throws ApiException {
        ApiResponse<Transaction> resp = createWithHttpInfo(spaceId, transaction);
        return resp.getData();
    }

    /**
     * Create
     * Creates the entity with the given properties.
     * @param spaceId  (required)
     * @param transaction The transaction object which should be created. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create">Create Documentation</a>
     */
    public ApiResponse<Transaction> createWithHttpInfo(Long spaceId, TransactionCreate transaction) throws ApiException {
        com.squareup.okhttp.Call call = createValidateBeforeCall(spaceId, transaction, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create (asynchronously)
     * Creates the entity with the given properties.
     * @param spaceId  (required)
     * @param transaction The transaction object which should be created. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create">Create Documentation</a>
     */
    public com.squareup.okhttp.Call createAsync(Long spaceId, TransactionCreate transaction, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createValidateBeforeCall(spaceId, transaction, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createTransactionCredentials
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create-transaction-credentials">Create Transaction Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call createTransactionCredentialsCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/createTransactionCredentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call createTransactionCredentialsValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling createTransactionCredentials(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling createTransactionCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = createTransactionCredentialsCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Transaction Credentials
     * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create-transaction-credentials">Create Transaction Credentials Documentation</a>
     */
    public String createTransactionCredentials(Long spaceId, Long id) throws ApiException {
        ApiResponse<String> resp = createTransactionCredentialsWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Create Transaction Credentials
     * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create-transaction-credentials">Create Transaction Credentials Documentation</a>
     */
    public ApiResponse<String> createTransactionCredentialsWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = createTransactionCredentialsValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Transaction Credentials (asynchronously)
     * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--create-transaction-credentials">Create Transaction Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call createTransactionCredentialsAsync(Long spaceId, Long id, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTransactionCredentialsValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteOneClickTokenWithCredentials
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID will be used to find the token which should be removed. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--delete-one-click-token-with-credentials">Delete One-Click Token with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call deleteOneClickTokenWithCredentialsCall(String credentials, Long tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/deleteOneClickTokenWithCredentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (credentials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("credentials", credentials));
        if (tokenId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tokenId", tokenId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call deleteOneClickTokenWithCredentialsValidateBeforeCall(String credentials, Long tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new ApiException("Missing the required parameter 'credentials' when calling deleteOneClickTokenWithCredentials(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling deleteOneClickTokenWithCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteOneClickTokenWithCredentialsCall(credentials, tokenId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete One-Click Token with Credentials
     * This operation removes the given token.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID will be used to find the token which should be removed. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--delete-one-click-token-with-credentials">Delete One-Click Token with Credentials Documentation</a>
     */
    public void deleteOneClickTokenWithCredentials(String credentials, Long tokenId) throws ApiException {
        deleteOneClickTokenWithCredentialsWithHttpInfo(credentials, tokenId);
    }

    /**
     * Delete One-Click Token with Credentials
     * This operation removes the given token.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID will be used to find the token which should be removed. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--delete-one-click-token-with-credentials">Delete One-Click Token with Credentials Documentation</a>
     */
    public ApiResponse<Void> deleteOneClickTokenWithCredentialsWithHttpInfo(String credentials, Long tokenId) throws ApiException {
        com.squareup.okhttp.Call call = deleteOneClickTokenWithCredentialsValidateBeforeCall(credentials, tokenId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete One-Click Token with Credentials (asynchronously)
     * This operation removes the given token.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID will be used to find the token which should be removed. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--delete-one-click-token-with-credentials">Delete One-Click Token with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call deleteOneClickTokenWithCredentialsAsync(String credentials, Long tokenId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteOneClickTokenWithCredentialsValidateBeforeCall(credentials, tokenId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for export
     * @param spaceId  (required)
     * @param request The request controls the entries which are exported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--export">Export Documentation</a>
     */
    public com.squareup.okhttp.Call exportCall(Long spaceId, EntityExportRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/transaction/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8", "text/csv"
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
    private com.squareup.okhttp.Call exportValidateBeforeCall(Long spaceId, EntityExportRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling export(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling export(Async)");
        }
        

        com.squareup.okhttp.Call call = exportCall(spaceId, request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export
     * Exports the transactions into a CSV file. The file will contain the properties defined in the request.
     * @param spaceId  (required)
     * @param request The request controls the entries which are exported. (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--export">Export Documentation</a>
     */
    public byte[] export(Long spaceId, EntityExportRequest request) throws ApiException {
        ApiResponse<byte[]> resp = exportWithHttpInfo(spaceId, request);
        return resp.getData();
    }

    /**
     * Export
     * Exports the transactions into a CSV file. The file will contain the properties defined in the request.
     * @param spaceId  (required)
     * @param request The request controls the entries which are exported. (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--export">Export Documentation</a>
     */
    public ApiResponse<byte[]> exportWithHttpInfo(Long spaceId, EntityExportRequest request) throws ApiException {
        com.squareup.okhttp.Call call = exportValidateBeforeCall(spaceId, request, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export (asynchronously)
     * Exports the transactions into a CSV file. The file will contain the properties defined in the request.
     * @param spaceId  (required)
     * @param request The request controls the entries which are exported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--export">Export Documentation</a>
     */
    public com.squareup.okhttp.Call exportAsync(Long spaceId, EntityExportRequest request, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = exportValidateBeforeCall(spaceId, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchOneClickTokensWithCredentials
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-one-click-tokens-with-credentials">Fetch One Click Tokens with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call fetchOneClickTokensWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/fetchOneClickTokensWithCredentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (credentials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("credentials", credentials));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call fetchOneClickTokensWithCredentialsValidateBeforeCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new ApiException("Missing the required parameter 'credentials' when calling fetchOneClickTokensWithCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchOneClickTokensWithCredentialsCall(credentials, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch One Click Tokens with Credentials
     * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return List&lt;TokenVersion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-one-click-tokens-with-credentials">Fetch One Click Tokens with Credentials Documentation</a>
     */
    public List<TokenVersion> fetchOneClickTokensWithCredentials(String credentials) throws ApiException {
        ApiResponse<List<TokenVersion>> resp = fetchOneClickTokensWithCredentialsWithHttpInfo(credentials);
        return resp.getData();
    }

    /**
     * Fetch One Click Tokens with Credentials
     * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return ApiResponse&lt;List&lt;TokenVersion&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-one-click-tokens-with-credentials">Fetch One Click Tokens with Credentials Documentation</a>
     */
    public ApiResponse<List<TokenVersion>> fetchOneClickTokensWithCredentialsWithHttpInfo(String credentials) throws ApiException {
        com.squareup.okhttp.Call call = fetchOneClickTokensWithCredentialsValidateBeforeCall(credentials, null, null);
        Type localVarReturnType = new TypeToken<List<TokenVersion>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch One Click Tokens with Credentials (asynchronously)
     * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-one-click-tokens-with-credentials">Fetch One Click Tokens with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call fetchOneClickTokensWithCredentialsAsync(String credentials, final ApiCallback<List<TokenVersion>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchOneClickTokensWithCredentialsValidateBeforeCall(credentials, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TokenVersion>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchPossiblePaymentMethods
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods">Fetch Possible Payment Methods Documentation</a>
     */
    public com.squareup.okhttp.Call fetchPossiblePaymentMethodsCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/fetchPossiblePaymentMethods";

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
    private com.squareup.okhttp.Call fetchPossiblePaymentMethodsValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling fetchPossiblePaymentMethods(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling fetchPossiblePaymentMethods(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch Possible Payment Methods
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @return List&lt;PaymentMethodConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods">Fetch Possible Payment Methods Documentation</a>
     */
    public List<PaymentMethodConfiguration> fetchPossiblePaymentMethods(Long spaceId, Long id) throws ApiException {
        ApiResponse<List<PaymentMethodConfiguration>> resp = fetchPossiblePaymentMethodsWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Fetch Possible Payment Methods
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @return ApiResponse&lt;List&lt;PaymentMethodConfiguration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods">Fetch Possible Payment Methods Documentation</a>
     */
    public ApiResponse<List<PaymentMethodConfiguration>> fetchPossiblePaymentMethodsWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch Possible Payment Methods (asynchronously)
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods">Fetch Possible Payment Methods Documentation</a>
     */
    public com.squareup.okhttp.Call fetchPossiblePaymentMethodsAsync(Long spaceId, Long id, final ApiCallback<List<PaymentMethodConfiguration>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchPossiblePaymentMethodsWithCredentials
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods-with-credentials">Fetch Possible Payment Methods with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call fetchPossiblePaymentMethodsWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/fetchPossiblePaymentMethodsWithCredentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (credentials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("credentials", credentials));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchPossiblePaymentMethodsWithCredentialsValidateBeforeCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new ApiException("Missing the required parameter 'credentials' when calling fetchPossiblePaymentMethodsWithCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsWithCredentialsCall(credentials, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch Possible Payment Methods with Credentials
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return List&lt;PaymentMethodConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods-with-credentials">Fetch Possible Payment Methods with Credentials Documentation</a>
     */
    public List<PaymentMethodConfiguration> fetchPossiblePaymentMethodsWithCredentials(String credentials) throws ApiException {
        ApiResponse<List<PaymentMethodConfiguration>> resp = fetchPossiblePaymentMethodsWithCredentialsWithHttpInfo(credentials);
        return resp.getData();
    }

    /**
     * Fetch Possible Payment Methods with Credentials
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return ApiResponse&lt;List&lt;PaymentMethodConfiguration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods-with-credentials">Fetch Possible Payment Methods with Credentials Documentation</a>
     */
    public ApiResponse<List<PaymentMethodConfiguration>> fetchPossiblePaymentMethodsWithCredentialsWithHttpInfo(String credentials) throws ApiException {
        com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsWithCredentialsValidateBeforeCall(credentials, null, null);
        Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch Possible Payment Methods with Credentials (asynchronously)
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--fetch-possible-payment-methods-with-credentials">Fetch Possible Payment Methods with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call fetchPossiblePaymentMethodsWithCredentialsAsync(String credentials, final ApiCallback<List<PaymentMethodConfiguration>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsWithCredentialsValidateBeforeCall(credentials, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInvoiceDocument
     * @param spaceId  (required)
     * @param id The id of the transaction to get the invoice document for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-invoice-document">getInvoiceDocument Documentation</a>
     */
    public com.squareup.okhttp.Call getInvoiceDocumentCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/getInvoiceDocument";

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
     * @param id The id of the transaction to get the invoice document for. (required)
     * @return RenderedDocument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-invoice-document">getInvoiceDocument Documentation</a>
     */
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id) throws ApiException {
        ApiResponse<RenderedDocument> resp = getInvoiceDocumentWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * getInvoiceDocument
     * Returns the PDF document for the transaction invoice with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction to get the invoice document for. (required)
     * @return ApiResponse&lt;RenderedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-invoice-document">getInvoiceDocument Documentation</a>
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
     * @param id The id of the transaction to get the invoice document for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-invoice-document">getInvoiceDocument Documentation</a>
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
     * Build call for getLatestTransactionLineItemVersion
     * @param spaceId  (required)
     * @param id The id of the transaction to get the latest line item version for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-latest-transaction-line-item-version">getLatestTransactionLineItemVersion Documentation</a>
     */
    public com.squareup.okhttp.Call getLatestTransactionLineItemVersionCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/getLatestTransactionLineItemVersion";

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
    private com.squareup.okhttp.Call getLatestTransactionLineItemVersionValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getLatestTransactionLineItemVersion(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLatestTransactionLineItemVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = getLatestTransactionLineItemVersionCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getLatestTransactionLineItemVersion
     * 
     * @param spaceId  (required)
     * @param id The id of the transaction to get the latest line item version for. (required)
     * @return TransactionLineItemVersion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-latest-transaction-line-item-version">getLatestTransactionLineItemVersion Documentation</a>
     */
    public TransactionLineItemVersion getLatestTransactionLineItemVersion(Long spaceId, Long id) throws ApiException {
        ApiResponse<TransactionLineItemVersion> resp = getLatestTransactionLineItemVersionWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * getLatestTransactionLineItemVersion
     * 
     * @param spaceId  (required)
     * @param id The id of the transaction to get the latest line item version for. (required)
     * @return ApiResponse&lt;TransactionLineItemVersion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-latest-transaction-line-item-version">getLatestTransactionLineItemVersion Documentation</a>
     */
    public ApiResponse<TransactionLineItemVersion> getLatestTransactionLineItemVersionWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = getLatestTransactionLineItemVersionValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getLatestTransactionLineItemVersion (asynchronously)
     * 
     * @param spaceId  (required)
     * @param id The id of the transaction to get the latest line item version for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-latest-transaction-line-item-version">getLatestTransactionLineItemVersion Documentation</a>
     */
    public com.squareup.okhttp.Call getLatestTransactionLineItemVersionAsync(Long spaceId, Long id, final ApiCallback<TransactionLineItemVersion> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLatestTransactionLineItemVersionValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPackingSlip
     * @param spaceId  (required)
     * @param id The id of the transaction to get the packing slip for. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-packing-slip">getPackingSlip Documentation</a>
     */
    public com.squareup.okhttp.Call getPackingSlipCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/getPackingSlip";

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
    private com.squareup.okhttp.Call getPackingSlipValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getPackingSlip(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPackingSlip(Async)");
        }
        

        com.squareup.okhttp.Call call = getPackingSlipCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getPackingSlip
     * Returns the packing slip for the transaction with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction to get the packing slip for. (required)
     * @return RenderedDocument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-packing-slip">getPackingSlip Documentation</a>
     */
    public RenderedDocument getPackingSlip(Long spaceId, Long id) throws ApiException {
        ApiResponse<RenderedDocument> resp = getPackingSlipWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * getPackingSlip
     * Returns the packing slip for the transaction with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction to get the packing slip for. (required)
     * @return ApiResponse&lt;RenderedDocument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-packing-slip">getPackingSlip Documentation</a>
     */
    public ApiResponse<RenderedDocument> getPackingSlipWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = getPackingSlipValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getPackingSlip (asynchronously)
     * Returns the packing slip for the transaction with given id.
     * @param spaceId  (required)
     * @param id The id of the transaction to get the packing slip for. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--get-packing-slip">getPackingSlip Documentation</a>
     */
    public com.squareup.okhttp.Call getPackingSlipAsync(Long spaceId, Long id, final ApiCallback<RenderedDocument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPackingSlipValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for processOneClickTokenAndRedirectWithCredentials
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-one-click-token-and-redirect-with-credentials">Process One-Click Token with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call processOneClickTokenAndRedirectWithCredentialsCall(String credentials, Long tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/processOneClickTokenAndRedirectWithCredentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (credentials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("credentials", credentials));
        if (tokenId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tokenId", tokenId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call processOneClickTokenAndRedirectWithCredentialsValidateBeforeCall(String credentials, Long tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new ApiException("Missing the required parameter 'credentials' when calling processOneClickTokenAndRedirectWithCredentials(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling processOneClickTokenAndRedirectWithCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = processOneClickTokenAndRedirectWithCredentialsCall(credentials, tokenId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Process One-Click Token with Credentials
     * This operation assigns the given token to the transaction and process it. This method will return an URL where the customer has to be redirect to complete the transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-one-click-token-and-redirect-with-credentials">Process One-Click Token with Credentials Documentation</a>
     */
    public String processOneClickTokenAndRedirectWithCredentials(String credentials, Long tokenId) throws ApiException {
        ApiResponse<String> resp = processOneClickTokenAndRedirectWithCredentialsWithHttpInfo(credentials, tokenId);
        return resp.getData();
    }

    /**
     * Process One-Click Token with Credentials
     * This operation assigns the given token to the transaction and process it. This method will return an URL where the customer has to be redirect to complete the transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-one-click-token-and-redirect-with-credentials">Process One-Click Token with Credentials Documentation</a>
     */
    public ApiResponse<String> processOneClickTokenAndRedirectWithCredentialsWithHttpInfo(String credentials, Long tokenId) throws ApiException {
        com.squareup.okhttp.Call call = processOneClickTokenAndRedirectWithCredentialsValidateBeforeCall(credentials, tokenId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process One-Click Token with Credentials (asynchronously)
     * This operation assigns the given token to the transaction and process it. This method will return an URL where the customer has to be redirect to complete the transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-one-click-token-and-redirect-with-credentials">Process One-Click Token with Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call processOneClickTokenAndRedirectWithCredentialsAsync(String credentials, Long tokenId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = processOneClickTokenAndRedirectWithCredentialsValidateBeforeCall(credentials, tokenId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for processWithoutUserInteraction
     * @param spaceId  (required)
     * @param id The id of the transaction which should be processed. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-without-user-interaction">Process Without User Interaction Documentation</a>
     */
    public com.squareup.okhttp.Call processWithoutUserInteractionCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/processWithoutUserInteraction";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call processWithoutUserInteractionValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling processWithoutUserInteraction(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling processWithoutUserInteraction(Async)");
        }
        

        com.squareup.okhttp.Call call = processWithoutUserInteractionCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Process Without User Interaction
     * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be processed. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-without-user-interaction">Process Without User Interaction Documentation</a>
     */
    public Transaction processWithoutUserInteraction(Long spaceId, Long id) throws ApiException {
        ApiResponse<Transaction> resp = processWithoutUserInteractionWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Process Without User Interaction
     * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be processed. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-without-user-interaction">Process Without User Interaction Documentation</a>
     */
    public ApiResponse<Transaction> processWithoutUserInteractionWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = processWithoutUserInteractionValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process Without User Interaction (asynchronously)
     * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be processed. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--process-without-user-interaction">Process Without User Interaction Documentation</a>
     */
    public com.squareup.okhttp.Call processWithoutUserInteractionAsync(Long spaceId, Long id, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = processWithoutUserInteractionValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/read";

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
     * @param id The id of the transaction which should be returned. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read">Read Documentation</a>
     */
    public Transaction read(Long spaceId, Long id) throws ApiException {
        ApiResponse<Transaction> resp = readWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read">Read Documentation</a>
     */
    public ApiResponse<Transaction> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the transaction which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<Transaction> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readWithCredentials
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read-with-credentials">Read With Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call readWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/readWithCredentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (credentials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("credentials", credentials));

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
    private com.squareup.okhttp.Call readWithCredentialsValidateBeforeCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new ApiException("Missing the required parameter 'credentials' when calling readWithCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = readWithCredentialsCall(credentials, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read With Credentials
     * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read-with-credentials">Read With Credentials Documentation</a>
     */
    public Transaction readWithCredentials(String credentials) throws ApiException {
        ApiResponse<Transaction> resp = readWithCredentialsWithHttpInfo(credentials);
        return resp.getData();
    }

    /**
     * Read With Credentials
     * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read-with-credentials">Read With Credentials Documentation</a>
     */
    public ApiResponse<Transaction> readWithCredentialsWithHttpInfo(String credentials) throws ApiException {
        com.squareup.okhttp.Call call = readWithCredentialsValidateBeforeCall(credentials, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read With Credentials (asynchronously)
     * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--read-with-credentials">Read With Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call readWithCredentialsAsync(String credentials, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readWithCredentialsValidateBeforeCall(credentials, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param spaceId  (required)
     * @param query The query restricts the transactions which are returned by the search. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = query;

        // create path and map variables
        String localVarPath = "/transaction/search";

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
     * @param query The query restricts the transactions which are returned by the search. (required)
     * @return List&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--search">Search Documentation</a>
     */
    public List<Transaction> search(Long spaceId, EntityQuery query) throws ApiException {
        ApiResponse<List<Transaction>> resp = searchWithHttpInfo(spaceId, query);
        return resp.getData();
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the transactions which are returned by the search. (required)
     * @return ApiResponse&lt;List&lt;Transaction&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--search">Search Documentation</a>
     */
    public ApiResponse<List<Transaction>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, null, null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the transactions which are returned by the search. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<Transaction>> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param spaceId  (required)
     * @param entity The transaction object with the properties which should be updated. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update">Update Documentation</a>
     */
    public com.squareup.okhttp.Call updateCall(Long spaceId, TransactionPending entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = entity;

        // create path and map variables
        String localVarPath = "/transaction/update";

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
    private com.squareup.okhttp.Call updateValidateBeforeCall(Long spaceId, TransactionPending entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling update(Async)");
        }
        
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new ApiException("Missing the required parameter 'entity' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(spaceId, entity, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * @param spaceId  (required)
     * @param entity The transaction object with the properties which should be updated. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update">Update Documentation</a>
     */
    public Transaction update(Long spaceId, TransactionPending entity) throws ApiException {
        ApiResponse<Transaction> resp = updateWithHttpInfo(spaceId, entity);
        return resp.getData();
    }

    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * @param spaceId  (required)
     * @param entity The transaction object with the properties which should be updated. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update">Update Documentation</a>
     */
    public ApiResponse<Transaction> updateWithHttpInfo(Long spaceId, TransactionPending entity) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(spaceId, entity, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update (asynchronously)
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * @param spaceId  (required)
     * @param entity The transaction object with the properties which should be updated. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update">Update Documentation</a>
     */
    public com.squareup.okhttp.Call updateAsync(Long spaceId, TransactionPending entity, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(spaceId, entity, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTransactionLineItems
     * @param spaceId  (required)
     * @param updateRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update-transaction-line-items">updateTransactionLineItems Documentation</a>
     */
    public com.squareup.okhttp.Call updateTransactionLineItemsCall(Long spaceId, TransactionLineItemUpdateRequest updateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateRequest;

        // create path and map variables
        String localVarPath = "/transaction/updateTransactionLineItems";

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
    private com.squareup.okhttp.Call updateTransactionLineItemsValidateBeforeCall(Long spaceId, TransactionLineItemUpdateRequest updateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling updateTransactionLineItems(Async)");
        }
        
        // verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new ApiException("Missing the required parameter 'updateRequest' when calling updateTransactionLineItems(Async)");
        }
        

        com.squareup.okhttp.Call call = updateTransactionLineItemsCall(spaceId, updateRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateTransactionLineItems
     * 
     * @param spaceId  (required)
     * @param updateRequest  (required)
     * @return TransactionLineItemVersion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update-transaction-line-items">updateTransactionLineItems Documentation</a>
     */
    public TransactionLineItemVersion updateTransactionLineItems(Long spaceId, TransactionLineItemUpdateRequest updateRequest) throws ApiException {
        ApiResponse<TransactionLineItemVersion> resp = updateTransactionLineItemsWithHttpInfo(spaceId, updateRequest);
        return resp.getData();
    }

    /**
     * updateTransactionLineItems
     * 
     * @param spaceId  (required)
     * @param updateRequest  (required)
     * @return ApiResponse&lt;TransactionLineItemVersion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update-transaction-line-items">updateTransactionLineItems Documentation</a>
     */
    public ApiResponse<TransactionLineItemVersion> updateTransactionLineItemsWithHttpInfo(Long spaceId, TransactionLineItemUpdateRequest updateRequest) throws ApiException {
        com.squareup.okhttp.Call call = updateTransactionLineItemsValidateBeforeCall(spaceId, updateRequest, null, null);
        Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateTransactionLineItems (asynchronously)
     * 
     * @param spaceId  (required)
     * @param updateRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#transaction-service--update-transaction-line-items">updateTransactionLineItems Documentation</a>
     */
    public com.squareup.okhttp.Call updateTransactionLineItemsAsync(Long spaceId, TransactionLineItemUpdateRequest updateRequest, final ApiCallback<TransactionLineItemVersion> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTransactionLineItemsValidateBeforeCall(spaceId, updateRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
