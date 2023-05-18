package com.example.kitsugit.ui.fragments.anime

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsugit.R
import com.example.kitsugit.base.BaseFragment
import com.example.kitsugit.databinding.FragmentAnimeBinding
import com.example.kitsugit.ui.adapters.AnimeAdapter
import com.example.kitsugit.ui.fragments.home.HomeFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {

    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter(this::onItemClick)

    override fun initialize() {
        binding.animeRecView.adapter = animeAdapter
    }

    override fun setupSubscribes() {
        subscribeToFetchAnime()
    }

    private fun subscribeToFetchAnime() {
        lifecycleScope.launch {
            viewModel.fetchAnime().collect {
                animeAdapter.submitList(it.data?.data)
            }
        }
    }

    private fun onItemClick(id: String) {
        findNavController().navigate(
            HomeFragmentDirections.actionHomeFragmentToDetailAnimeFragment(id)
        )
    }
}