package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.FlightEntitie
import com.example.parcial_tp3_ya1.holders.FlightHolder

class FlightAdapter(private var flightsList: List<FlightEntitie>) : RecyclerView.Adapter<FlightHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_search_results, parent, false)
        return FlightHolder(view)
    }

    override fun onBindViewHolder(holder: FlightHolder, position: Int) {
        val flight = flightsList[position]
        holder.render(flight)
    }

    override fun getItemCount(): Int {
        return flightsList.size
    }
}