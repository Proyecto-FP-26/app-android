package com.fpfomento.android_app.api.apis

import com.fpfomento.android_app.api.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.fpfomento.android_app.api.models.HTTPValidationError
import com.fpfomento.android_app.api.models.PaginatedReportsResponse
import com.fpfomento.android_app.api.models.ReportCreate
import com.fpfomento.android_app.api.models.ReportResponse
import com.fpfomento.android_app.api.models.ReportUpdate

interface ReportsApi {
    /**
     * POST reports/
     * Create Report
     * 
     * Responses:
     *  - 201: Successful Response
     *  - 422: Validation Error
     *
     * @param reportCreate 
     * @return [Call]<[ReportResponse]>
     */
    @POST("reports/")
    fun createReportReportsPost(@Body reportCreate: ReportCreate): Call<ReportResponse>

    /**
     * GET reports/{report_id}
     * Get Report
     * 
     * Responses:
     *  - 200: Successful Response
     *  - 422: Validation Error
     *
     * @param reportId 
     * @return [Call]<[ReportResponse]>
     */
    @GET("reports/{report_id}")
    fun getReportReportsReportIdGet(@Path("report_id") reportId: kotlin.Int): Call<ReportResponse>

    /**
     * GET reports/
     * Get Reports
     * 
     * Responses:
     *  - 200: Successful Response
     *  - 422: Validation Error
     *
     * @param page Pagina actual (optional, default to 1)
     * @param pageSize Cantidad de registros por pagina (optional, default to 10)
     * @return [Call]<[PaginatedReportsResponse]>
     */
    @GET("reports/")
    fun getReportsReportsGet(@Query("page") page: kotlin.Int? = 1, @Query("page_size") pageSize: kotlin.Int? = 10): Call<PaginatedReportsResponse>

    /**
     * PATCH reports/{report_id}
     * Update Report
     * 
     * Responses:
     *  - 200: Successful Response
     *  - 422: Validation Error
     *
     * @param reportId 
     * @param reportUpdate 
     * @return [Call]<[ReportResponse]>
     */
    @PATCH("reports/{report_id}")
    fun updateReportReportsReportIdPatch(@Path("report_id") reportId: kotlin.Int, @Body reportUpdate: ReportUpdate): Call<ReportResponse>

}
