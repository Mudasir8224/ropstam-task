package com.example.ropstamtask

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TrendingProductsAdapter(val context: Context) : RecyclerView.Adapter<TrendingProductsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingProductsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.trending_products_rv, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrendingProductsAdapter.ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            val intent = Intent(context,ProductDetailActivity::class.java)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return 6
    }

}