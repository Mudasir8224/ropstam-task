package com.example.ropstamtask

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    private var spinner:Spinner? = null
    private var recyclerView:RecyclerView? = null
    private var recyclerViewSecond:RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_home, container, false)
        spinner = view.findViewById(R.id.spinner)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerViewSecond = view.findViewById(R.id.recyclerViewSecond)
        setSpinner()
        setRecyclerView()
        setRecyclerViewSecond()
        return view
    }

    private fun setSpinner() {
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.category_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner?.adapter = adapter
        }

        // spinner on item selected listener
        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == spinner?.selectedItemPosition){
                    (parent.getChildAt(0) as? TextView)?.setTextColor(Color.WHITE)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

    private fun setRecyclerView(){
        val mLayoutManager = LinearLayoutManager(context)
        mLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView?.layoutManager = mLayoutManager
        val adapter = TrendingProductsAdapter(requireContext())
        recyclerView?.adapter = adapter
    }

    private fun setRecyclerViewSecond(){
        val mLayoutManager = LinearLayoutManager(context)
        mLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerViewSecond?.layoutManager = mLayoutManager
        val adapter = TrendingProductsAdapter(requireContext())
        recyclerViewSecond?.adapter = adapter
    }


}