package com.example.sec18_128.data.repository.dataSource

import com.example.sec18_128.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}
