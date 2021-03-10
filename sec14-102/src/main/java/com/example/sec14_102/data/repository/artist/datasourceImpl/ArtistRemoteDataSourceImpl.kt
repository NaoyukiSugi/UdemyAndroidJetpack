package com.example.sec14_102.data.repository.artist.datasourceImpl

import com.example.sec14_102.data.api.TMDBService
import com.example.sec14_102.data.model.artist.ArtistList
import com.example.sec14_102.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDataSource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

