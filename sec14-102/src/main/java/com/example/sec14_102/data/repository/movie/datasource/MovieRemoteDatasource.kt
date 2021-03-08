package com.example.sec14_102.data.repository.movie.datasource

import com.example.sec14_102.data.model.movie.Movie
import com.example.sec14_102.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}
