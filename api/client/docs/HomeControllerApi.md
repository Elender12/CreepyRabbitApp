# HomeControllerApi

All URIs are relative to *http://10.0.2.2:9100*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configUsingGET**](HomeControllerApi.md#configUsingGET) | **GET** config | config
[**healthcheckUsingGET**](HomeControllerApi.md#healthcheckUsingGET) | **GET** healthcheck | healthcheck
[**indexUsingGET**](HomeControllerApi.md#indexUsingGET) | **GET**  | index



## configUsingGET

> Map&lt;String, String&gt; configUsingGET()

config

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.HomeControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        HomeControllerApi apiInstance = new HomeControllerApi(defaultClient);
        try {
            Map<String, String> result = apiInstance.configUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HomeControllerApi#configUsingGET");
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

**Map&lt;String, String&gt;**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## healthcheckUsingGET

> String healthcheckUsingGET()

healthcheck

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.HomeControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        HomeControllerApi apiInstance = new HomeControllerApi(defaultClient);
        try {
            String result = apiInstance.healthcheckUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HomeControllerApi#healthcheckUsingGET");
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

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## indexUsingGET

> String indexUsingGET()

index

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.HomeControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        HomeControllerApi apiInstance = new HomeControllerApi(defaultClient);
        try {
            String result = apiInstance.indexUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HomeControllerApi#indexUsingGET");
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

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

