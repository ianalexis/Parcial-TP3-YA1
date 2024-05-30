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


class Explore : Fragment() {

    lateinit var view : View
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
        this.view = inflater.inflate(R.layout.fragment_explore, container, false)
        this.rvDestinations = view.findViewById(R.id.explore_rv_destinations)
        this.rvOffers = view.findViewById(R.id.explore_rv_offers)
        this.button = view.findViewById(R.id.explore_button)

        return this.view
    }

    override fun onStart(){
        super.onStart()
        rvDestinations.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

    }

    companion object {

    }
}