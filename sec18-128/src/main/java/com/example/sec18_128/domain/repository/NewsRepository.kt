package com.example.sec18_128.domain.repository

import com.example.sec18_128.data.model.APIResponse
import com.example.sec18_128.data.model.Article
import com.example.sec18_128.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}
