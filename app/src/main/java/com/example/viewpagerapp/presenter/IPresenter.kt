package com.example.viewpagerapp.presenter

import android.os.Bundle

interface IPresenter {
    fun onCreate(savedInstanceState: Bundle?)
    fun onStart()
    fun onResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
}