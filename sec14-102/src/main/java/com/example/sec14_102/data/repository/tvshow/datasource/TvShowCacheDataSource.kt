package com.example.sec14_102.data.repository.tvshow.datasource

import com.example.sec14_102.data.model.tvshow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}
