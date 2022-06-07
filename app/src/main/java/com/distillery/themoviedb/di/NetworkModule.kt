package com.distillery.themoviedb.di

import android.content.Context
import com.distillery.themoviedb.BuildConfig
import com.distillery.themoviedb.network.*
import com.distillery.themoviedb.network.interceptors.AnalyticsInterceptor
import com.distillery.themoviedb.network.interceptors.ApiKeyInterceptor
import com.distillery.themoviedb.network.interceptors.LanguageInterceptor
import com.google.gson.Gson
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
        languageInterceptor: LanguageInterceptor,
        analyticsInterceptor: AnalyticsInterceptor,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(apiKeyInterceptor)
            .addInterceptor(languageInterceptor)
            .addInterceptor(analyticsInterceptor)
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun provideLanguageInterceptor() =
        LanguageInterceptor()

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

    /**
     * Create [CreditApi]
     */
    @JvmStatic
    @Provides
    fun provideCreditApi(retrofit: Retrofit): CreditApi = CreditApi.create(retrofit)

    /**
     * Create [ReviewApi]
     */
    @JvmStatic
    @Provides
    fun provideReviewApi(retrofit: Retrofit): ReviewApi = ReviewApi.create(retrofit)

    /**
     * Create [CompanyApi]
     */
    @JvmStatic
    @Provides
    fun provideCompanyApi(retrofit: Retrofit): CompanyApi = CompanyApi.create(retrofit)

    /**
     * Create [TVNetworkApi]
     */
    @JvmStatic
    @Provides
    fun provideTVNetworkApi(retrofit: Retrofit): TVNetworkApi = TVNetworkApi.create(retrofit)
}