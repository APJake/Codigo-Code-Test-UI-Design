package com.apjake.codetestuidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearSnapHelper
import com.apjake.codetestuidesign.adapter.HomeBannerAdapter
import com.apjake.codetestuidesign.databinding.ActivityMainBinding
import com.apjake.codetestuidesign.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var bannerAdapter: HomeBannerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContentView(binding.root)

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(binding.rcyBanner)
        bannerAdapter = HomeBannerAdapter(this)
        binding.rcyBanner.adapter = bannerAdapter

        viewModel.travelList.observe(this){
            if(it.isNotEmpty()){
                bannerAdapter.setNewDataList(it)
            }
        }
    }
}