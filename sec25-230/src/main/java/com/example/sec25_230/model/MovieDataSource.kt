package com.example.sec25_230.model

import androidx.paging.PageKeyedDataSource
import com.example.sec25_230.BuildConfig
import com.example.sec25_230.service.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieDataSource() : PageKeyedDataSource<Long, Movie>() {

    override fun loadInitial(
        params: LoadInitialParams<Long>,
        callback: LoadInitialCallback<Long, Movie>
    ) {
        RetrofitInstance.getService()
            .getPopularMoviesWithPaging(BuildConfig.API_KEY, 1)
            .enqueue(object : Callback<MovieDBResponse> {
                override fun onResponse(
                    call: Call<MovieDBResponse>,
                    response: Response<MovieDBResponse>
                ) {
                    val movieDBResponse = response.body()
                    if (movieDBResponse != null && movieDBResponse.movies != null) {
                        val movies = movieDBResponse.movies
                        callback.onResult(movies, null, 2)
                    }
                }

                override fun onFailure(call: Call<MovieDBResponse>, t: Throwable) {}
            })
    }

    override fun loadBefore(params: LoadParams<Long>, callback: LoadCallback<Long, Movie>) {}

    override fun loadAfter(params: LoadParams<Long>, callback: LoadCallback<Long, Movie>) {
        RetrofitInstance.getService()
            .getPopularMoviesWithPaging(BuildConfig.API_KEY, params.key)
            .enqueue(object : Callback<MovieDBResponse> {
                override fun onResponse(
                    call: Call<MovieDBResponse>,
                    response: Response<MovieDBResponse>
                ) {
                    val movieDBResponse = response.body()
                    if (movieDBResponse != null && movieDBResponse.movies != null) {
                        val movies = movieDBResponse.movies
                        callback.onResult(movies, params.key + 1)
                    }
                }
                override fun onFailure(call: Call<MovieDBResponse>, t: Throwable) {}
            })
    }
}
