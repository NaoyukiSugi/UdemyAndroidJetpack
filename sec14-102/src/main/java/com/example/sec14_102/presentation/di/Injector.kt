package com.example.sec14_102.presentation.di

import com.example.sec14_102.presentation.di.artist.ArtistSubComponent
import com.example.sec14_102.presentation.di.movie.MovieSubComponent
import com.example.sec14_102.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}
