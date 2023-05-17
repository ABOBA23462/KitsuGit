package com.example.kitsugit.data.repositories

import com.example.kitsugit.base.BaseRepository
import com.example.kitsugit.data.remote.apiservice.AnimeApiService
import javax.inject.Inject

class AnimeRepository @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository() {

    fun fetchAnime() = doRequest {
        animeApiService.fetchAnime()
    }

    fun fetchDetailAnime(id: String) = doRequest {
        animeApiService.fetchDetailAnime(id)
    }
}