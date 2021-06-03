package com.example.ropstamtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductDetailActivity : AppCompatActivity() {
    var imageView:ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        initView()
        clickEvents()
    }

    private fun initView() {
        imageView = findViewById(R.id.imageView)
    }

    private fun clickEvents() {
    imageView?.setOnClickListener {
        finish()
    }
    }



}