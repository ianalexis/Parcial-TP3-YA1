package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.holders.Destination_holder
import com.example.parcial_tp3_ya1.providers.Destination_Provider

class Destination_adapter (var destinationList: List<Destination>) : RecyclerView.Adapter<Destination_holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Destination_holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_destinations, parent, false)
        return Destination_holder(view)
    }

    override fun onBindViewHolder(holder: Destination_holder, position: Int) {
        val destination = destinationList[position]
        holder.setCity(destination.city)
        holder.setCountry(destination.country)
        holder.setCode(destination.code)
        holder.setImagen(destination.image)
    }

    override fun getItemCount(): Int {
        return destinationList.size
    }

    class Destination
}