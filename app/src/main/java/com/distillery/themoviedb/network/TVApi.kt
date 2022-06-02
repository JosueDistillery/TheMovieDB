package com.distillery.themoviedb.network

import com.distillery.themoviedb.data.response.GenresResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Service to make API calls for TV data
 */
interface TVApi {

    /**
     * Get genres of TV Shows
     */
    @GET("/3/genre/tv/list")
    suspend fun getTVGenres(@Query("language") language: String): GenresResponse

    companion object {
        /**
         * Factory function for [TVApi]
         */
        fun create(retroFit: Retrofit): TVApi = retroFit.create(TVApi::class.java)
    }
}