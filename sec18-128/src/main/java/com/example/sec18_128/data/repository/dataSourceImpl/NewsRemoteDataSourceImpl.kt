package com.example.sec18_128.data.repository.dataSourceImpl

import com.example.sec18_128.data.api.NewsAPIService
import com.example.sec18_128.data.model.APIResponse
import com.example.sec18_128.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}