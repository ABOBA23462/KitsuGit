package com.example.kitsugit.ui.fragments.anime.detail

import com.example.kitsugit.base.BaseViewModel
import com.example.kitsugit.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailAnimeViewModel @Inject constructor(
    private val animeRepository: AnimeRepository
) : BaseViewModel() {

    fun fetchDetailAnime(id: String) = animeRepository.fetchDetailAnime(id)
}