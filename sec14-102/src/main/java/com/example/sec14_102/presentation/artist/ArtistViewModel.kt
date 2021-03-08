package com.example.sec14_102.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.sec14_102.domain.usecase.GetArtistsUseCase
import com.example.sec14_102.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) : ViewModel() {

    fun getArtists() = liveData {
        val artists = getArtistsUseCase.execute()
        emit(artists)
    }

    fun updateArtists() = liveData {
        val artists = updateArtistsUseCase.execute()
        emit(artists)
    }
}
