package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.DestinationEntitie
import com.example.parcial_tp3_ya1.holders.DestinationHolder

class DestinationAdapter (var destinationEntitieList: List<DestinationEntitie>) : RecyclerView.Adapter<DestinationHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_destinations, parent, false)
        return DestinationHolder(view)
    }

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {
        val destination = destinationEntitieList[position]
        holder.render(destination)



    }

    override fun getItemCount(): Int {
        return destinationEntitieList.size
    }
}