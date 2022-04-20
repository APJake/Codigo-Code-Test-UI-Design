package com.apjake.codetestuidesign.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentPagerAdapter(activity: FragmentActivity) :
    FragmentStateAdapter(activity) {
    private val fragmentList: MutableList<Fragment> = ArrayList()
    private val titleList: MutableList<String> = ArrayList()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    fun addFragment(title: String,fragment: Fragment) {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    fun getTabTitle(position: Int): String{
        return titleList[position]
    }

}