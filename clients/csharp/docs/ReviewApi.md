# PlayPact.OpenAPI.Api.ReviewApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateReview**](ReviewApi.md#createreview) | **POST** /api/Review | TODO: Creates a report. |
| [**DeleteMyReview**](ReviewApi.md#deletemyreview) | **DELETE** /api/Review | Deletes a report. |
| [**GetMyReview**](ReviewApi.md#getmyreview) | **GET** /api/Review/my/{playPactReportId} | Gets all reviews, including the user&#39;s review that will hold more information. |
| [**GetReviews**](ReviewApi.md#getreviews) | **GET** /api/Review/{playPactReportId} | Gets all reviews, including the user&#39;s review that will hold more information. |
| [**UpdateMyReview**](ReviewApi.md#updatemyreview) | **PUT** /api/Review | Updates a report. |

<a id="createreview"></a>
# **CreateReview**
> void CreateReview (CreateReviewDto createReviewDto = null)

TODO: Creates a report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class CreateReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReviewApi(config);
            var createReviewDto = new CreateReviewDto(); // CreateReviewDto |  (optional) 

            try
            {
                // TODO: Creates a report.
                apiInstance.CreateReview(createReviewDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReviewApi.CreateReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // TODO: Creates a report.
    apiInstance.CreateReviewWithHttpInfo(createReviewDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReviewApi.CreateReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createReviewDto** | [**CreateReviewDto**](CreateReviewDto.md) |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletemyreview"></a>
# **DeleteMyReview**
> void DeleteMyReview (Guid? playPactUserId = null, Guid? playPactReview = null)

Deletes a report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class DeleteMyReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReviewApi(config);
            var playPactUserId = "playPactUserId_example";  // Guid? |  (optional) 
            var playPactReview = "playPactReview_example";  // Guid? |  (optional) 

            try
            {
                // Deletes a report.
                apiInstance.DeleteMyReview(playPactUserId, playPactReview);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReviewApi.DeleteMyReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteMyReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes a report.
    apiInstance.DeleteMyReviewWithHttpInfo(playPactUserId, playPactReview);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReviewApi.DeleteMyReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactUserId** | **Guid?** |  | [optional]  |
| **playPactReview** | **Guid?** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getmyreview"></a>
# **GetMyReview**
> ReviewDto GetMyReview (Guid playPactReportId)

Gets all reviews, including the user's review that will hold more information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetMyReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReviewApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | 

            try
            {
                // Gets all reviews, including the user's review that will hold more information.
                ReviewDto result = apiInstance.GetMyReview(playPactReportId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReviewApi.GetMyReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMyReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets all reviews, including the user's review that will hold more information.
    ApiResponse<ReviewDto> response = apiInstance.GetMyReviewWithHttpInfo(playPactReportId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReviewApi.GetMyReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getreviews"></a>
# **GetReviews**
> List&lt;ReviewDto&gt; GetReviews (Guid playPactReportId)

Gets all reviews, including the user's review that will hold more information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetReviewsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReviewApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | 

            try
            {
                // Gets all reviews, including the user's review that will hold more information.
                List<ReviewDto> result = apiInstance.GetReviews(playPactReportId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReviewApi.GetReviews: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetReviewsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets all reviews, including the user's review that will hold more information.
    ApiResponse<List<ReviewDto>> response = apiInstance.GetReviewsWithHttpInfo(playPactReportId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReviewApi.GetReviewsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatemyreview"></a>
# **UpdateMyReview**
> void UpdateMyReview (Guid? playPactUserId = null, ReviewDto reviewDto = null)

Updates a report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class UpdateMyReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReviewApi(config);
            var playPactUserId = "playPactUserId_example";  // Guid? |  (optional) 
            var reviewDto = new ReviewDto(); // ReviewDto |  (optional) 

            try
            {
                // Updates a report.
                apiInstance.UpdateMyReview(playPactUserId, reviewDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReviewApi.UpdateMyReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateMyReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates a report.
    apiInstance.UpdateMyReviewWithHttpInfo(playPactUserId, reviewDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReviewApi.UpdateMyReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactUserId** | **Guid?** |  | [optional]  |
| **reviewDto** | [**ReviewDto**](ReviewDto.md) |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

