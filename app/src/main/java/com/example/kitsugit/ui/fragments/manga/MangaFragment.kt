package com.example.kitsugit.ui.fragments.manga

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsugit.R
import com.example.kitsugit.base.BaseFragment
import com.example.kitsugit.databinding.FragmentMangaBinding
import com.example.kitsugit.ui.adapters.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {

    private val mangaAdapter = MangaAdapter()
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()

    override fun initialize() {
        binding.mangaRecView.adapter = mangaAdapter
    }

    override fun setupSubscribes() {
        subscribeToFetchManga()
    }

    private fun subscribeToFetchManga() {
        lifecycleScope.launch {
            viewModel.fetchManga().collect {
                mangaAdapter.submitList(it.data?.data)
            }
        }
    }
}