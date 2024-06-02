package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.DestinationPhotoAdapter
import com.example.parcial_tp3_ya1.adapters.FlightAdapter

class DestinationDetailFragment : Fragment() {

    lateinit var vista : View
    lateinit var txtCity : TextView
    lateinit var txtCountry : TextView
    lateinit var txtPrice : TextView
    lateinit var txtCode : TextView
    lateinit var txtDesc : TextView
    lateinit var imgImagen : ImageView
    lateinit var rvPhotos : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        vista = inflater.inflate(R.layout.fragment_destination_detail, container, false)
        txtCity = vista.findViewById(R.id.fragment_destdetail_txtCity)
        txtCountry = vista.findViewById(R.id.fragment_destdetail_txtCountry)
        txtPrice = vista.findViewById(R.id.fragment_destdetail_txtPrice)
        txtCode = vista.findViewById(R.id.fragment_destdetail_txtCode)
        txtDesc = vista.findViewById(R.id.fragment_destdetail_txtDesc)
        imgImagen = vista.findViewById(R.id.fragment_destdetail_img)
        rvPhotos = vista.findViewById(R.id.fragment_destdetail_rv)


        return vista
    }

    override fun onStart(){
        super.onStart()
        val destination = DestinationDetailFragmentArgs.fromBundle(requireArguments()).destination

        txtCity.text = destination.city
        txtCountry.text = destination.country
        txtPrice.text = destination.price
        txtCode.text = destination.code
        txtDesc.text = destination.desc
        Glide.with(vista).load(destination.image).into(imgImagen)

        rvPhotos.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvPhotos.layoutManager = linearLayoutManager

        val photosAdapter = DestinationPhotoAdapter(destination.photos)
        rvPhotos.adapter = photosAdapter

        // Al provider del recycler view, hay que pasarle el array de fotos que recibe este fragmento por parametro.
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DestinationDetailFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}