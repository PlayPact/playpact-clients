# PactPointApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPactPointTransaction**](PactPointApi.md#getPactPointTransaction) | **GET** /api/PactPoint/{playPactTransactionId} | TODO: Gets a pact point transaction. |
| [**getPactPointTransactions**](PactPointApi.md#getPactPointTransactions) | **GET** /api/PactPoint | TODO: Gets all pact point transactions. |


<a id="getPactPointTransaction"></a>
# **getPactPointTransaction**
> PactPointReportTransactionDto getPactPointTransaction(playPactTransactionId)

TODO: Gets a pact point transaction.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PactPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PactPointApi apiInstance = new PactPointApi(defaultClient);
    UUID playPactTransactionId = UUID.randomUUID(); // UUID | 
    try {
      PactPointReportTransactionDto result = apiInstance.getPactPointTransaction(playPactTransactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PactPointApi#getPactPointTransaction");
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
| **playPactTransactionId** | **UUID**|  | |

### Return type

[**PactPointReportTransactionDto**](PactPointReportTransactionDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getPactPointTransactions"></a>
# **getPactPointTransactions**
> List&lt;PactPointReportTransactionDto&gt; getPactPointTransactions()

TODO: Gets all pact point transactions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PactPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PactPointApi apiInstance = new PactPointApi(defaultClient);
    try {
      List<PactPointReportTransactionDto> result = apiInstance.getPactPointTransactions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PactPointApi#getPactPointTransactions");
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

[**List&lt;PactPointReportTransactionDto&gt;**](PactPointReportTransactionDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

