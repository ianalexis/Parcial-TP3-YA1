package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.DestinationAdapter
import com.example.parcial_tp3_ya1.adapters.MainDestinationAdapter
import com.example.parcial_tp3_ya1.adapters.OffersAdapter
import com.example.parcial_tp3_ya1.providers.DestinationProvider
import com.example.parcial_tp3_ya1.providers.MainDestinationProvider
import com.example.parcial_tp3_ya1.providers.OffersProvider


class ExploreFragment : Fragment() {

    lateinit var view1 : View
    lateinit var rvDestinations : RecyclerView
    lateinit var rvOffers: RecyclerView
    lateinit var rvMainDestinations: RecyclerView
    lateinit var button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        this.view1 = inflater.inflate(R.layout.fragment_explore, container, false)
        this.rvDestinations = view1.findViewById(R.id.explore_rv_destinations)
        this.rvOffers = view1.findViewById(R.id.explore_rv_offers)
        this.rvMainDestinations = view1.findViewById(R.id.explore_rv_maindestinations)
        this.button = view1.findViewById(R.id.flight_button)
        val flightButton: Button = view1.findViewById(R.id.flight_button)
        flightButton.setOnClickListener {
            findNavController().navigate(R.id.action_explore_to_flightFragment)
        }

        return this.view1
    }

    override fun onStart(){
        super.onStart()

        // destinations
        rvDestinations.setHasFixedSize(true)

       val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvDestinations.layoutManager = linearLayoutManager
        
        val destinationAdapter = DestinationAdapter(DestinationProvider.destinationEntitieLists)
        rvDestinations.adapter = destinationAdapter

        //main destinations
        rvMainDestinations.setHasFixedSize(true)

        val linearLayoutManager2 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvMainDestinations.layoutManager = linearLayoutManager2

        val mainDestinationAdapter = MainDestinationAdapter(MainDestinationProvider.mainDestinationListEntities)
        rvMainDestinations.adapter = mainDestinationAdapter

        //offers
        rvOffers.setHasFixedSize(true)

        val linearLayoutManager3 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvOffers.layoutManager = linearLayoutManager3

        val offersAdapter = OffersAdapter(OffersProvider.offersEntitieLists)
        rvOffers.adapter = offersAdapter

    }


    companion object {

    }
}