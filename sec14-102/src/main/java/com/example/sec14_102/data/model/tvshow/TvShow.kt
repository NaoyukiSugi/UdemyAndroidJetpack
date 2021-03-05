package com.example.sec14_102.data.model.tvshow

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "popular_tvShows")
data class TvShow(
        @PrimaryKey
        val id: Int,
        @ColumnInfo(name = "popular_tv_show")
        val name: String,
        val firstAirDate: String,
        val overview: String,
        val posterPath: String,
)
