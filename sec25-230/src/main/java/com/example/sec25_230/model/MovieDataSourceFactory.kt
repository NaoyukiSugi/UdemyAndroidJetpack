package com.example.sec25_230.model

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource

class MovieDataSourceFactory(
    private var movieDataSource: MovieDataSource,
    private val mutableLiveData: MutableLiveData<MovieDataSource>
) : DataSource.Factory<Long, Movie>() {

    override fun create(): DataSource<Long, Movie> {
        movieDataSource = MovieDataSource()
        mutableLiveData.postValue(movieDataSource)
        return movieDataSource
    }

    fun getMutableLiveData(): MutableLiveData<MovieDataSource> {
        return mutableLiveData
    }
}
