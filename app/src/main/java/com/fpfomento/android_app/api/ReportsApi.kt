package com.fpfomento.android_app.api

import com.fpfomento.android_app.api.models.PaginatedReportsResponse
import com.fpfomento.android_app.api.models.ReportCreate
import com.fpfomento.android_app.api.models.ReportResponse
import com.fpfomento.android_app.api.models.ReportUpdate
import retrofit2.http.*

interface ReportsApi {

    @POST("reports/")
    suspend fun createReportReportsPost(
        @Body reportCreate: ReportCreate
    ): ReportResponse

    @GET("reports/{report_id}")
    suspend fun getReportReportsReportIdGet(
        @Path("report_id") reportId: Int
    ): ReportResponse

    @GET("reports/")
    suspend fun getReportsReportsGet(
        @Query("page") page: Int? = 1,
        @Query("page_size") pageSize: Int? = 10
    ): PaginatedReportsResponse

    @PATCH("reports/{report_id}")
    suspend fun updateReportReportsReportIdPatch(
        @Path("report_id") reportId: Int,
        @Body reportUpdate: ReportUpdate
    ): ReportResponse
}
