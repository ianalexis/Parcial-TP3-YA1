package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R

class Destination_holder (view: View): RecyclerView.ViewHolder(view) {
    private var view: View
   // val button: Button = view.findViewById(R.id.item_perrito_cell_button)

    init {
        this.view = view
    }

    fun setCity (city: String) {
        val textView = view.findViewById<TextView>(R.id.card_dest_city)
        textView.text = city
    }

    fun setCountry (country: String) {
        val textView = view.findViewById<TextView>(R.id.card_dest_country)
        textView.text = country
    }

    fun setImagen (imagen: String) {
        val imageView = view.findViewById<ImageView>(R.id.card_dest_image)
        Glide.with(view).load(imagen).into(imageView)
    }
    fun setCode (code: String) {
        val textView = view.findViewById<TextView>(R.id.card_dest_code)
        textView.text = code
    }


    /*fun getCardDestination(): View {
        return view.findViewById(R.id.cardItemPerritoCell)
    }*/
}