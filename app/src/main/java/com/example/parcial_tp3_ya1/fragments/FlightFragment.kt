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
        //offers
        flightRv.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(context)
        flightRv.layoutManager = linearLayoutManager

        loadVuelos()
    }

    private fun loadVuelos() {
        val service = FlightServiceApiBuilder.create()

        lifecycleScope.launch {
            try {
                val response = withContext(Dispatchers.IO) { service.getFlights() }
                if (response.isSuccessful) {
                    // La llamada fue exitosa, obtener la respuesta
                    val flightResponse = response.body()

                   val totalSize = flightResponse?.best_flights!!.size + flightResponse.other_flights!!.size

                    txtResultsFound.text = "$totalSize result founds"

                    // El adapter de vuelos recibe la lsita de vuelos.
                   // val flightAdapter = FlightAdapter(flightResponse)
                  // flightRv.adapter = flightAdapter
                    println (flightResponse.search_parameters?.arrival_id)
                    println (flightResponse.search_parameters?.departure_id)
                    println (flightResponse.best_flights[0].price)
                    println (flightResponse.other_flights[0].price)
                    println (flightResponse.best_flights[0].flights[0].travel_class + " Class") //cambiarlo por el tipo de clase buisness class
                    println (flightResponse.best_flights[0].flights[0].airline + " Airlines")
                    println (flightResponse.best_flights[0].airline_logo)
                    println (flightResponse.best_flights[0].total_duration/60)
                    println (flightResponse.best_flights[0].flights[0].arrival_airport.name)
                    println (flightResponse.best_flights[0].flights[0].departure_airport.name)

                } else {
                    // La llamada no fue exitosa, manejar el error aquí
                    // Puedes mostrar un mensaje de error o realizar cualquier otra acción necesaria.

                    println("else")
                }
            } catch (e: Exception) {
                println("catch")
            }
        }
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