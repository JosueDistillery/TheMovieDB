package com.distillery.themoviedb.network

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Service to make API calls for Review data
 */
interface ReviewApi {
    /**
     * Get Credit Detail
     */
    @GET("/3/review/{review_id}")
    suspend fun getDetail(@Path("review_id") reviewId: Long): String

    /**
     * Get Reviews from a TV Show
     */
    @GET("/3/tv/{tv_id}/reviews")
    suspend fun getTVReviews(@Path("tv_id") tvId: Long): String

    /**
     * Get Reviews from a Movie
     */
    @GET("/3/movie/{movie_id}/reviews")
    suspend fun getMovieReviews(@Path("movie_id") movieId: Long): String

    companion object {
        /**
         * Factory function for [ReviewApi]
         */
        fun create(retroFit: Retrofit): ReviewApi = retroFit.create(ReviewApi::class.java)
    }
}