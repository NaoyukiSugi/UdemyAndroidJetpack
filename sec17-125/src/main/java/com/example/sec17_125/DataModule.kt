package com.example.sec17_125

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class DataModule {
    @Provides
    fun providesDataSource(): DataSource {
        return DataSource()
    }
}