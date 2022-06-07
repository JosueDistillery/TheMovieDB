package com.distillery.themoviedb.network

import com.distillery.themoviedb.data.model.TVNetworkDetail
import com.distillery.themoviedb.data.response.AlternativeNameResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Service to make API calls for TV Network data
 */
interface TVNetworkApi {
    /**
     * Get TV Network Detail
     */
    @GET("/3/network/{network_id}")
    suspend fun getDetail(@Path("network_id") id: Long): TVNetworkDetail

    /**
     * Get TV Network alternatives names
     */
    @GET("/3/network/{network_id}/alternative_names")
    suspend fun getAlternativeNames(@Path("network_id") id: Long): AlternativeNameResponse

    /**
     * Get TV Network Images
     */
    @GET("/3/network/{network_id}/images")
    suspend fun getImages(@Path("network_id") id: Long): Object

    companion object {
        /**
         * Factory function for [TVNetworkApi]
         */
        fun create(retroFit: Retrofit): TVNetworkApi = retroFit.create(TVNetworkApi::class.java)
    }
}