package com.fpfomento.android_app.api.apis

import com.fpfomento.android_app.api.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.fpfomento.android_app.api.models.HTTPValidationError
import com.fpfomento.android_app.api.models.LoginResponse
import com.fpfomento.android_app.api.models.UserLogin
import com.fpfomento.android_app.api.models.UserResponse

interface AuthApi {
    /**
     * POST auth/login
     * Auth Login
     * 
     * Responses:
     *  - 200: Successful Response
     *  - 422: Validation Error
     *
     * @param userLogin 
     * @return [Call]<[LoginResponse]>
     */
    @POST("auth/login")
    fun authLoginAuthLoginPost(@Body userLogin: UserLogin): Call<LoginResponse>

    /**
     * POST auth/refresh
     * Auth Refresh
     * Se envía el refresh token en la cookie o en el header Authorization (Bearer) para obtener nuevos tokens.
     * Responses:
     *  - 200: Successful Response
     *
     * @return [Call]<[LoginResponse]>
     */
    @POST("auth/refresh")
    fun authRefreshAuthRefreshPost(): Call<LoginResponse>

    /**
     * GET auth/me
     * Get Me
     * 
     * Responses:
     *  - 200: Successful Response
     *
     * @return [Call]<[UserResponse]>
     */
    @GET("auth/me")
    fun getMeAuthMeGet(): Call<UserResponse>

}
