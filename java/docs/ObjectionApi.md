# ObjectionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createObjection**](ObjectionApi.md#createObjection) | **POST** /api/Objection | TODO: Creates a objection. |
| [**getObjection**](ObjectionApi.md#getObjection) | **GET** /api/Objection/{playPactObjectionId} | TODO: Gets a objection. |
| [**updateObjection**](ObjectionApi.md#updateObjection) | **PUT** /api/Objection | TODO: Updates a objection. |


<a id="createObjection"></a>
# **createObjection**
> createObjection(objectionDto)

TODO: Creates a objection.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ObjectionApi apiInstance = new ObjectionApi(defaultClient);
    ObjectionDto objectionDto = new ObjectionDto(); // ObjectionDto | 
    try {
      apiInstance.createObjection(objectionDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectionApi#createObjection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectionDto** | [**ObjectionDto**](ObjectionDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getObjection"></a>
# **getObjection**
> ObjectionDto getObjection(playPactObjectionId)

TODO: Gets a objection.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ObjectionApi apiInstance = new ObjectionApi(defaultClient);
    UUID playPactObjectionId = UUID.randomUUID(); // UUID | 
    try {
      ObjectionDto result = apiInstance.getObjection(playPactObjectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectionApi#getObjection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playPactObjectionId** | **UUID**|  | |

### Return type

[**ObjectionDto**](ObjectionDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="updateObjection"></a>
# **updateObjection**
> updateObjection(playPactObjectionId, objectionDto)

TODO: Updates a objection.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ObjectionApi apiInstance = new ObjectionApi(defaultClient);
    UUID playPactObjectionId = UUID.randomUUID(); // UUID | 
    ObjectionDto objectionDto = new ObjectionDto(); // ObjectionDto | 
    try {
      apiInstance.updateObjection(playPactObjectionId, objectionDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectionApi#updateObjection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playPactObjectionId** | **UUID**|  | [optional] |
| **objectionDto** | [**ObjectionDto**](ObjectionDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

