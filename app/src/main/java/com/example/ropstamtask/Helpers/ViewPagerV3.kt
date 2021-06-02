package com.example.ropstamtask.Helpers

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class ViewPagerV3(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {
    private var disable = false

    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {
        return !disable && super.onInterceptTouchEvent(event)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return !disable && super.onTouchEvent(event)
    }

    fun disablescroll(disable: Boolean) {
        //When disable = true not work the scroll and when disble = false work the scroll
        this.disable = disable
    }
}