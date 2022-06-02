package com.distillery.themoviedb.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/*
const val DATABASE_VERSION = 1

@Database(
    entities = [],
    version = DATABASE_VERSION
)
//@TypeConverters()
abstract class TMDBDatabase : RoomDatabase() {

    companion object {
        private const val DATABASE_NAME = "TMDB"

        fun buildDatabase(context: Context): TMDBDatabase {
            return Room.databaseBuilder(
                context,
                TMDBDatabase::class.java,
                DATABASE_NAME
            ).addMigrations()
                .build()
        }
    }

    abstract fun bookDao(): BookDao
}*/
