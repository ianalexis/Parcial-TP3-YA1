package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.DestinationEntitie
import com.example.parcial_tp3_ya1.fragments.ExploreFragmentDirections

class MainDestinationHolder (view:View):RecyclerView.ViewHolder(view) {
    private var view: View
    val city = view.findViewById<TextView>(R.id.card_maindest_city)
    val image = view.findViewById<ImageView>(R.id.card_maindest_image)
    val price = view.findViewById<TextView>(R.id.card_maindest_price)
    private val favorite: ImageView = view.findViewById(R.id.card_maindest_favorite)

    init {
        this.view = view
        favorite.setOnClickListener {
            toggleHeart(it)
        }
    }

    fun render(model : DestinationEntitie){
        city.text = model.city
        Glide.with(view).load(model.image).into(image)
        price.text = model.price

        this.view.setOnClickListener {
            val action = ExploreFragmentDirections.actionExploreToDestinationDetail(model)
            view.findNavController().navigate(action)
        }
    }

    fun toggleHeart(view: View) {
        val favorite = view as ImageView
        val tag = favorite.tag
        if (tag == null || tag == R.drawable.card_detail_heart_empty_white) {
            favorite.setImageResource(R.drawable.card_detail_heart_white)
            favorite.tag = R.drawable.card_detail_heart
        } else {
            favorite.setImageResource(R.drawable.card_detail_heart_empty_white)
            favorite.tag = R.drawable.card_detail_heart_empty
        }
    }
}