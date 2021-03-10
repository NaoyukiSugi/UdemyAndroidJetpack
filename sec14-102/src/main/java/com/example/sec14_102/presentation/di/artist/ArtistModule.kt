package com.example.sec14_102.presentation.di.artist

import com.example.sec14_102.domain.usecase.GetArtistsUseCase
import com.example.sec14_102.domain.usecase.UpdateArtistsUseCase
import com.example.sec14_102.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }
}
