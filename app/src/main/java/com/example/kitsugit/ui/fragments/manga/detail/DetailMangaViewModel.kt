package com.example.kitsugit.ui.fragments.manga.detail

import com.example.kitsugit.base.BaseViewModel
import com.example.kitsugit.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailMangaViewModel  @Inject constructor(
    private val mangaRepository: MangaRepository
) : BaseViewModel() {

    fun fetchDetailManga(id: String) = mangaRepository.fetchDetailManga(id)
}