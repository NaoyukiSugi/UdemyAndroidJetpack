package com.example.sec14_102.presentation.di.tvshow

import com.example.sec14_102.domain.usecase.GetTvShowsUseCase
import com.example.sec14_102.domain.usecase.UpdateTvShowsUseCase
import com.example.sec14_102.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}
