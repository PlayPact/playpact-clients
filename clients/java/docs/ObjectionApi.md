# ObjectionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMyObjection**](ObjectionApi.md#createMyObjection) | **POST** /api/Objection | Creates a objection. |
| [**getMyObjection**](ObjectionApi.md#getMyObjection) | **GET** /api/Objection | Gets the objection for a report with more details.  Only works for the user who created the report. |
| [**getObjection**](ObjectionApi.md#getObjection) | **GET** /api/Objection/{playPactReportId} | Gets the objection for a report. |
| [**updateMyObjection**](ObjectionApi.md#updateMyObjection) | **PUT** /api/Objection | TODO: Updates a objection. |


<a id="createMyObjection"></a>
# **createMyObjection**
> createMyObjection(createObjectionDto)

Creates a objection.

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
    CreateObjectionDto createObjectionDto = new CreateObjectionDto(); // CreateObjectionDto | 
    try {
      apiInstance.createMyObjection(createObjectionDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectionApi#createMyObjection");
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
| **createObjectionDto** | [**CreateObjectionDto**](CreateObjectionDto.md)|  | [optional] |

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

<a id="getMyObjection"></a>
# **getMyObjection**
> ObjectionDto getMyObjection(playPactReportId, playPactUserId)

Gets the objection for a report with more details.  Only works for the user who created the report.

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
    UUID playPactReportId = UUID.randomUUID(); // UUID | Play pact id of the report to get the objection for.
    UUID playPactUserId = UUID.randomUUID(); // UUID | Play pact id of the requesting user.
    try {
      ObjectionDto result = apiInstance.getMyObjection(playPactReportId, playPactUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectionApi#getMyObjection");
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
| **playPactReportId** | **UUID**| Play pact id of the report to get the objection for. | [optional] |
| **playPactUserId** | **UUID**| Play pact id of the requesting user. | [optional] |

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

<a id="getObjection"></a>
# **getObjection**
> ObjectionDto getObjection(playPactReportId, playPactUserId)

Gets the objection for a report.

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
    UUID playPactReportId = UUID.randomUUID(); // UUID | Play pact id of the report to get the objection for.
    UUID playPactUserId = UUID.randomUUID(); // UUID | Play pact id of the requesting user.
    try {
      ObjectionDto result = apiInstance.getObjection(playPactReportId, playPactUserId);
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
| **playPactReportId** | **UUID**| Play pact id of the report to get the objection for. | |
| **playPactUserId** | **UUID**| Play pact id of the requesting user. | [optional] |

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

<a id="updateMyObjection"></a>
# **updateMyObjection**
> updateMyObjection(playPactObjectionId, objectionDto)

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
      apiInstance.updateMyObjection(playPactObjectionId, objectionDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectionApi#updateMyObjection");
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

