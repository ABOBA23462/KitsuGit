package com.example.presentation.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel>(
    @LayoutRes layoutId: Int
) : Fragment(layoutId) {

    abstract val binding: VB
    abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        setupRequests()
        setupSubscribes()
    }

    protected open fun initialize() {}

    protected open fun setupListener() {}

    protected open fun setupRequests() {}

    protected open fun setupSubscribes() {}
}