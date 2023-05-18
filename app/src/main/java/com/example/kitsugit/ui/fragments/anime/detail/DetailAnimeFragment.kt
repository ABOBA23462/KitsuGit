package com.example.kitsugit.ui.fragments.anime.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.kitsugit.R
import com.example.kitsugit.base.BaseFragment
import com.example.kitsugit.databinding.FragmentDetailAnimeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailAnimeFragment : BaseFragment<FragmentDetailAnimeBinding, DetailAnimeViewModel>
    (R.layout.fragment_detail_anime) {

    override val binding by viewBinding(FragmentDetailAnimeBinding::bind)
    override val viewModel: DetailAnimeViewModel by viewModels()
    private val args: DetailAnimeFragmentArgs by navArgs()

    override fun setupSubscribes() {
        subscribeToFetchDetailAnime()
    }

    private fun subscribeToFetchDetailAnime() {
        viewModel.fetchDetailAnime(args.id).subscribe(
            onError = {},
            onSuccess = { it ->
                it.data.let {
                    binding.tvName.text = it.attributes.titles.enJp
                    Glide.with(binding.imgKitsu).load(it.attributes.posterImage.original)
                        .into(binding.imgKitsu)
                }
            }
        )
    }
}