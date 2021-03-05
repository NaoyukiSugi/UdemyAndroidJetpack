package com.example.sec14_102.domain.repository

import com.example.sec14_102.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}
