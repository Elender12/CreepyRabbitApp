# UsersApi

All URIs are relative to *http://10.0.2.2:9100*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UsersApi.md#addUser) | **POST** users | Add a new user.
[**deleteUsers**](UsersApi.md#deleteUsers) | **DELETE** users/{id} | Delete an existing User by id.
[**getAllUsers**](UsersApi.md#getAllUsers) | **GET** users | Get all users.
[**getUsersByID**](UsersApi.md#getUsersByID) | **GET** users/{id} | Get a user by id.
[**updateUsers**](UsersApi.md#updateUsers) | **PUT** users | Update an existing user.



## addUser

> User addUser(body)

Add a new user.

Takes a User object, saves it, and returns it with the saved id.

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        UsersApi apiInstance = new UsersApi(defaultClient);
        User body = new User(); // User | User object
        try {
            User result = apiInstance.addUser(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#addUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| User object |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **201** | Created |  -  |
| **400** | Invalid User. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Server error. |  -  |


## deleteUsers

> User deleteUsers(id)

Delete an existing User by id.

Takes an existing User, deletes it, and returns the new object.

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        UsersApi apiInstance = new UsersApi(defaultClient);
        UUID id = new UUID(); // UUID | User object to update.
        try {
            User result = apiInstance.deleteUsers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| User object to update. |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Server error. |  -  |


## getAllUsers

> List&lt;User&gt; getAllUsers()

Get all users.

Returns all Users.

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        UsersApi apiInstance = new UsersApi(defaultClient);
        try {
            List<User> result = apiInstance.getAllUsers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getAllUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Server error. |  -  |


## getUsersByID

> User getUsersByID(id)

Get a user by id.

Returns one User by id.

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        UsersApi apiInstance = new UsersApi(defaultClient);
        UUID id = new UUID(); // UUID | Returns a user by Id
        try {
            User result = apiInstance.getUsersByID(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersByID");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Returns a user by Id |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Server error. |  -  |


## updateUsers

> User updateUsers(body)

Update an existing user.

Takes an existing User, updates it, and returns the new object.

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        UsersApi apiInstance = new UsersApi(defaultClient);
        User body = new User(); // User | User object to update.
        try {
            User result = apiInstance.updateUsers(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| User object to update. |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **201** | Created |  -  |
| **400** | Invalid User. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Server error. |  -  |

