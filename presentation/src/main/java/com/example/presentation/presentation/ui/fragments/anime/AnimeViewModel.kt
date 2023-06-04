package com.example.presentation.presentation.ui.fragments.anime

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.FetchAnimeUseCase
import com.example.domain.utils.Either
import com.example.presentation.presentation.models.DataItemUI
import com.example.presentation.presentation.models.toUI
import com.example.presentation.presentation.state.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : ViewModel() {

    private val _animeState = MutableStateFlow<UIState<List<DataItemUI>>>(UIState.Loading())
    val animeState get() = _animeState.asStateFlow()

    init {
        fetchAnime()
    }

    private fun fetchAnime() {
        viewModelScope.launch {
            fetchAnimeUseCase().collect {
                when (it) {
                    is Either.Left -> {
                        it.message?.let { error ->
                            _animeState.value = UIState.Error(error)
                        }
                    }
                    is Either.Right -> {
                        it.data?.let {
                            _animeState.value = UIState.Success(it.map { anime ->
                                anime.toUI()
                            })
                        }
                    }
                }
            }
        }
    }
}