package com.example.sec14_102.data.repository.artist.datasource

import com.example.sec14_102.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}
