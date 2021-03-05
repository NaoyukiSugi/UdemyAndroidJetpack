package com.example.sec14_102.domain.usecase

import com.example.sec14_102.data.model.movie.Movie
import com.example.sec14_102.domain.repository.MovieRepository

class UpdateMoviesUseCase(val repository: MovieRepository) {
    suspend fun execute(): List<Movie>? = repository.updateMovies()
}
