package com.apjake.codetestuidesign.adapter

import android.content.Context
import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.apjake.codetestuidesign.adapter.diffutil.TravelDiffUtil
import com.apjake.codetestuidesign.adapter.viewholder.HomeBannerViewHolder
import com.apjake.codetestuidesign.common.base.BaseListAdapter
import com.apjake.codetestuidesign.databinding.SingleBannerItemBinding
import com.apjake.codetestuidesign.model.Travel

class HomeBannerAdapter constructor(
    private val context: Context
): BaseListAdapter<Travel, HomeBannerViewHolder>(context, TravelDiffUtil){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBannerViewHolder {
        val binding = SingleBannerItemBinding.inflate(inflater, parent, false)
        return HomeBannerViewHolder(binding)
    }
}