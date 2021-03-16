package com.example.sec18_128.domain.usecase

import com.example.sec18_128.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int) = newsRepository.getNewsHeadlines(country, page)
}
