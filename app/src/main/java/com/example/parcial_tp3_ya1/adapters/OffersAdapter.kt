package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.OffersEntitie
import com.example.parcial_tp3_ya1.holders.OffersHolder

class OffersAdapter(var offersListEntitie: List<OffersEntitie>) : RecyclerView.Adapter<OffersHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffersHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_offers, parent, false)
        return OffersHolder(view)
    }

    override fun onBindViewHolder(holder: OffersHolder, position: Int) {
        val offers = offersListEntitie[position]
        holder.render(offers)
    }

    override fun getItemCount(): Int {
        return offersListEntitie.size
    }
}