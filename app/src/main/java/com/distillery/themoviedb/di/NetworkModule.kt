package com.distillery.themoviedb.di

import android.content.Context
import com.distillery.themoviedb.BuildConfig
import com.distillery.themoviedb.network.MovieApi
import com.distillery.themoviedb.network.TVApi
import com.distillery.themoviedb.network.interceptors.AnalyticsInterceptor
import com.distillery.themoviedb.network.interceptors.ApiKeyInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()

    @Provides
    @Singleton
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory = GsonConverterFactory.create(gson)

    @Provides
    fun provideRetrofit(
        httpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.TMDB_BASE_URL)
            .addConverterFactory(gsonConverterFactory)
            .client(httpClient)
            .build()

    @Provides
    fun provideOkHttpClient(
        apiKeyInterceptor: ApiKeyInterceptor,
        analyticsInterceptor: AnalyticsInterceptor,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(apiKeyInterceptor)
            .addInterceptor(analyticsInterceptor)
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun provideApiKeyInterceptor() =
        ApiKeyInterceptor()

    @Provides
    @Singleton
    fun provideAnalyticsInterceptor(@ApplicationContext context: Context) =
        AnalyticsInterceptor(context)

    @Provides
    @Singleton
    fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().apply { level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE }

    /**
     * Create [TVApi]
     */
    @JvmStatic
    @Provides
    fun provideTVApi(retrofit: Retrofit): TVApi = TVApi.create(retrofit)

    /**
     * Create [MovieApi]
     */
    @JvmStatic
    @Provides
    fun provideMovieApi(retrofit: Retrofit): MovieApi = MovieApi.create(retrofit)
}