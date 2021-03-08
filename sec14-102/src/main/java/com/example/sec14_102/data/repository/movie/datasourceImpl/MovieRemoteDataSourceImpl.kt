package com.example.sec14_102.data.repository.movie.datasourceImpl

import com.example.sec14_102.data.api.TMDBService
import com.example.sec14_102.data.model.movie.MovieList
import com.example.sec14_102.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
        private val tmdbService: TMDBService,
        private val apiKey: String
) : MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}
