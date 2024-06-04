package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R

class PhotoHolder (view : View): RecyclerView.ViewHolder(view){
    private var view: View

    val image = view.findViewById<ImageView>(R.id.card_photo_img)

    init {
        this.view = view
    }
    fun render(model : String){
        Glide.with(view).load(model).into(image)
    }
}