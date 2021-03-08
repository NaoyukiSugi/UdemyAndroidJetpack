package com.example.sec14_102.data.repository.tvshow.datasourceImpl

import com.example.sec14_102.data.api.TMDBService
import com.example.sec14_102.data.model.tvshow.TvShowList
import com.example.sec14_102.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

