package com.example.sec14_102.data.repository.artist.datasource

import com.example.sec14_102.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}
