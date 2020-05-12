package com.postfinancecheckout.sdk.service;

import com.postfinancecheckout.sdk.ApiClient;

import com.postfinancecheckout.sdk.model.ClientError;
import com.postfinancecheckout.sdk.model.ServerError;
import com.postfinancecheckout.sdk.model.UserAccountRole;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class UserAccountRoleService {
    private ApiClient apiClient;

    public UserAccountRoleService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add Role
    * This operation grants the role to the given user with in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @param roleId The role which is mapped to the user and account.
    * @param appliesOnSubaccount Whether the role applies only on subaccount.
    * @return UserAccountRole
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>

    **/
    public UserAccountRole addRole(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount) throws IOException {
        HttpResponse response = addRoleForHttpResponse(userId, accountId, roleId, appliesOnSubaccount);
        String returnType = "UserAccountRole";
        if(returnType.equals("String")){
          return (UserAccountRole) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<UserAccountRole>() {};
        return (UserAccountRole)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add Role
    * This operation grants the role to the given user with in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @param roleId The role which is mapped to the user and account.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserAccountRole
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>

    **/
    public UserAccountRole addRole(Long userId, Long accountId, Long roleId, Map<String, Object> params) throws IOException {
        HttpResponse response = addRoleForHttpResponse(userId, accountId, roleId, params);
        String returnType = "UserAccountRole";
        if(returnType.equals("String")){
            return (UserAccountRole) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<UserAccountRole>() {};
        return (UserAccountRole)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addRoleForHttpResponse(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling addRole");
        }// verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling addRole");
        }// verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'roleId' when calling addRole");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-account-role/addRole");
        if (userId != null) {
            String key = "userId";
            Object value = userId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (accountId != null) {
            String key = "accountId";
            Object value = accountId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (roleId != null) {
            String key = "roleId";
            Object value = roleId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (appliesOnSubaccount != null) {
            String key = "appliesOnSubaccount";
            Object value = appliesOnSubaccount;
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse addRoleForHttpResponse(Long userId, Long accountId, Long roleId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling addRole");
        }// verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling addRole");
        }// verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'roleId' when calling addRole");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-account-role/addRole");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'userId' to the map of query params
        allParams.put("userId", userId);
        // Add the required query param 'accountId' to the map of query params
        allParams.put("accountId", accountId);
        // Add the required query param 'roleId' to the map of query params
        allParams.put("roleId", roleId);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * List Roles
    * List all the roles that are assigned to the given user in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @return List&lt;UserAccountRole&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>

    **/
    public List<UserAccountRole> list(Long userId, Long accountId) throws IOException {
        HttpResponse response = listForHttpResponse(userId, accountId);
        String returnType = "List&lt;UserAccountRole&gt;";
        if(returnType.equals("String")){
          return (List<UserAccountRole>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<UserAccountRole>>() {};
        return (List<UserAccountRole>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * List Roles
    * List all the roles that are assigned to the given user in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;UserAccountRole&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>

    **/
    public List<UserAccountRole> list(Long userId, Long accountId, Map<String, Object> params) throws IOException {
        HttpResponse response = listForHttpResponse(userId, accountId, params);
        String returnType = "List&lt;UserAccountRole&gt;";
        if(returnType.equals("String")){
            return (List<UserAccountRole>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<UserAccountRole>>() {};
        return (List<UserAccountRole>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse listForHttpResponse(Long userId, Long accountId) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling list");
        }// verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling list");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-account-role/list");
        if (userId != null) {
            String key = "userId";
            Object value = userId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (accountId != null) {
            String key = "accountId";
            Object value = accountId;
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse listForHttpResponse(Long userId, Long accountId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling list");
        }// verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling list");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-account-role/list");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'userId' to the map of query params
        allParams.put("userId", userId);
        // Add the required query param 'accountId' to the map of query params
        allParams.put("accountId", accountId);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Remove Role
    * This operation removes the specified user account role.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The id of user account role which should be removed
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>

    **/
    public void removeRole(Long id) throws IOException {
        removeRoleForHttpResponse(id);
    }

  /**
    * Remove Role
    * This operation removes the specified user account role.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The id of user account role which should be removed
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://checkout.postfinance.ch/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>

    **/
    public void removeRole(Long id, Map<String, Object> params) throws IOException {
        removeRoleForHttpResponse(id, params);
    }

    public HttpResponse removeRoleForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling removeRole");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-account-role/removeRole");
        if (id != null) {
            String key = "id";
            Object value = id;
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse removeRoleForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling removeRole");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-account-role/removeRole");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
