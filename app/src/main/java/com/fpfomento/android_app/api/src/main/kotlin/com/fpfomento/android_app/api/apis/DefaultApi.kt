package com.fpfomento.android_app.api.apis

import com.fpfomento.android_app.api.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface DefaultApi {
    /**
     * GET 
     * Root
     * 
     * Responses:
     *  - 200: Successful Response
     *
     * @return [Call]<[kotlin.Any]>
     */
    @GET("")
    fun rootGet(): Call<kotlin.Any>

}
