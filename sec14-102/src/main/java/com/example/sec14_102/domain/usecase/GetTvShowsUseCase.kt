package com.example.sec14_102.domain.usecase

import com.example.sec14_102.data.model.tvshow.TvShow
import com.example.sec14_102.domain.repository.TvShowRepository

class GetTvShowsUseCase(val repository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = repository.getTvShows()
}
