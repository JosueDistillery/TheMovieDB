package com.distillery.themoviedb.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    const val KEY_PREFERENCES = "tmdb_preferences"

    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences(KEY_PREFERENCES, Context.MODE_PRIVATE)
    }

    /*@Provides
    @Singleton
    fun provideTMDBDatabase(@ApplicationContext context: Context): TMDBDatabase {
        return TMDBDatabase.buildDatabase(context)
    }*/
}