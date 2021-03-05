package com.example.sec14_102.data

data class ArtistList(
        val page: Int,
        val artists: List<Artist>,
        val total_pages: Int,
        val total_results: Int
)
