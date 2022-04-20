package com.apjake.codetestuidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.viewpager.widget.ViewPager
import com.apjake.codetestuidesign.adapter.FragmentPagerAdapter
import com.apjake.codetestuidesign.adapter.HomeBannerAdapter
import com.apjake.codetestuidesign.adapter.HomeBannerPageAdapter
import com.apjake.codetestuidesign.databinding.ActivityMainBinding
import com.apjake.codetestuidesign.fragment.ByRatesFragment
import com.apjake.codetestuidesign.fragment.ByRoomFragment
import com.apjake.codetestuidesign.helper.TravelListGenerator
import com.apjake.codetestuidesign.model.Travel
import com.apjake.codetestuidesign.viewmodel.MainViewModel
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var bannerPageAdapter: HomeBannerPageAdapter
    private lateinit var fragmentPagerAdapter: FragmentPagerAdapter
    private lateinit var travelList: List<Travel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContentView(binding.root)

        init()
        handleListeners()
    }

    private fun init(){
        travelList = TravelListGenerator.generate()
        bannerPageAdapter= HomeBannerPageAdapter(this, travelList)
        binding.vpBanner.adapter = bannerPageAdapter
        binding.vpBanner.setPadding(100, 0, 100, 0)
        binding.tvPageIndicator.text = ("See All 1/${travelList.size}")

        fragmentPagerAdapter = FragmentPagerAdapter(this)
        fragmentPagerAdapter.addFragment("By Room", ByRoomFragment())
        fragmentPagerAdapter.addFragment("By Rates", ByRatesFragment())
        binding.vpTabBody.adapter = fragmentPagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.vpTabBody) { tab, position ->
            tab.text = fragmentPagerAdapter.getTabTitle(position)
        }.attach()
    }

    private fun handleListeners(){

        binding.vpBanner.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                binding.tvPageIndicator.text = ("See All ${position+1}/${travelList.size}")
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
    }
}