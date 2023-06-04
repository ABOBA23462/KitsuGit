package com.example.domain.usecases

import com.example.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {

    suspend operator fun invoke() = mangaRepository.fetchManga()
}