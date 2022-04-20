package com.apjake.codetestuidesign.adapter.diffutil

import androidx.recyclerview.widget.DiffUtil
import com.apjake.codetestuidesign.model.Travel

object TravelDiffUtil : DiffUtil.ItemCallback<Travel>() {
    override fun areItemsTheSame(oldItem: Travel, newItem: Travel): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Travel, newItem: Travel): Boolean {
        return oldItem == newItem
    }
}