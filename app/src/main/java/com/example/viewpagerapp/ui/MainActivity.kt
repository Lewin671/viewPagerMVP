package com.example.viewpagerapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerapp.R
import com.example.viewpagerapp.presenter.IPresenter
import com.example.viewpagerapp.presenter.Presenter

class MainActivity : AppCompatActivity(), IViewPager {
    lateinit var mViewPager: ViewPager2
    lateinit var mPresenter: IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewPager = findViewById(R.id.viewPager2)
        mPresenter = Presenter(this)

        mPresenter.onCreate(savedInstanceState)
    }

    override fun setAdapter(viewPagerAdapter: FragmentStateAdapter) {
        mViewPager.adapter = viewPagerAdapter
    }

    override fun getFragmentActivity(): FragmentActivity {
        return this
    }

    override fun setOrientation(orientation: Int) {
        mViewPager.orientation = orientation
    }

}