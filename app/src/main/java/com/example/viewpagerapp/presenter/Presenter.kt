package com.example.viewpagerapp.presenter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerapp.model.Crime
import com.example.viewpagerapp.ui.CrimeFragment
import com.example.viewpagerapp.ui.IViewPager
import java.util.*
import kotlin.collections.ArrayList

class Presenter(val viewPager: IViewPager) : IPresenter {
    private val crimeList = ArrayList<Crime>()

    override fun onCreate(savedInstanceState: Bundle?) {

        crimeList.add(Crime("crime1", 1, Date(), false))
        crimeList.add(Crime("crime2", 2, Date(), true))
        crimeList.add(Crime("crime3", 3, Date(), true))

        viewPager.setAdapter(object : FragmentStateAdapter(viewPager.getFragmentActivity()) {
            override fun getItemCount(): Int {
                return crimeList.size
            }

            override fun createFragment(position: Int): Fragment {
                var crimeInfo = "there is something wrong"
                if (position < crimeList.size) {
                    val aCrime = crimeList[position];
                    crimeInfo = aCrime.toString()
                }

                return CrimeFragment.newInstance(crimeInfo)
            }
        })

        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL)
    }

    override fun onStart() {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    override fun onDestroy() {
    }

}