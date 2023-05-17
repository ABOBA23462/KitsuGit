package com.example.kitsugit.ui.fragments.anime.detail

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsugit.R
import com.example.kitsugit.base.BaseFragment
import com.example.kitsugit.databinding.FragmentDetailAnimeBinding

class DetailAnimeFragment : BaseFragment<FragmentDetailAnimeBinding, DetailAnimeViewModel>
    (R.layout.fragment_detail_anime) {

    override val binding by viewBinding(FragmentDetailAnimeBinding::bind)
    override val viewModel: DetailAnimeViewModel by viewModels()
}