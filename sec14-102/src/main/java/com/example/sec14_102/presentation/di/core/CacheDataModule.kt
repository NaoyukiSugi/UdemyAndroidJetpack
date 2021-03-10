package com.example.sec14_102.presentation.di.core

import com.example.sec14_102.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.sec14_102.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.example.sec14_102.data.repository.movie.datasource.MovieCacheDataSource
import com.example.sec14_102.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.sec14_102.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.sec14_102.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}
