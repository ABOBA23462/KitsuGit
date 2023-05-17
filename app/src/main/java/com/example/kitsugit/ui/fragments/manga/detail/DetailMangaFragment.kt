package com.example.kitsugit.ui.fragments.manga.detail

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsugit.R
import com.example.kitsugit.base.BaseFragment
import com.example.kitsugit.databinding.FragmentDetailMangaBinding

class DetailMangaFragment : BaseFragment<FragmentDetailMangaBinding, DetailMangaViewModel>
    (R.layout.fragment_detail_manga) {

    override val binding by viewBinding(FragmentDetailMangaBinding::bind)
    override val viewModel: DetailMangaViewModel by viewModels()
}