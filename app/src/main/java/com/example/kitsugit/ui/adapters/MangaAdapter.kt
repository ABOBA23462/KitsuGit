package com.example.kitsugit.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsugit.base.BaseDiffUtilItemCallback
import com.example.kitsugit.databinding.ItemKitsuBinding
import com.example.kitsugit.models.DataItem

class MangaAdapter: ListAdapter<DataItem, MangaAdapter.MangaViewHolder>(
    BaseDiffUtilItemCallback()
) {

    inner class MangaViewHolder(private val binding: ItemKitsuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(dataItem: DataItem) {
            binding.tvKitsu.text = dataItem.attributes.titles.enJp
            Glide.with(binding.imageKitsu).load(dataItem.attributes.posterImage.original)
                .into(binding.imageKitsu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            ItemKitsuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }
}