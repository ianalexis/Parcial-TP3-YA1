package com.example.parcial_tp3_ya1.holders

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.entities.Destination
import org.w3c.dom.Text

class Destination_holder (view: View): RecyclerView.ViewHolder(view) {
    private var view: View
   // val button: Button = view.findViewById(R.id.item_perrito_cell_button)

    val country = view.findViewById<TextView>(R.id.card_dest_country)
    val city = view.findViewById<TextView>(R.id.card_dest_city)
    val image = view.findViewById<ImageView>(R.id.card_dest_image)
    val code = view.findViewById<TextView>(R.id.card_dest_code)

    init {
        this.view = view
    }
    fun render(model : Destination){
        country.text = model.country
        city.text = model.city
        code.text = model.code

        // Cargar imagen
        Glide.with(image.context).load(model.image).into(image)
    }


    /*   fun setCity (city: String) {
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


       fun getCardDestination(): View {
           return view.findViewById(R.id.cardItemPerritoCell)
       }*/
}