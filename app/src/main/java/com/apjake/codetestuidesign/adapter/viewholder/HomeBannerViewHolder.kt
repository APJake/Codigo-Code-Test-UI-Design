package com.apjake.codetestuidesign.adapter.viewholder

import com.apjake.codetestuidesign.common.base.BaseViewHolder
import com.apjake.codetestuidesign.common.util.show
import com.apjake.codetestuidesign.databinding.SingleBannerItemBinding
import com.apjake.codetestuidesign.model.Travel

class HomeBannerViewHolder(
    private val binding: SingleBannerItemBinding
): BaseViewHolder<Travel>(binding.root) {
    override fun bind(item: Travel) {
        super.bind(item)
        binding.tvName.text = item.name
        binding.tvAddress.text = item.address
        binding.ivPoster.show(item.poster)
    }
}