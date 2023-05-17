package com.example.kitsugit.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kitsugit.ui.fragments.anime.AnimeFragment
import com.example.kitsugit.ui.fragments.manga.MangaFragment

class ViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: androidx.lifecycle.Lifecycle) :
FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AnimeFragment()
            1 -> MangaFragment()
            else -> MangaFragment()
        }
    }
}