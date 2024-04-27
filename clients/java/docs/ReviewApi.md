# ReviewApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReview**](ReviewApi.md#createReview) | **POST** /api/Review | TODO: Creates a report. |
| [**deleteMyReview**](ReviewApi.md#deleteMyReview) | **DELETE** /api/Review | Deletes a report. |
| [**getMyReview**](ReviewApi.md#getMyReview) | **GET** /api/Review/my/{playPactReportId} | Gets all reviews, including the user&#39;s review that will hold more information. |
| [**getReviews**](ReviewApi.md#getReviews) | **GET** /api/Review/{playPactReportId} | Gets all reviews, including the user&#39;s review that will hold more information. |
| [**updateMyReview**](ReviewApi.md#updateMyReview) | **PUT** /api/Review | Updates a report. |


<a id="createReview"></a>
# **createReview**
> createReview(createReviewDto)

TODO: Creates a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    CreateReviewDto createReviewDto = new CreateReviewDto(); // CreateReviewDto | 
    try {
      apiInstance.createReview(createReviewDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#createReview");
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
| **createReviewDto** | [**CreateReviewDto**](CreateReviewDto.md)|  | [optional] |

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

<a id="deleteMyReview"></a>
# **deleteMyReview**
> deleteMyReview(playPactUserId, playPactReview)

Deletes a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    UUID playPactUserId = UUID.randomUUID(); // UUID | 
    UUID playPactReview = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteMyReview(playPactUserId, playPactReview);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#deleteMyReview");
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
| **playPactReview** | **UUID**|  | [optional] |

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

<a id="getMyReview"></a>
# **getMyReview**
> ReviewDto getMyReview(playPactReportId)

Gets all reviews, including the user&#39;s review that will hold more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    UUID playPactReportId = UUID.randomUUID(); // UUID | 
    try {
      ReviewDto result = apiInstance.getMyReview(playPactReportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#getMyReview");
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

[**ReviewDto**](ReviewDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getReviews"></a>
# **getReviews**
> List&lt;ReviewDto&gt; getReviews(playPactReportId)

Gets all reviews, including the user&#39;s review that will hold more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    UUID playPactReportId = UUID.randomUUID(); // UUID | 
    try {
      List<ReviewDto> result = apiInstance.getReviews(playPactReportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#getReviews");
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

[**List&lt;ReviewDto&gt;**](ReviewDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="updateMyReview"></a>
# **updateMyReview**
> updateMyReview(playPactUserId, reviewDto)

Updates a report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    UUID playPactUserId = UUID.randomUUID(); // UUID | 
    ReviewDto reviewDto = new ReviewDto(); // ReviewDto | 
    try {
      apiInstance.updateMyReview(playPactUserId, reviewDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#updateMyReview");
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
| **reviewDto** | [**ReviewDto**](ReviewDto.md)|  | [optional] |

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

