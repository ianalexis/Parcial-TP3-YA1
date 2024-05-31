package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.DestinationEntitie

class MainDestinationHolder (view:View):RecyclerView.ViewHolder(view) {
    private var view: View
    // val button: Button = view.findViewById(R.id.item_perrito_cell_button)

    val city = view.findViewById<TextView>(R.id.card_maindest_city)
    val image = view.findViewById<ImageView>(R.id.card_maindest_image)
    val price = view.findViewById<TextView>(R.id.card_maindest_price)
    init {
        this.view = view
    }
    fun render(model : DestinationEntitie){
        city.text = model.city
        Glide.with(view).load(model.image).into(image)
        price.text = model.price
    }
}