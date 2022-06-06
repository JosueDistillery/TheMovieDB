package com.distillery.themoviedb.network

import com.distillery.themoviedb.data.response.GenresResponse
import com.distillery.themoviedb.data.response.MoviesResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Service to make API calls for movies data
 */
interface MovieApi {

    /**
     * Get Discover of Movies
     */
    @GET("/3/discover/movie")
    suspend fun getDiscoverMovies(@Query("language") language: String): MoviesResponse

    /**
     * Get Genres of Movies
     */
    @GET("/3/genre/movie/list")
    suspend fun getMovieGenres(@Query("language") language: String): GenresResponse

    companion object {
        /**
         * Factory function for [MovieApi]
         */
        fun create(retroFit: Retrofit): MovieApi = retroFit.create(MovieApi::class.java)
    }
}