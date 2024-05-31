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
import com.example.parcial_tp3_ya1.adapters.DestinationAdapter
import com.example.parcial_tp3_ya1.providers.DestinationProvider
import com.example.parcial_tp3_ya1.providers.MainDestinationProvider


class ExploreFragment : Fragment() {

    lateinit var view1 : View
    lateinit var rvDestinations : RecyclerView
    lateinit var rvOffers: RecyclerView
    lateinit var rvMainDestinations: RecyclerView
    lateinit var button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        this.view1 = inflater.inflate(R.layout.fragment_explore, container, false)
        this.rvDestinations = view1.findViewById(R.id.explore_rv_offers)
        this.rvOffers = view1.findViewById(R.id.explore_rv_destinations)
        this.rvMainDestinations = view1.findViewById(R.id.explore_rv_maindestinations)
        this.button = view1.findViewById(R.id.explore_button)

        return this.view1
    }

    override fun onStart(){
        super.onStart()
        rvDestinations.setHasFixedSize(true)

       val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvDestinations.layoutManager = linearLayoutManager
        
        val destinationAdapter = DestinationAdapter(DestinationProvider.destinationEntitieLists)
        rvDestinations.adapter = destinationAdapter

        val mainDestinationAdapter = DestinationAdapter(MainDestinationProvider.mainDestinationListEntities)
        rvMainDestinations.adapter = mainDestinationAdapter

    }

    companion object {

    }
}