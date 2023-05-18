package com.example.kitsugit.data.repositories

import com.example.kitsugit.base.BaseRepository
import com.example.kitsugit.data.remote.apiservice.MangaApiService
import javax.inject.Inject

class MangaRepository  @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository() {

    fun fetchManga() = doRequest {
        mangaApiService.fetchManga()
    }

    fun fetchDetailManga(id: String) = doRequest {
        mangaApiService.fetchDetailManga(id)
    }
}