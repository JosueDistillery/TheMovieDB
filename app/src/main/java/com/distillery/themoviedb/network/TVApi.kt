package com.distillery.themoviedb.network

import com.distillery.themoviedb.data.model.TVDetail
import com.distillery.themoviedb.data.response.GenresResponse
import com.distillery.themoviedb.data.response.TVsReponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Service to make API calls for TV data
 */
interface TVApi {
    /**
     * Get Discover of TV Shows
     */
    @GET("/3/discover/tv")
    suspend fun getDiscover(): TVsReponse

    /**
     * Get popular TV Shows
     */
    @GET("/3/tv/popular")
    suspend fun getPopular(): TVsReponse

    /**
     * Get Detail of a TV Shows
     */
    @GET("/3/tv/{tv_id}")
    suspend fun getDetail(@Path("tv_id") tvId: Long): TVDetail

    /**
     * Get genres of TV Shows
     */
    @GET("/3/genre/tv/list")
    suspend fun getGenres(): GenresResponse

    companion object {
        /**
         * Factory function for [TVApi]
         */
        fun create(retroFit: Retrofit): TVApi = retroFit.create(TVApi::class.java)
    }
}