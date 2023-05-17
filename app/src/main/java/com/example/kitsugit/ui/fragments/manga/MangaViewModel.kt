package com.example.kitsugit.ui.fragments.manga

import com.example.kitsugit.base.BaseViewModel
import com.example.kitsugit.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepository: MangaRepository
) : BaseViewModel() {

    fun fetchManga() = mangaRepository.fetchManga()
}