package com.example.sec18_128.domain.usecase

import com.example.sec18_128.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String) = newsRepository.getSearchedNews(searchQuery)
}
