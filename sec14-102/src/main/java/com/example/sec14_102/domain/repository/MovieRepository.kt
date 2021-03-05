package com.example.sec14_102.domain.repository

import com.example.sec14_102.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}
