package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.FlightEntitie
import com.example.parcial_tp3_ya1.fragments.ExploreFragmentDirections
import com.example.parcial_tp3_ya1.fragments.FlightFragment

class FlightHolder (view: View): RecyclerView.ViewHolder(view) {
    private var view: View

    val idIda = view.findViewById<TextView>(R.id.card_search_txt_origin_code)
    val aeropuertoIda = view.findViewById<TextView>(R.id.card_search_txt_origin_city)
    val idVuelta = view.findViewById<TextView>(R.id.card_search_txt_destination_code)
    val aeropuertoVuelta = view.findViewById<TextView>(R.id.card_search_txt_destination_city)
    val duracion = view.findViewById<TextView>(R.id.card_search_txt_flight_duration)
    val aerolinea = view.findViewById<TextView>(R.id.card_search_txt_airline_name)
    val logo = view.findViewById<ImageView>(R.id.card_search_img_airline_logo)
    val clase = view.findViewById<TextView>(R.id.card_search_class)
    val precio = view.findViewById<TextView>(R.id.card_search_txt_price)
    init {
        this.view = view
    }
    fun render(model: FlightEntitie){
        idIda.text = model.idIda
        aeropuertoIda.text = model.aeropuertoIda
        idVuelta.text = model.idVuelta
        aeropuertoVuelta.text = model.aeropuertoVuelta
        duracion.text = model.duracion
        aerolinea.text = model.aerolinea
        Glide.with(view).load(model.logo).into(logo)
        clase.text = model.clase
        precio.text = model.precio
    }
}