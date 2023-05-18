package com.example.kitsugit.ui.fragments.manga.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.kitsugit.R
import com.example.kitsugit.base.BaseFragment
import com.example.kitsugit.databinding.FragmentDetailMangaBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailMangaFragment : BaseFragment<FragmentDetailMangaBinding, DetailMangaViewModel>
    (R.layout.fragment_detail_manga) {

    override val binding by viewBinding(FragmentDetailMangaBinding::bind)
    override val viewModel: DetailMangaViewModel by viewModels()
    private val args: DetailMangaFragmentArgs by navArgs()

    override fun setupSubscribes() {
        subscribeToFetchDetailAnime()
    }

    private fun subscribeToFetchDetailAnime() {
        viewModel.fetchDetailManga(args.id).subscribe(
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