package com.example.sec14_102.data.repository.tvshow.datasource

import com.example.sec14_102.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows(): Response<TvShowList>
}
