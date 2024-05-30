package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.Destination_adapter
import com.example.parcial_tp3_ya1.holders.Destination_holder
import com.example.parcial_tp3_ya1.providers.Destination_Provider


class Explore : Fragment() {

    lateinit var view1 : View
    lateinit var rvDestinations : RecyclerView
    lateinit var rvOffers: RecyclerView
    lateinit var button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        this.view1 = inflater.inflate(R.layout.fragment_explore, container, false)
        this.rvDestinations = view1.findViewById(R.id.explore_rv_destinations)
        this.rvOffers = view1.findViewById(R.id.explore_rv_offers)
        this.button = view1.findViewById(R.id.explore_button)

        return this.view1
    }

    override fun onStart(){
        super.onStart()
        rvDestinations.setHasFixedSize(true)

       val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvDestinations.layoutManager = linearLayoutManager
        
        val destination_adapter = Destination_adapter(Destination_Provider.destinationList)
        rvDestinations.adapter = destination_adapter

    }

    companion object {

    }
}