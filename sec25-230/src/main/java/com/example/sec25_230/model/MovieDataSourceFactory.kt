package com.example.sec25_230.model

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource

class MovieDataSourceFactory(
    private val mutableLiveData: MutableLiveData<MovieDataSource> = MutableLiveData<MovieDataSource>()
) : DataSource.Factory<Long, Movie>() {

    override fun create(): DataSource<Long, Movie> {
        val movieDataSource = MovieDataSource()
        mutableLiveData.postValue(movieDataSource)
        return movieDataSource
    }

    fun getMutableLiveData(): MutableLiveData<MovieDataSource> {
        return mutableLiveData
    }
}
