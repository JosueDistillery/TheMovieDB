package com.distillery.themoviedb.network.interceptors

import com.distillery.themoviedb.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Singleton

class ApiKeyInterceptor: Interceptor {
    private val API_KEY_QUERY = "api_key"

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val url = originalRequest.url.newBuilder()
            .addQueryParameter(API_KEY_QUERY, BuildConfig.TMDB_API_KEY)
            .build()

        val newRequest = originalRequest.newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}