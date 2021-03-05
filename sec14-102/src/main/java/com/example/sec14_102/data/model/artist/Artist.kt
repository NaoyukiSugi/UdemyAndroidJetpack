package com.example.sec14_102.data.model.artist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "popular_artists")
data class Artist(
        @PrimaryKey
        val id: Int,
        @ColumnInfo(name = "artist_name")
        val name: String,
        val popularity: Double,
        val profilePath: String
)
