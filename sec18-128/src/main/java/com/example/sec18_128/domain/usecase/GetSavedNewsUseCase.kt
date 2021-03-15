package com.example.sec18_128.domain.usecase

import com.example.sec18_128.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute() = newsRepository.getSavedNews()
}
