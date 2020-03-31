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
import com.postfinancecheckout.sdk.model.UserSpaceRole;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSpaceRoleService {
    private ApiClient apiClient;

    public UserSpaceRoleService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addRole
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and space. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--add-role">Add Role Documentation</a>
     */
    public com.squareup.okhttp.Call addRoleCall(Long userId, Long spaceId, Long roleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-space-role/addRole";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (roleId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roleId", roleId));

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
    private com.squareup.okhttp.Call addRoleValidateBeforeCall(Long userId, Long spaceId, Long roleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling addRole(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling addRole(Async)");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling addRole(Async)");
        }
        

        com.squareup.okhttp.Call call = addRoleCall(userId, spaceId, roleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add Role
     * This operation grants the given role to the user in the given space.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and space. (required)
     * @return UserSpaceRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--add-role">Add Role Documentation</a>
     */
    public UserSpaceRole addRole(Long userId, Long spaceId, Long roleId) throws ApiException {
        ApiResponse<UserSpaceRole> resp = addRoleWithHttpInfo(userId, spaceId, roleId);
        return resp.getData();
    }

    /**
     * Add Role
     * This operation grants the given role to the user in the given space.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and space. (required)
     * @return ApiResponse&lt;UserSpaceRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--add-role">Add Role Documentation</a>
     */
    public ApiResponse<UserSpaceRole> addRoleWithHttpInfo(Long userId, Long spaceId, Long roleId) throws ApiException {
        com.squareup.okhttp.Call call = addRoleValidateBeforeCall(userId, spaceId, roleId, null, null);
        Type localVarReturnType = new TypeToken<UserSpaceRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add Role (asynchronously)
     * This operation grants the given role to the user in the given space.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and space. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--add-role">Add Role Documentation</a>
     */
    public com.squareup.okhttp.Call addRoleAsync(Long userId, Long spaceId, Long roleId, final ApiCallback<UserSpaceRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addRoleValidateBeforeCall(userId, spaceId, roleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserSpaceRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--list">List Roles Documentation</a>
     */
    public com.squareup.okhttp.Call listCall(Long userId, Long spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-space-role/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
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
    private com.squareup.okhttp.Call listValidateBeforeCall(Long userId, Long spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling list(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling list(Async)");
        }
        

        com.squareup.okhttp.Call call = listCall(userId, spaceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Roles
     * List all the roles that are assigned to the given user in the given space.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @return List&lt;UserSpaceRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--list">List Roles Documentation</a>
     */
    public List<UserSpaceRole> list(Long userId, Long spaceId) throws ApiException {
        ApiResponse<List<UserSpaceRole>> resp = listWithHttpInfo(userId, spaceId);
        return resp.getData();
    }

    /**
     * List Roles
     * List all the roles that are assigned to the given user in the given space.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @return ApiResponse&lt;List&lt;UserSpaceRole&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--list">List Roles Documentation</a>
     */
    public ApiResponse<List<UserSpaceRole>> listWithHttpInfo(Long userId, Long spaceId) throws ApiException {
        com.squareup.okhttp.Call call = listValidateBeforeCall(userId, spaceId, null, null);
        Type localVarReturnType = new TypeToken<List<UserSpaceRole>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Roles (asynchronously)
     * List all the roles that are assigned to the given user in the given space.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param spaceId The space to which the role is mapped. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--list">List Roles Documentation</a>
     */
    public com.squareup.okhttp.Call listAsync(Long userId, Long spaceId, final ApiCallback<List<UserSpaceRole>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listValidateBeforeCall(userId, spaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UserSpaceRole>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeRole
     * @param id The id of user space role which should be removed (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--remove-role">Remove Role Documentation</a>
     */
    public com.squareup.okhttp.Call removeRoleCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-space-role/removeRole";

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
    private com.squareup.okhttp.Call removeRoleValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeRole(Async)");
        }
        

        com.squareup.okhttp.Call call = removeRoleCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Role
     * This operation removes the specified user space role.
     * @param id The id of user space role which should be removed (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--remove-role">Remove Role Documentation</a>
     */
    public void removeRole(Long id) throws ApiException {
        removeRoleWithHttpInfo(id);
    }

    /**
     * Remove Role
     * This operation removes the specified user space role.
     * @param id The id of user space role which should be removed (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--remove-role">Remove Role Documentation</a>
     */
    public ApiResponse<Void> removeRoleWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = removeRoleValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove Role (asynchronously)
     * This operation removes the specified user space role.
     * @param id The id of user space role which should be removed (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-space-role-service--remove-role">Remove Role Documentation</a>
     */
    public com.squareup.okhttp.Call removeRoleAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeRoleValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
