package com.example.domain.repositories

import com.example.domain.models.DataItem
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    suspend fun fetchAnime(): Flow<Either<String, List<DataItem>>>
}