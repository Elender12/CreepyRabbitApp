# JwtResponseApi

All URIs are relative to *http://10.0.2.2:9100*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](JwtResponseApi.md#authenticate) | **POST** authenticate | Authenticate a user by username and password



## authenticate

> JwtResponse authenticate(authenticationRequest)

Authenticate a user by username and password

 .

### Example

```java
// Import classes:
import com.ecirstea.ApiClient;
import com.ecirstea.ApiException;
import com.ecirstea.Configuration;
import com.ecirstea.auth.*;
import com.ecirstea.models.*;
import com.ecirstea.api.JwtResponseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.0.2.2:9100");
        
        // Configure API key authorization: JWT
        ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
        JWT.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //JWT.setApiKeyPrefix("Token");

        JwtResponseApi apiInstance = new JwtResponseApi(defaultClient);
        JwtRequest authenticationRequest = new JwtRequest(); // JwtRequest | JwtRequest object
        try {
            JwtResponse result = apiInstance.authenticate(authenticationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JwtResponseApi#authenticate");
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
 **authenticationRequest** | [**JwtRequest**](JwtRequest.md)| JwtRequest object |

### Return type

[**JwtResponse**](JwtResponse.md)

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

