package com.example.data.repositories

import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.remote.dtos.toDomain
import com.example.domain.base.BaseRepository
import com.example.domain.repositories.AnimeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    override suspend fun fetchAnime() = doRequest {
        animeApiService.fetchAnime().data.map {
            it.toDomain()
        }
    }
}