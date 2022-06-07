package com.distillery.themoviedb.network

import com.distillery.themoviedb.data.model.CompanyDetail
import com.distillery.themoviedb.data.response.AlternativeNameResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Service to make API calls for Company data
 */
interface CompanyApi {
    /**
     * Get Company Detail
     */
    @GET("/3/company/{company_id}")
    suspend fun getDetail(@Path("company_id") companyId: Long): CompanyDetail

    /**
     * Get Company alternatives names
     */
    @GET("/3/company/{company_id}/alternative_names")
    suspend fun getAlternativeNames(@Path("company_id") companyId: Long): AlternativeNameResponse

    /**
     * Get Company Images
     */
    @GET("/3/company/{company_id}/images")
    suspend fun getImages(@Path("company_id") companyId: Long): Object

    companion object {
        /**
         * Factory function for [CompanyApi]
         */
        fun create(retroFit: Retrofit): CompanyApi = retroFit.create(CompanyApi::class.java)
    }
}