package com.distillery.themoviedb.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response


class LanguageInterceptor: Interceptor {
    private val LANGUAGE_QUERY = "language"

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val url = originalRequest.url.newBuilder()
            .addQueryParameter(LANGUAGE_QUERY, "en-US")
            .build()

        val newRequest = originalRequest.newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}