package com.example.sec14_102.presentation.di.core

import com.example.sec14_102.data.api.TMDBService
import com.example.sec14_102.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.sec14_102.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.sec14_102.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.sec14_102.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.sec14_102.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.sec14_102.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}
