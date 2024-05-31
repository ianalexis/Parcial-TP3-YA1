package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.DestinationAdapter
import com.example.parcial_tp3_ya1.providers.DestinationProvider

class DestinationDetail : Fragment() {

    lateinit var vista : View
    lateinit var txtCity : TextView
    lateinit var txtCountry : TextView
    lateinit var txtPrice : TextView
    lateinit var txtCode : TextView
    lateinit var txtDesc : TextView
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
        rvPhotos = vista.findViewById(R.id.fragment_destdetail_rv)

        return vista
    }

    override fun onStart(){
        super.onStart()
        val city = DestinationDetailArgs.fromBundle(requireArguments()).destination.city
        val country = DestinationDetailArgs.fromBundle(requireArguments()).destination.country
        val price = DestinationDetailArgs.fromBundle(requireArguments()).destination.price
        val code = DestinationDetailArgs.fromBundle(requireArguments()).destination.code
        val desc = DestinationDetailArgs.fromBundle(requireArguments()).destination.desc


        txtCity.text = city.toString()
        txtCountry.text = country.toString()
        txtPrice.text = price.toString()
        txtCode.text = code.toString()
        txtDesc.text = desc.toString()

        //val nombre = PerritoDetalleArgs.fromBundle(requireArguments()).Perrito.name
        //title.text = nombre.toString()


        //
        // Al provider del recycler view, hay que pasarle el array de fotos que recibe este fragmento por parametro.
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DestinationDetail().apply {
                arguments = Bundle().apply {

                }
            }
    }
}