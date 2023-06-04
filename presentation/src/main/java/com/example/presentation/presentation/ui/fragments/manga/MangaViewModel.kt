package com.example.presentation.presentation.ui.fragments.manga

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.FetchMangaUseCase
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
class MangaViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase
) : ViewModel() {

    private val _mangaState = MutableStateFlow<UIState<List<DataItemUI>>>(UIState.Loading())
    val mangaState get() = _mangaState.asStateFlow()

    init {
        fetchManga()
    }

    private fun fetchManga() {
        viewModelScope.launch {
            fetchMangaUseCase().collect {
                when (it) {
                    is Either.Left -> {
                        it.message?.let { error ->
                            _mangaState.value = UIState.Error(error)
                        }
                    }
                    is Either.Right -> {
                        it.data?.let {
                            _mangaState.value = UIState.Success(it.map { manga ->
                                manga.toUI()
                            })
                        }
                    }
                }
            }
        }
    }
}