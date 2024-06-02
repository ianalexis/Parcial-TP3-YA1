package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.OffersEntitie

class OffersDetailHolder (view: View): RecyclerView.ViewHolder(view){
    private var view: View

    val image = view.findViewById<ImageView>(R.id.card_detail_offers_image)
    val title = view.findViewById<TextView>(R.id.card_detail_offers_title)
    val desc = view.findViewById<TextView>(R.id.card_detail_offers_desc)

    init {
        this.view = view
    }
    fun render(model : OffersEntitie){
        Glide.with(view).load(model.image).into(image)
        title.text = model.longtitle
        desc.text = model.logndesc
    }
}