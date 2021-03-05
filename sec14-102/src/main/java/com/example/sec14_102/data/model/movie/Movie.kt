package com.example.sec14_102.data.model.movie

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "popular_movies")
data class Movie(
        @PrimaryKey
        val id: Int,
        val title: String,
        val overview: String,
        val posterPath: String,
        val releaseDate: String,
)
