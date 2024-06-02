package com.example.parcial_tp3_ya1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.holders.PhotoHolder

class DestinationPhotoAdapter  (var photoList: Array<String>?) : RecyclerView.Adapter<PhotoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_photo, parent, false)
        return PhotoHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val photo = photoList?.get(position)
        holder.render(photo!!)
    }

    override fun getItemCount(): Int {
        return photoList!!.size
    }
}