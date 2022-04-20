package com.apjake.codetestuidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.viewpager.widget.ViewPager
import com.apjake.codetestuidesign.adapter.HomeBannerAdapter
import com.apjake.codetestuidesign.adapter.HomeBannerPageAdapter
import com.apjake.codetestuidesign.databinding.ActivityMainBinding
import com.apjake.codetestuidesign.helper.TravelListGenerator
import com.apjake.codetestuidesign.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var bannerPageAdapter: HomeBannerPageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContentView(binding.root)

        val itemList = TravelListGenerator.generate()

        bannerPageAdapter= HomeBannerPageAdapter(this, itemList)

        binding.vpBanner.adapter = bannerPageAdapter
        binding.vpBanner.setPadding(100, 0, 100, 0)

        binding.tvPageIndicator.text = ("See All 1/${itemList.size}")

        binding.vpBanner.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                binding.tvPageIndicator.text = ("See All ${position+1}/${itemList.size}")
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
    }
    fun test(view: android.view.View) {
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()

    }
}