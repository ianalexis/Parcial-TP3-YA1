package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.DestinationEntitie
import com.example.parcial_tp3_ya1.fragments.ExploreFragmentDirections

class DestinationHolder (view: View): RecyclerView.ViewHolder(view) {
    private var view: View


    var boton = view.findViewById<Button>(R.id.card_dest_btn)


    val country = view.findViewById<TextView>(R.id.card_dest_country)
    val city = view.findViewById<TextView>(R.id.card_dest_city)
    val image = view.findViewById<ImageView>(R.id.card_dest_image)
    val code = view.findViewById<TextView>(R.id.card_dest_code)

    init {
        this.view = view
    }
    fun render(model : DestinationEntitie){
        country.text = model.country
        city.text = model.city
        code.text = model.code
        Glide.with(view).load(model.image).into(image)

        boton.setOnClickListener {
            val action = ExploreFragmentDirections.actionExploreToDestinationDetail(model)
            view.findNavController().navigate(action)
        }
    }
}