# PlayPact.OpenAPI.Api.ReportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateMyReport**](ReportApi.md#createmyreport) | **POST** /api/Report | Creates a report. |
| [**DeleteReport**](ReportApi.md#deletereport) | **DELETE** /api/Report | Deletes a report. |
| [**GetMyReport**](ReportApi.md#getmyreport) | **GET** /api/Report/my/{playPactReportId} | Gets your report. |
| [**GetMyReports**](ReportApi.md#getmyreports) | **GET** /api/Report/my/list/{playPactUserId} | Gets all reports. |
| [**GetReport**](ReportApi.md#getreport) | **GET** /api/Report/review/{playPactReportId} | Gets a report. |
| [**GetReviewReports**](ReportApi.md#getreviewreports) | **GET** /api/Report/review/list/{playPactReviewerId} | Gets all reports. |
| [**GetVerdict**](ReportApi.md#getverdict) | **GET** /api/Report/verdict/{playPactReportId} | Gets a verdict. |
| [**GetVerdicts**](ReportApi.md#getverdicts) | **GET** /api/Report/verdict/list/{playPactUserId} | Gets all reports. |
| [**UpdateMyReport**](ReportApi.md#updatemyreport) | **PUT** /api/Report | Updates a report. |
| [**UpdateReportStatus**](ReportApi.md#updatereportstatus) | **PUT** /api/Report/status/{playPactReportId} | Updates a report status. |

<a id="createmyreport"></a>
# **CreateMyReport**
> void CreateMyReport (CreateMyReportDto createMyReportDto = null)

Creates a report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class CreateMyReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var createMyReportDto = new CreateMyReportDto(); // CreateMyReportDto |  (optional) 

            try
            {
                // Creates a report.
                apiInstance.CreateMyReport(createMyReportDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.CreateMyReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateMyReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a report.
    apiInstance.CreateMyReportWithHttpInfo(createMyReportDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.CreateMyReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createMyReportDto** | [**CreateMyReportDto**](CreateMyReportDto.md) |  | [optional]  |

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

<a id="deletereport"></a>
# **DeleteReport**
> void DeleteReport (Guid? playpactReportId = null)

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
    public class DeleteReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playpactReportId = "playpactReportId_example";  // Guid? |  (optional) 

            try
            {
                // Deletes a report.
                apiInstance.DeleteReport(playpactReportId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.DeleteReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes a report.
    apiInstance.DeleteReportWithHttpInfo(playpactReportId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.DeleteReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playpactReportId** | **Guid?** |  | [optional]  |

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

<a id="getmyreport"></a>
# **GetMyReport**
> MyReportDto GetMyReport (Guid playPactReportId)

Gets your report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetMyReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | 

            try
            {
                // Gets your report.
                MyReportDto result = apiInstance.GetMyReport(playPactReportId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.GetMyReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMyReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets your report.
    ApiResponse<MyReportDto> response = apiInstance.GetMyReportWithHttpInfo(playPactReportId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.GetMyReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getmyreports"></a>
# **GetMyReports**
> List&lt;MyReportListDto&gt; GetMyReports (Guid playPactUserId)

Gets all reports.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetMyReportsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactUserId = "playPactUserId_example";  // Guid | 

            try
            {
                // Gets all reports.
                List<MyReportListDto> result = apiInstance.GetMyReports(playPactUserId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.GetMyReports: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMyReportsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets all reports.
    ApiResponse<List<MyReportListDto>> response = apiInstance.GetMyReportsWithHttpInfo(playPactUserId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.GetMyReportsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactUserId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getreport"></a>
# **GetReport**
> ReportDto GetReport (Guid playPactReportId)

Gets a report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | 

            try
            {
                // Gets a report.
                ReportDto result = apiInstance.GetReport(playPactReportId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.GetReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets a report.
    ApiResponse<ReportDto> response = apiInstance.GetReportWithHttpInfo(playPactReportId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.GetReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getreviewreports"></a>
# **GetReviewReports**
> List&lt;ReportListDto&gt; GetReviewReports (Guid playPactReviewerId)

Gets all reports.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetReviewReportsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactReviewerId = "playPactReviewerId_example";  // Guid | 

            try
            {
                // Gets all reports.
                List<ReportListDto> result = apiInstance.GetReviewReports(playPactReviewerId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.GetReviewReports: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetReviewReportsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets all reports.
    ApiResponse<List<ReportListDto>> response = apiInstance.GetReviewReportsWithHttpInfo(playPactReviewerId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.GetReviewReportsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReviewerId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getverdict"></a>
# **GetVerdict**
> VerdictDto GetVerdict (Guid playPactReportId)

Gets a verdict.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetVerdictExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | 

            try
            {
                // Gets a verdict.
                VerdictDto result = apiInstance.GetVerdict(playPactReportId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.GetVerdict: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetVerdictWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets a verdict.
    ApiResponse<VerdictDto> response = apiInstance.GetVerdictWithHttpInfo(playPactReportId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.GetVerdictWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getverdicts"></a>
# **GetVerdicts**
> List&lt;VerdictListDto&gt; GetVerdicts (Guid playPactUserId)

Gets all reports.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetVerdictsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactUserId = "playPactUserId_example";  // Guid | 

            try
            {
                // Gets all reports.
                List<VerdictListDto> result = apiInstance.GetVerdicts(playPactUserId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.GetVerdicts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetVerdictsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets all reports.
    ApiResponse<List<VerdictListDto>> response = apiInstance.GetVerdictsWithHttpInfo(playPactUserId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.GetVerdictsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactUserId** | **Guid** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatemyreport"></a>
# **UpdateMyReport**
> void UpdateMyReport (Guid? playPactUserId = null, MyReportDto myReportDto = null)

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
    public class UpdateMyReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactUserId = "playPactUserId_example";  // Guid? |  (optional) 
            var myReportDto = new MyReportDto(); // MyReportDto |  (optional) 

            try
            {
                // Updates a report.
                apiInstance.UpdateMyReport(playPactUserId, myReportDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.UpdateMyReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateMyReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates a report.
    apiInstance.UpdateMyReportWithHttpInfo(playPactUserId, myReportDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.UpdateMyReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactUserId** | **Guid?** |  | [optional]  |
| **myReportDto** | [**MyReportDto**](MyReportDto.md) |  | [optional]  |

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

<a id="updatereportstatus"></a>
# **UpdateReportStatus**
> void UpdateReportStatus (Guid playPactReportId, Guid? playPactUserId = null, ReportStatus? reportStatus = null, bool? isSystemUpdate = null)

Updates a report status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class UpdateReportStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ReportApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | 
            var playPactUserId = "playPactUserId_example";  // Guid? |  (optional) 
            var reportStatus = (ReportStatus) "Draft";  // ReportStatus? |  (optional) 
            var isSystemUpdate = false;  // bool? |  (optional)  (default to false)

            try
            {
                // Updates a report status.
                apiInstance.UpdateReportStatus(playPactReportId, playPactUserId, reportStatus, isSystemUpdate);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReportApi.UpdateReportStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateReportStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates a report status.
    apiInstance.UpdateReportStatusWithHttpInfo(playPactReportId, playPactUserId, reportStatus, isSystemUpdate);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ReportApi.UpdateReportStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** |  |  |
| **playPactUserId** | **Guid?** |  | [optional]  |
| **reportStatus** | **ReportStatus?** |  | [optional]  |
| **isSystemUpdate** | **bool?** |  | [optional] [default to false] |

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

