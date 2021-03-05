package com.example.sec14_102.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sec14_102.data.model.artist.Artist
import com.example.sec14_102.data.db.ArtistDao
import com.example.sec14_102.data.model.movie.Movie
import com.example.sec14_102.data.db.MovieDao
import com.example.sec14_102.data.model.tvshow.TvShow
import com.example.sec14_102.data.db.TvShowDao

@Database(entities = [Movie::class, TvShow::class, Artist::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}
