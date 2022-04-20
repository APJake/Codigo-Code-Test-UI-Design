package com.apjake.codetestuidesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.apjake.codetestuidesign.common.util.show
import com.apjake.codetestuidesign.databinding.SingleBannerItemBinding
import com.apjake.codetestuidesign.model.Travel

class HomeBannerPageAdapter constructor(
    private val context: Context,
    private val items: List<Travel>
): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = SingleBannerItemBinding.inflate(LayoutInflater.from(context), container, false)

        val item = items[position]
        binding.tvName.text = item.name
        binding.tvAddress.text  = item.address
        binding.ivPoster.show(item.poster)

        container.addView(binding.root, position)

        return binding.root
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }
}