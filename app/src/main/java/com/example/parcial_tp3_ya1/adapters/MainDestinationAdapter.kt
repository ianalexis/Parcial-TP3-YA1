package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.DestinationEntitie
import com.example.parcial_tp3_ya1.holders.DestinationHolder
import com.example.parcial_tp3_ya1.holders.MainDestinationHolder

class MainDestinationAdapter(var mainDestinationListEntitie: List<DestinationEntitie>) : RecyclerView.Adapter<MainDestinationHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainDestinationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_maindestinations, parent, false)
        return MainDestinationHolder(view)
    }

    override fun onBindViewHolder(holder: MainDestinationHolder, position: Int) {
        val destination = mainDestinationListEntitie[position]
        holder.render(destination)
    }

    override fun getItemCount(): Int {
        return mainDestinationListEntitie.size
    }
}