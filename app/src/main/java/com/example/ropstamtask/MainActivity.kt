package com.example.ropstamtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.ropstamtask.Helpers.ViewPagerFragmentManager
import com.example.ropstamtask.Helpers.ViewPagerV3

class MainActivity : AppCompatActivity() {
    var viewPager: ViewPagerV3? = null
    var viewPagerFragmentManager: ViewPagerFragmentManager? = null
    var homeLayout: LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setupFragment()
        clickEvent()
    }


    private fun initViews() {
        viewPager = findViewById(R.id.viewPager)
        homeLayout = findViewById(R.id.homeLayout)
    }

    private fun setupFragment() {
        viewPagerFragmentManager = ViewPagerFragmentManager(supportFragmentManager)
        viewPagerFragmentManager!!.addFragments(HomeFragment())
        viewPager!!.adapter = viewPagerFragmentManager
        viewPager!!.disablescroll(true)
    }

    private fun clickEvent() {
        homeLayout!!.setOnClickListener { viewPager!!.setCurrentItem(0, true) }

    }


}