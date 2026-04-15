# AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authLoginAuthLoginPost**](AuthApi.md#authLoginAuthLoginPost) | **POST** auth/login | Auth Login |
| [**authRefreshAuthRefreshPost**](AuthApi.md#authRefreshAuthRefreshPost) | **POST** auth/refresh | Auth Refresh |
| [**getMeAuthMeGet**](AuthApi.md#getMeAuthMeGet) | **GET** auth/me | Get Me |



Auth Login

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthApi::class.java)
val userLogin : UserLogin =  // UserLogin | 

val result : LoginResponse = webService.authLoginAuthLoginPost(userLogin)
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userLogin** | [**UserLogin**](UserLogin.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Auth Refresh

Se envía el refresh token en la cookie o en el header Authorization (Bearer) para obtener nuevos tokens.

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthApi::class.java)

val result : LoginResponse = webService.authRefreshAuthRefreshPost()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Me

### Example
```kotlin
// Import classes:
//import com.fpfomento.android_app.api.*
//import com.fpfomento.android_app.api.infrastructure.*
//import com.fpfomento.android_app.api.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthApi::class.java)

val result : UserResponse = webService.getMeAuthMeGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResponse**](UserResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

