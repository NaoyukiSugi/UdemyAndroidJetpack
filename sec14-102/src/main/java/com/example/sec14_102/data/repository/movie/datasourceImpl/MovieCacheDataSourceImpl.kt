package com.example.sec14_102.data.repository.movie.datasourceImpl

import com.example.sec14_102.data.model.movie.Movie
import com.example.sec14_102.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList()
    }
}
