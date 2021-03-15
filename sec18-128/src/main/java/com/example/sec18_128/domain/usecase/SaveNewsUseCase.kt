package com.example.sec18_128.domain.usecase

import com.example.sec18_128.data.model.Article
import com.example.sec18_128.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}
