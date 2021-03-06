package com.example.sec14_102.domain.usecase

import com.example.sec14_102.data.model.artist.Artist
import com.example.sec14_102.domain.repository.ArtistRepository

class UpdateArtistsUseCase(val repository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = repository.updateArtists()
}
