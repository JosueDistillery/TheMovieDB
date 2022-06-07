package com.distillery.themoviedb.network

import com.distillery.themoviedb.data.response.CreditsResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Service to make API calls for Credit data
 */
interface CreditApi {
    /**
     * Get Credit Detail
     */
    @GET("/3/credit/{credit_id}")
    suspend fun getDetail(@Path("credit_id") creditId: Long): String

    /**
     * Get Credits from a Movie
     */
    @GET("/3/tv/{tv_id}/credits")
    suspend fun getTVCredits(@Path("tv_id") tvId: Long): CreditsResponse

    /**
     * Get Credits from a TV Show
     */
    @GET("/3/movie/{movie_id}/credits")
    suspend fun getMovieCredits(@Path("movie_id") movieId: Long): CreditsResponse

    companion object {
        /**
         * Factory function for [CreditApi]
         */
        fun create(retroFit: Retrofit): CreditApi = retroFit.create(CreditApi::class.java)
    }
}