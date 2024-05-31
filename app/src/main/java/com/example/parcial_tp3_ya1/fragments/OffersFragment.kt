package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.OffersDetailAdapter
import com.example.parcial_tp3_ya1.providers.OffersProvider

class OffersFragment : Fragment() {

    lateinit var view1 : View
    lateinit var rvOffers: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        this.view1 = inflater.inflate(R.layout.fragment_offers, container, false)
        this.rvOffers = view1.findViewById(R.id.offers_rv)
        return this.view1
    }

    override fun onStart(){
        super.onStart()

        //offers
        rvOffers.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(context)
        rvOffers.layoutManager = linearLayoutManager

        val offersDetailAdapter = OffersDetailAdapter(OffersProvider.offersEntitieLists)
        rvOffers.adapter = offersDetailAdapter

    }

    companion object {

    }
}