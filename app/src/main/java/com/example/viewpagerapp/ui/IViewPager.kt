package com.example.viewpagerapp.ui

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

interface IViewPager {
    fun setAdapter(viewPagerAdapter: FragmentStateAdapter)
    fun getFragmentActivity(): FragmentActivity
    fun setOrientation(orientation:Int)
}