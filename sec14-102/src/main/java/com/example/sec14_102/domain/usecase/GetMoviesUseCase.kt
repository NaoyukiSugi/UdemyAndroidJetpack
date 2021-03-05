package com.example.sec14_102.domain.usecase

import com.example.sec14_102.data.model.movie.Movie
import com.example.sec14_102.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}
