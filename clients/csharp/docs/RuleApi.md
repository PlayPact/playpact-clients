# PlayPact.OpenAPI.Api.RuleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateRule**](RuleApi.md#createrule) | **POST** /api/Rule | Creates a rule. |
| [**GetRule**](RuleApi.md#getrule) | **GET** /api/Rule/{playPactRuleId} | Gets a rule. |
| [**GetRules**](RuleApi.md#getrules) | **GET** /api/Rule | Gets all rules. |
| [**UpdateRule**](RuleApi.md#updaterule) | **PUT** /api/Rule | Updates a rule. |

<a id="createrule"></a>
# **CreateRule**
> void CreateRule (CreateRuleDto createRuleDto = null)

Creates a rule.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class CreateRuleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new RuleApi(config);
            var createRuleDto = new CreateRuleDto(); // CreateRuleDto |  (optional) 

            try
            {
                // Creates a rule.
                apiInstance.CreateRule(createRuleDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RuleApi.CreateRule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateRuleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a rule.
    apiInstance.CreateRuleWithHttpInfo(createRuleDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RuleApi.CreateRuleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createRuleDto** | [**CreateRuleDto**](CreateRuleDto.md) |  | [optional]  |

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

<a id="getrule"></a>
# **GetRule**
> RuleDto GetRule (Guid playPactRuleId)

Gets a rule.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetRuleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new RuleApi(config);
            var playPactRuleId = "playPactRuleId_example";  // Guid | 

            try
            {
                // Gets a rule.
                RuleDto result = apiInstance.GetRule(playPactRuleId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RuleApi.GetRule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetRuleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets a rule.
    ApiResponse<RuleDto> response = apiInstance.GetRuleWithHttpInfo(playPactRuleId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RuleApi.GetRuleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **playPactRuleId** | **Guid** |  |  |

### Return type

[**RuleDto**](RuleDto.md)

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

<a id="getrules"></a>
# **GetRules**
> List&lt;RuleListDto&gt; GetRules ()

Gets all rules.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class GetRulesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new RuleApi(config);

            try
            {
                // Gets all rules.
                List<RuleListDto> result = apiInstance.GetRules();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RuleApi.GetRules: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetRulesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets all rules.
    ApiResponse<List<RuleListDto>> response = apiInstance.GetRulesWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RuleApi.GetRulesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;RuleListDto&gt;**](RuleListDto.md)

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

<a id="updaterule"></a>
# **UpdateRule**
> void UpdateRule (RuleDto ruleDto = null)

Updates a rule.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using PlayPact.OpenAPI.Api;
using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Model;

namespace Example
{
    public class UpdateRuleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new RuleApi(config);
            var ruleDto = new RuleDto(); // RuleDto |  (optional) 

            try
            {
                // Updates a rule.
                apiInstance.UpdateRule(ruleDto);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RuleApi.UpdateRule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateRuleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates a rule.
    apiInstance.UpdateRuleWithHttpInfo(ruleDto);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RuleApi.UpdateRuleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ruleDto** | [**RuleDto**](RuleDto.md) |  | [optional]  |

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

