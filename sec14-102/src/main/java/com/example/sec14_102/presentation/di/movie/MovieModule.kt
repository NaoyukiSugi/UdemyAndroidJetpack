package com.example.sec14_102.presentation.di.movie

import com.example.sec14_102.domain.usecase.GetMoviesUseCase
import com.example.sec14_102.domain.usecase.UpdateMoviesUseCase
import com.example.sec14_102.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }
}
