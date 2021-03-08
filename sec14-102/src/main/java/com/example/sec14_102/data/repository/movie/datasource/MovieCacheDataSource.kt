package com.example.sec14_102.data.repository.movie.datasource

import com.example.sec14_102.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}
