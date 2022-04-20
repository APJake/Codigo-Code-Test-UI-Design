package com.apjake.codetestuidesign.adapter.diffutil

import androidx.recyclerview.widget.DiffUtil
import com.apjake.codetestuidesign.model.Travel

object StringDiffUtil: DiffUtil.ItemCallback<String>()  {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}