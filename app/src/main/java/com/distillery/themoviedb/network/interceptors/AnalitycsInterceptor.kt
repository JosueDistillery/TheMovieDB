package com.distillery.themoviedb.network.interceptors

import android.content.Context
import android.os.Build
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Singleton

class AnalyticsInterceptor(private val context: Context): Interceptor {
    private val APP_VERSION = "X-App-Version"
    private val DEVICE_MODEL = "X-Device-Model"
    private val DEVICE_PLATFORM = "X-Device-Platform"
    private val OS_VERSION = "X-Device-OS-Version"

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val newRequest = originalRequest.newBuilder()

        newRequest.addHeader(APP_VERSION, context.packageManager.getPackageInfo(context.packageName, 0).versionName)
        newRequest.addHeader(OS_VERSION, Build.VERSION.SDK_INT.toString())
        newRequest.addHeader(DEVICE_MODEL, Build.MODEL)
        newRequest.addHeader(DEVICE_PLATFORM, "Android")

        return chain.proceed(newRequest.build())
    }
}