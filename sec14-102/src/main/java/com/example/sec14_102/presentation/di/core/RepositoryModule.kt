package com.example.sec14_102.presentation.di.core

import com.example.sec14_102.data.repository.artist.ArtistRepositoryImpl
import com.example.sec14_102.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.sec14_102.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.sec14_102.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.sec14_102.data.repository.movie.MovieRepositoryImpl
import com.example.sec14_102.data.repository.movie.datasource.MovieCacheDataSource
import com.example.sec14_102.data.repository.movie.datasource.MovieLocalDataSource
import com.example.sec14_102.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.sec14_102.data.repository.tvshow.TvShowRepositoryImpl
import com.example.sec14_102.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.sec14_102.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.sec14_102.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.sec14_102.domain.repository.ArtistRepository
import com.example.sec14_102.domain.repository.MovieRepository
import com.example.sec14_102.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDataSource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }
}
