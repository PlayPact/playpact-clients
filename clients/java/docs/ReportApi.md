# ReportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMyReport**](ReportApi.md#createMyReport) | **POST** /api/Report | Creates a report. |
| [**deleteReport**](ReportApi.md#deleteReport) | **DELETE** /api/Report | Deletes a report. |
| [**getMyReport**](ReportApi.md#getMyReport) | **GET** /api/Report/my/{playPactReportId} | Gets your report. |
| [**getMyReports**](ReportApi.md#getMyReports) | **GET** /api/Report/my/list/{playPactUserId} | Gets all reports. |
| [**getReport**](ReportApi.md#getReport) | **GET** /api/Report/review/{playPactReportId} | Gets a report. |
| [**getReviewReports**](ReportApi.md#getReviewReports) | **GET** /api/Report/review/list/{playPactReviewerId} | Gets all reports. |
| [**getVerdict**](ReportApi.md#getVerdict) | **GET** /api/Report/verdict/{playPactReportId} | Gets a verdict. |
| [**getVerdicts**](ReportApi.md#getVerdicts) | **GET** /api/Report/verdict/list/{playPactUserId} | Gets all reports. |
| [**updateMyReport**](ReportApi.md#updateMyReport) | **PUT** /api/Report | Updates a report. |


<a id="createMyReport"></a>
# **createMyReport**
> createMyReport(createMyReportDto)

Creates a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    CreateMyReportDto createMyReportDto = new CreateMyReportDto(); // CreateMyReportDto | 
    try {
      apiInstance.createMyReport(createMyReportDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#createMyReport");
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
| **createMyReportDto** | [**CreateMyReportDto**](CreateMyReportDto.md)|  | [optional] |

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

<a id="deleteReport"></a>
# **deleteReport**
> deleteReport(playpactReportId)

Deletes a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playpactReportId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteReport(playpactReportId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#deleteReport");
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
| **playpactReportId** | **UUID**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getMyReport"></a>
# **getMyReport**
> MyReportDto getMyReport(playPactReportId)

Gets your report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactReportId = UUID.randomUUID(); // UUID | 
    try {
      MyReportDto result = apiInstance.getMyReport(playPactReportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getMyReport");
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
| **playPactReportId** | **UUID**|  | |

### Return type

[**MyReportDto**](MyReportDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getMyReports"></a>
# **getMyReports**
> List&lt;MyReportListDto&gt; getMyReports(playPactUserId)

Gets all reports.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactUserId = UUID.randomUUID(); // UUID | 
    try {
      List<MyReportListDto> result = apiInstance.getMyReports(playPactUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getMyReports");
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
| **playPactUserId** | **UUID**|  | |

### Return type

[**List&lt;MyReportListDto&gt;**](MyReportListDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getReport"></a>
# **getReport**
> ReportDto getReport(playPactReportId)

Gets a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactReportId = UUID.randomUUID(); // UUID | 
    try {
      ReportDto result = apiInstance.getReport(playPactReportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getReport");
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
| **playPactReportId** | **UUID**|  | |

### Return type

[**ReportDto**](ReportDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getReviewReports"></a>
# **getReviewReports**
> List&lt;ReportListDto&gt; getReviewReports(playPactReviewerId)

Gets all reports.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactReviewerId = UUID.randomUUID(); // UUID | 
    try {
      List<ReportListDto> result = apiInstance.getReviewReports(playPactReviewerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getReviewReports");
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
| **playPactReviewerId** | **UUID**|  | |

### Return type

[**List&lt;ReportListDto&gt;**](ReportListDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getVerdict"></a>
# **getVerdict**
> VerdictDto getVerdict(playPactReportId)

Gets a verdict.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactReportId = UUID.randomUUID(); // UUID | 
    try {
      VerdictDto result = apiInstance.getVerdict(playPactReportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getVerdict");
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
| **playPactReportId** | **UUID**|  | |

### Return type

[**VerdictDto**](VerdictDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getVerdicts"></a>
# **getVerdicts**
> List&lt;VerdictListDto&gt; getVerdicts(playPactUserId)

Gets all reports.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactUserId = UUID.randomUUID(); // UUID | 
    try {
      List<VerdictListDto> result = apiInstance.getVerdicts(playPactUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getVerdicts");
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
| **playPactUserId** | **UUID**|  | |

### Return type

[**List&lt;VerdictListDto&gt;**](VerdictListDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="updateMyReport"></a>
# **updateMyReport**
> updateMyReport(playPactUserId, myReportDto)

Updates a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    UUID playPactUserId = UUID.randomUUID(); // UUID | 
    MyReportDto myReportDto = new MyReportDto(); // MyReportDto | 
    try {
      apiInstance.updateMyReport(playPactUserId, myReportDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#updateMyReport");
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
| **playPactUserId** | **UUID**|  | [optional] |
| **myReportDto** | [**MyReportDto**](MyReportDto.md)|  | [optional] |

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

