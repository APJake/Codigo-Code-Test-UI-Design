package com.apjake.codetestuidesign.adapter.viewholder

import com.apjake.codetestuidesign.common.base.BaseViewHolder
import com.apjake.codetestuidesign.databinding.SingleByRoomItemBinding

class ByRoomViewHolder constructor(
    private val binding: SingleByRoomItemBinding
): BaseViewHolder<String>(binding.root) {
    override fun bind(item: String) {
        super.bind(item)
        binding.tvTitle.text = item
    }
}