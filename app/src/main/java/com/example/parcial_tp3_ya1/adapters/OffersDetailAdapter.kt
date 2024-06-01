package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.OffersEntitie
import com.example.parcial_tp3_ya1.holders.OffersDetailHolder


 class OffersDetailAdapter(var offersListEntitie: List<OffersEntitie>) : RecyclerView.Adapter<OffersDetailHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffersDetailHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.card_detail_offers, parent, false)
            return OffersDetailHolder(view)
        }

     override fun onBindViewHolder(holder: OffersDetailHolder, position: Int) {
         val offers = offersListEntitie[position]
         holder.render(offers)
     }

           override fun getItemCount(): Int {
            return offersListEntitie.size
        }
    }