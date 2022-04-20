package com.apjake.codetestuidesign.adapter

import android.content.Context
import android.view.ViewGroup
import com.apjake.codetestuidesign.adapter.diffutil.StringDiffUtil
import com.apjake.codetestuidesign.adapter.viewholder.ByRatesViewHolder
import com.apjake.codetestuidesign.common.base.BaseListAdapter
import com.apjake.codetestuidesign.databinding.SingleByRatesItemBinding
import com.apjake.codetestuidesign.databinding.SingleByRoomItemBinding

class ByRatesAdapter constructor(
    private val context: Context
): BaseListAdapter<String, ByRatesViewHolder>(context, StringDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ByRatesViewHolder {
        val binding = SingleByRatesItemBinding.inflate(inflater, parent, false)
        return ByRatesViewHolder(binding)
    }
}