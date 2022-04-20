package com.apjake.codetestuidesign.adapter

import android.content.Context
import android.view.ViewGroup
import com.apjake.codetestuidesign.adapter.diffutil.StringDiffUtil
import com.apjake.codetestuidesign.adapter.viewholder.ByRoomViewHolder
import com.apjake.codetestuidesign.common.base.BaseListAdapter
import com.apjake.codetestuidesign.databinding.SingleByRoomItemBinding

class ByRoomAdapter constructor(
    private val context: Context
): BaseListAdapter<String, ByRoomViewHolder>(context,StringDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ByRoomViewHolder {
        val binding = SingleByRoomItemBinding.inflate(inflater, parent, false)
        return ByRoomViewHolder(binding)
    }
}