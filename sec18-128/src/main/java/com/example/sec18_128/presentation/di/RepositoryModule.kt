package com.example.sec18_128.presentation.di

import com.example.sec18_128.data.repository.NewsRepositoryImpl
import com.example.sec18_128.data.repository.dataSource.NewsRemoteDataSource
import com.example.sec18_128.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}
