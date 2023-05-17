package com.example.kitsugit.ui.fragments.anime

import com.example.kitsugit.base.BaseViewModel
import com.example.kitsugit.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepository: AnimeRepository
) : BaseViewModel() {

    fun fetchAnime() = animeRepository.fetchAnime()
}