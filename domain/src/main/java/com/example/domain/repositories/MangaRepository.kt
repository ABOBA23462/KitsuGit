package com.example.domain.repositories

import com.example.domain.models.DataItem
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

interface MangaRepository {

    suspend fun fetchManga(): Flow<Either<String, List<DataItem>>>
}