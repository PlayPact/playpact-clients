# Org.OpenAPITools.Api.ObjectionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateMyObjection**](ObjectionApi.md#createmyobjection) | **POST** /api/Objection | Creates a objection. |
| [**GetMyObjection**](ObjectionApi.md#getmyobjection) | **GET** /api/Objection | Gets the objection for a report with more details.  Only works for the user who created the report. |
| [**GetObjection**](ObjectionApi.md#getobjection) | **GET** /api/Objection/{playPactReportId} | Gets the objection for a report. |
| [**UpdateMyObjection**](ObjectionApi.md#updatemyobjection) | **PUT** /api/Objection | TODO: Updates a objection. |

<a id="createmyobjection"></a>
# **CreateMyObjection**
> void CreateMyObjection (CreateObjectionDto? createObjectionDto = null)

Creates a objection.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateMyObjectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ObjectionApi(config);
            var createObjectionDto = new CreateObjectionDto?(); // CreateObjectionDto? |  (optional) 

            try
            {
                // Creates a objection.
                apiInstance.CreateMyObjection(createObjectionDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ObjectionApi.CreateMyObjection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateMyObjectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a objection.
    apiInstance.CreateMyObjectionWithHttpInfo(createObjectionDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ObjectionApi.CreateMyObjectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createObjectionDto** | [**CreateObjectionDto?**](CreateObjectionDto?.md) |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getmyobjection"></a>
# **GetMyObjection**
> ObjectionDto GetMyObjection (Guid? playPactReportId = null, Guid? playPactUserId = null)

Gets the objection for a report with more details.  Only works for the user who created the report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetMyObjectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ObjectionApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid? | Play pact id of the report to get the objection for. (optional) 
            var playPactUserId = "playPactUserId_example";  // Guid? | Play pact id of the requesting user. (optional) 

            try
            {
                // Gets the objection for a report with more details.  Only works for the user who created the report.
                ObjectionDto result = apiInstance.GetMyObjection(playPactReportId, playPactUserId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ObjectionApi.GetMyObjection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMyObjectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets the objection for a report with more details.  Only works for the user who created the report.
    ApiResponse<ObjectionDto> response = apiInstance.GetMyObjectionWithHttpInfo(playPactReportId, playPactUserId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ObjectionApi.GetMyObjectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid?** | Play pact id of the report to get the objection for. | [optional]  |
| **playPactUserId** | **Guid?** | Play pact id of the requesting user. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getobjection"></a>
# **GetObjection**
> ObjectionDto GetObjection (Guid playPactReportId, Guid? playPactUserId = null)

Gets the objection for a report.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetObjectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ObjectionApi(config);
            var playPactReportId = "playPactReportId_example";  // Guid | Play pact id of the report to get the objection for.
            var playPactUserId = "playPactUserId_example";  // Guid? | Play pact id of the requesting user. (optional) 

            try
            {
                // Gets the objection for a report.
                ObjectionDto result = apiInstance.GetObjection(playPactReportId, playPactUserId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ObjectionApi.GetObjection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetObjectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets the objection for a report.
    ApiResponse<ObjectionDto> response = apiInstance.GetObjectionWithHttpInfo(playPactReportId, playPactUserId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ObjectionApi.GetObjectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactReportId** | **Guid** | Play pact id of the report to get the objection for. |  |
| **playPactUserId** | **Guid?** | Play pact id of the requesting user. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatemyobjection"></a>
# **UpdateMyObjection**
> void UpdateMyObjection (Guid? playPactObjectionId = null, ObjectionDto? objectionDto = null)

TODO: Updates a objection.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateMyObjectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ObjectionApi(config);
            var playPactObjectionId = "playPactObjectionId_example";  // Guid? |  (optional) 
            var objectionDto = new ObjectionDto?(); // ObjectionDto? |  (optional) 

            try
            {
                // TODO: Updates a objection.
                apiInstance.UpdateMyObjection(playPactObjectionId, objectionDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ObjectionApi.UpdateMyObjection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateMyObjectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // TODO: Updates a objection.
    apiInstance.UpdateMyObjectionWithHttpInfo(playPactObjectionId, objectionDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ObjectionApi.UpdateMyObjectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactObjectionId** | **Guid?** |  | [optional]  |
| **objectionDto** | [**ObjectionDto?**](ObjectionDto?.md) |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

