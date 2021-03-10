package com.example.sec14_102.data.model.tvshow

import com.google.gson.annotations.SerializedName

data class TvShowList(
        @SerializedName("results")
        val tvShows: List<TvShow>
)
