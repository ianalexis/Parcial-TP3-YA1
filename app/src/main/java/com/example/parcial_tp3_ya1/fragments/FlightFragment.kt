package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.FlightAdapter
import com.example.parcial_tp3_ya1.entities.FlightEntitie
import com.example.parcial_tp3_ya1.service.FlightServiceApiBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FlightFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FlightFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    // SEVICIO DE VUELOS
    // val listaVuelos = FlightServiceImpl.getFlights()

    lateinit var vista : View
    lateinit var flightRv : RecyclerView
    lateinit var txtResultsFound : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.vista = inflater.inflate(R.layout.fragment_flight, container, false)
        this.flightRv = vista.findViewById(R.id.fragment_flight_rv)
        this.txtResultsFound = vista.findViewById((R.id.fragment_flight_txtResult))


        return vista
    }

    override fun onStart(){
        super.onStart()
        //flights
        lifecycleScope.launch {
            loadVuelos()

            flightRv.setHasFixedSize(true)

            val linearLayoutManager = LinearLayoutManager(context)
            flightRv.layoutManager = linearLayoutManager

            val FlightAdapter = FlightAdapter(loadVuelos())
            flightRv.adapter = FlightAdapter
        }


    }

    private suspend fun loadVuelos(): List<FlightEntitie> {
        val service = FlightServiceApiBuilder.create()
        val listaVuelos = arrayListOf<FlightEntitie>()

        try {
            val response = withContext(Dispatchers.IO) { service.getFlights() }
            if (response.isSuccessful) {
                val flightResponse = response.body()
                val totalSize = flightResponse?.best_flights!!.size + flightResponse.other_flights!!.size
                txtResultsFound.text = "$totalSize result founds"

                for (vuelo in flightResponse.best_flights){
                    var salida = vuelo.flights?.get(0)?.departure_airport
                    var llegada = vuelo.flights?.last()?.arrival_airport
                    val hours = vuelo.total_duration?.div(60)?.toInt()
                    val minutes = hours?.rem(60)
                    var tiempo = "$hours hr $minutes min"
                    listaVuelos.add(FlightEntitie(salida?.id, salida?.name, llegada?.id, llegada?.name, tiempo, vuelo.flights?.get(0)?.airline + " Airlines", vuelo.airline_logo, vuelo.flights?.get(0)?.travel_class + " class", vuelo.price.toString()))                }

                for (vuelo in flightResponse.other_flights){
                    var salida = vuelo.flights?.get(0)?.departure_airport
                    var llegada = vuelo.flights?.last()?.arrival_airport
                    val hours = vuelo.total_duration?.div(60)?.toInt()
                    val minutes = hours?.rem(60)
                    var tiempo = "$hours hr $minutes min"
                    listaVuelos.add(FlightEntitie(salida?.id, salida?.name, llegada?.id, llegada?.name, tiempo, vuelo.flights?.get(0)?.airline + " Airlines", vuelo.airline_logo, vuelo.flights?.get(0)?.travel_class + " class", vuelo.price.toString()))
                }
            } else {
                println("else")
            }
        } catch (e: Exception) {
            println("catch")
        }

        return listaVuelos
    }
        companion object {
            /**
             * Use this factory method to create a new instance of
             * this fragment using the provided parameters.
             *
             * @param param1 Parameter 1.
             * @param param2 Parameter 2.
             * @return A new instance of fragment FlightFragment.
             */
            // TODO: Rename and change types and number of parameters
            @JvmStatic
            fun newInstance(param1: String, param2: String) =
                FlightFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
        }
    }