# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rootGet**](DefaultApi.md#rootGet) | **GET**  | Root |



Root

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)

val result : kotlin.Any = webService.rootGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

