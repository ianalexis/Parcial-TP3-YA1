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
    private val heart: ImageView = view.findViewById(R.id.card_offers_heart)

    init {
        this.view = view
        heart.setOnClickListener {
            toggleHeart(it)
        }
    }

    fun render(model : OffersEntitie){
        Glide.with(view).load(model.image).into(image)
        title.text = model.longtitle
        desc.text = model.logndesc
    }

    fun toggleHeart(view: View) {
        val heart = view as ImageView
        val tag = heart.tag
        if (tag == null || tag == R.drawable.card_detail_heart_empty) {
            heart.setImageResource(R.drawable.card_detail_heart)
            heart.tag = R.drawable.card_detail_heart
        } else {
            heart.setImageResource(R.drawable.card_detail_heart_empty)
            heart.tag = R.drawable.card_detail_heart_empty
        }
    }
}