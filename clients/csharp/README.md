# Org.OpenAPITools - the C# library for the PlayPact API

The API for PlayPact.

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: v1
- SDK version: 1.0.0
- Generator version: 7.6.0-SNAPSHOT
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen
    For more information, please visit [https://playpact.com](https://playpact.com)

<a id="frameworks-supported"></a>
## Frameworks supported

<a id="dependencies"></a>
## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.13.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 13.0.2 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742).
NOTE: RestSharp for .Net Core creates a new socket for each api call, which can lead to a socket exhaustion problem. See [RestSharp#1406](https://github.com/restsharp/RestSharp/issues/1406).

<a id="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;
```
<a id="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out Org.OpenAPITools.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a id="usage"></a>
## Usage

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`
```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

<a id="getting-started"></a>
## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // Configure API key authorization: Bearer
            config.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DashboardApi(config);

            try
            {
                // Gets the number of active reports.
                int result = apiInstance.GetActiveReports();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DashboardApi.GetActiveReports: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DashboardApi* | [**GetActiveReports**](docs/DashboardApi.md#getactivereports) | **GET** /api/Dashboard/report/active/count | Gets the number of active reports.
*DashboardApi* | [**GetCompletedReports**](docs/DashboardApi.md#getcompletedreports) | **GET** /api/Dashboard/report/completed/count | Gets the number of completed reports.
*DashboardApi* | [**GetRegisteredServers**](docs/DashboardApi.md#getregisteredservers) | **GET** /api/Dashboard/server/count | Gets the number of registered servers.
*DashboardApi* | [**GetUserCount**](docs/DashboardApi.md#getusercount) | **GET** /api/Dashboard/user/count | Gets the number of users.
*ObjectionApi* | [**CreateMyObjection**](docs/ObjectionApi.md#createmyobjection) | **POST** /api/Objection | Creates a objection.
*ObjectionApi* | [**GetMyObjection**](docs/ObjectionApi.md#getmyobjection) | **GET** /api/Objection | Gets the objection for a report with more details.  Only works for the user who created the report.
*ObjectionApi* | [**GetObjection**](docs/ObjectionApi.md#getobjection) | **GET** /api/Objection/{playPactReportId} | Gets the objection for a report.
*ObjectionApi* | [**UpdateMyObjection**](docs/ObjectionApi.md#updatemyobjection) | **PUT** /api/Objection | TODO: Updates a objection.
*PactPointApi* | [**GetPactPointTransaction**](docs/PactPointApi.md#getpactpointtransaction) | **GET** /api/PactPoint/{playPactTransactionId} | TODO: Gets a pact point transaction.
*PactPointApi* | [**GetPactPointTransactions**](docs/PactPointApi.md#getpactpointtransactions) | **GET** /api/PactPoint | TODO: Gets all pact point transactions.
*ReportApi* | [**CreateMyReport**](docs/ReportApi.md#createmyreport) | **POST** /api/Report | Creates a report.
*ReportApi* | [**DeleteReport**](docs/ReportApi.md#deletereport) | **DELETE** /api/Report | Deletes a report.
*ReportApi* | [**GetMyReport**](docs/ReportApi.md#getmyreport) | **GET** /api/Report/my/{playPactReportId} | Gets your report.
*ReportApi* | [**GetMyReports**](docs/ReportApi.md#getmyreports) | **GET** /api/Report/my/list/{playPactUserId} | Gets all reports.
*ReportApi* | [**GetReport**](docs/ReportApi.md#getreport) | **GET** /api/Report/review/{playPactReportId} | Gets a report.
*ReportApi* | [**GetReviewReports**](docs/ReportApi.md#getreviewreports) | **GET** /api/Report/review/list/{playPactReviewerId} | Gets all reports.
*ReportApi* | [**GetVerdict**](docs/ReportApi.md#getverdict) | **GET** /api/Report/verdict/{playPactReportId} | Gets a verdict.
*ReportApi* | [**GetVerdicts**](docs/ReportApi.md#getverdicts) | **GET** /api/Report/verdict/list/{playPactUserId} | Gets all reports.
*ReportApi* | [**UpdateMyReport**](docs/ReportApi.md#updatemyreport) | **PUT** /api/Report | Updates a report.
*ReviewApi* | [**CreateReview**](docs/ReviewApi.md#createreview) | **POST** /api/Review | TODO: Creates a report.
*ReviewApi* | [**DeleteMyReview**](docs/ReviewApi.md#deletemyreview) | **DELETE** /api/Review | Deletes a report.
*ReviewApi* | [**GetMyReview**](docs/ReviewApi.md#getmyreview) | **GET** /api/Review/my/{playPactReportId} | Gets all reviews, including the user's review that will hold more information.
*ReviewApi* | [**GetReviews**](docs/ReviewApi.md#getreviews) | **GET** /api/Review/{playPactReportId} | Gets all reviews, including the user's review that will hold more information.
*ReviewApi* | [**UpdateMyReview**](docs/ReviewApi.md#updatemyreview) | **PUT** /api/Review | Updates a report.
*RuleApi* | [**CreateRule**](docs/RuleApi.md#createrule) | **POST** /api/Rule | Creates a rule.
*RuleApi* | [**GetRule**](docs/RuleApi.md#getrule) | **GET** /api/Rule/{playPactRuleId} | Gets a rule.
*RuleApi* | [**GetRules**](docs/RuleApi.md#getrules) | **GET** /api/Rule | Gets all rules.
*RuleApi* | [**UpdateRule**](docs/RuleApi.md#updaterule) | **PUT** /api/Rule | Updates a rule.
*ServerApi* | [**CreateServer**](docs/ServerApi.md#createserver) | **POST** /api/Server/{playPactUserId} | Creates a server.
*ServerApi* | [**DeleteServer**](docs/ServerApi.md#deleteserver) | **DELETE** /api/Server/{playPactUserId}/{playPactServerId} | Deletes a server.
*ServerApi* | [**GetMyServer**](docs/ServerApi.md#getmyserver) | **GET** /api/Server/my/{playPactServerId} | Gets a server.
*ServerApi* | [**GetMyServers**](docs/ServerApi.md#getmyservers) | **GET** /api/Server/my/list/{playPactUserId} | Gets all servers created by an user.
*ServerApi* | [**GetServer**](docs/ServerApi.md#getserver) | **GET** /api/Server/{playPactServerId} | Gets a server.
*ServerApi* | [**GetServers**](docs/ServerApi.md#getservers) | **GET** /api/Server/list | Gets all servers.
*ServerApi* | [**UpdateMetaData**](docs/ServerApi.md#updatemetadata) | **PATCH** /api/Server/metadata | TODO: Updates the metadata of a server.
*ServerApi* | [**UpdateMyServer**](docs/ServerApi.md#updatemyserver) | **PUT** /api/Server/{playPactServerId} | Updates a server.
*TestApi* | [**TestAddingPactPoints**](docs/TestApi.md#testaddingpactpoints) | **POST** /api/Test | 
*TestApi* | [**TestGettingPactPoints**](docs/TestApi.md#testgettingpactpoints) | **GET** /api/Test | 
*TestApi* | [**TestGettingPactPointsHistory**](docs/TestApi.md#testgettingpactpointshistory) | **GET** /api/Test/history | 
*UserApi* | [**GetPactPointHistory**](docs/UserApi.md#getpactpointhistory) | **GET** /api/User/pactpoints/{playPactUserId}/history | Gets a users pact point history.
*UserApi* | [**GetPactPoints**](docs/UserApi.md#getpactpoints) | **GET** /api/User/pactPoints/{playPactUserId} | Gets a users pact points.
*UserApi* | [**GetPlatformIdentifiers**](docs/UserApi.md#getplatformidentifiers) | **GET** /api/User/identifiers/{playPactUserId} | Gets the platform identifiers for a player.
*UserApi* | [**GetUser**](docs/UserApi.md#getuser) | **GET** /api/User/{playPactUserId} | Gets a user by their PlayPact identifier.
*UserApi* | [**GetUsers**](docs/UserApi.md#getusers) | **GET** /api/User | Gets all users.
*UserApi* | [**GetUsersOnServer**](docs/UserApi.md#getusersonserver) | **GET** /api/User/server/{playPactServerId} | Gets all users on a server.
*UserApi* | [**RegisterPlayPactUser**](docs/UserApi.md#registerplaypactuser) | **POST** /api/User | Registers a user to play pact.
*UserApi* | [**UpdatesAUsersPlatformIdentifiers**](docs/UserApi.md#updatesausersplatformidentifiers) | **POST** /api/User/identifiers/{playPactUserId} | Updates the platform identifiers for a player.
*UserApi* | [**UserBannedFromServer**](docs/UserApi.md#userbannedfromserver) | **POST** /api/User/banned | TODO: Tells PlayPact that a user has been banned from a server.
*UserApi* | [**UserChallengesServerLogin**](docs/UserApi.md#userchallengesserverlogin) | **POST** /api/User/challenge | Returns if the given player can join the server.
*UserApi* | [**UserJoinedServer**](docs/UserApi.md#userjoinedserver) | **POST** /api/User/joined | TODO: Tells PlayPact that a user has joined on a server.
*UserApi* | [**UserKickedFromServer**](docs/UserApi.md#userkickedfromserver) | **POST** /api/User/kicked | TODO: Tells PlayPact that a user has been kicked from a server.
*UserApi* | [**UserLeftServer**](docs/UserApi.md#userleftserver) | **POST** /api/User/disconnected | TODO: Tells PlayPact that a user has left a server.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [Model.CreateEvidenceDto](docs/CreateEvidenceDto.md)
 - [Model.CreateMyReportDto](docs/CreateMyReportDto.md)
 - [Model.CreateMyServerDto](docs/CreateMyServerDto.md)
 - [Model.CreateObjectionDto](docs/CreateObjectionDto.md)
 - [Model.CreateReviewDto](docs/CreateReviewDto.md)
 - [Model.CreateRuleDto](docs/CreateRuleDto.md)
 - [Model.EvidenceDto](docs/EvidenceDto.md)
 - [Model.FileType](docs/FileType.md)
 - [Model.MyReportDto](docs/MyReportDto.md)
 - [Model.MyReportListDto](docs/MyReportListDto.md)
 - [Model.MyServerDto](docs/MyServerDto.md)
 - [Model.MyServerListDto](docs/MyServerListDto.md)
 - [Model.ObjectionDto](docs/ObjectionDto.md)
 - [Model.PactPointHistoryDto](docs/PactPointHistoryDto.md)
 - [Model.PactPointReportTransactionDto](docs/PactPointReportTransactionDto.md)
 - [Model.PlatformIdentifierDto](docs/PlatformIdentifierDto.md)
 - [Model.PlatformIdentifierEnumDto](docs/PlatformIdentifierEnumDto.md)
 - [Model.ReportDto](docs/ReportDto.md)
 - [Model.ReportListDto](docs/ReportListDto.md)
 - [Model.ReportStatus](docs/ReportStatus.md)
 - [Model.ReviewDto](docs/ReviewDto.md)
 - [Model.ReviewEvaluation](docs/ReviewEvaluation.md)
 - [Model.RuleDto](docs/RuleDto.md)
 - [Model.RuleListDto](docs/RuleListDto.md)
 - [Model.ServerChallengeDto](docs/ServerChallengeDto.md)
 - [Model.ServerDto](docs/ServerDto.md)
 - [Model.ServerListDto](docs/ServerListDto.md)
 - [Model.UserDto](docs/UserDto.md)
 - [Model.UserListDto](docs/UserListDto.md)
 - [Model.VerdictDto](docs/VerdictDto.md)
 - [Model.VerdictListDto](docs/VerdictListDto.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header
