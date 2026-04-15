# ReportsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createReportReportsPost**](ReportsApi.md#createReportReportsPost) | **POST** reports/ | Create Report |
| [**getReportReportsReportIdGet**](ReportsApi.md#getReportReportsReportIdGet) | **GET** reports/{report_id} | Get Report |
| [**getReportsReportsGet**](ReportsApi.md#getReportsReportsGet) | **GET** reports/ | Get Reports |
| [**updateReportReportsReportIdPatch**](ReportsApi.md#updateReportReportsReportIdPatch) | **PATCH** reports/{report_id} | Update Report |



Create Report

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReportsApi::class.java)
val reportCreate : ReportCreate =  // ReportCreate | 

val result : ReportResponse = webService.createReportReportsPost(reportCreate)
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportCreate** | [**ReportCreate**](ReportCreate.md)|  | |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Report

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReportsApi::class.java)
val reportId : kotlin.Int = 56 // kotlin.Int | 

val result : ReportResponse = webService.getReportReportsReportIdGet(reportId)
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportId** | **kotlin.Int**|  | |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Reports

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReportsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Pagina actual
val pageSize : kotlin.Int = 56 // kotlin.Int | Cantidad de registros por pagina

val result : PaginatedReportsResponse = webService.getReportsReportsGet(page, pageSize)
```

### Parameters
| **page** | **kotlin.Int**| Pagina actual | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Cantidad de registros por pagina | [optional] [default to 10] |

### Return type

[**PaginatedReportsResponse**](PaginatedReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Report

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReportsApi::class.java)
val reportId : kotlin.Int = 56 // kotlin.Int | 
val reportUpdate : ReportUpdate =  // ReportUpdate | 

val result : ReportResponse = webService.updateReportReportsReportIdPatch(reportId, reportUpdate)
```

### Parameters
| **reportId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportUpdate** | [**ReportUpdate**](ReportUpdate.md)|  | |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

