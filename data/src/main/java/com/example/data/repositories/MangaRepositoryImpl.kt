package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.remote.apiservice.MangaApiService
import com.example.data.remote.dtos.toDomain
import com.example.domain.repositories.MangaRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    override fun fetchManga() = doRequest {
        mangaApiService.fetchManga().data.map {
            it.toDomain()
        }
    }
}