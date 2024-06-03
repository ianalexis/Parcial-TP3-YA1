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
import com.example.parcial_tp3_ya1.data.Airport
import com.example.parcial_tp3_ya1.entities.FlightEntitie
import com.example.parcial_tp3_ya1.services.FlightServiceApiBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class FlightFragment : Fragment() {

    lateinit var vista : View
    lateinit var flightRv : RecyclerView
    lateinit var txtResultsFound : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
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

        //flights co routine
        lifecycleScope.launch {
            loadVuelos()

            flightRv.setHasFixedSize(true)

            val linearLayoutManager = LinearLayoutManager(context)
            flightRv.layoutManager = linearLayoutManager

            val flightAdapter = FlightAdapter(loadVuelos())
            flightRv.adapter = flightAdapter
        }
    }

    private suspend fun loadVuelos() : List<FlightEntitie> {
        val service = FlightServiceApiBuilder.create()
        val listaVuelos = arrayListOf<FlightEntitie>()

        try {
            val response = withContext(Dispatchers.IO) { service.getFlights() }
            if (response.isSuccessful) {

                // "Desestructuramos" en la variable flighrResponse el body de la respuesta de la api,
                val flightResponse = response.body()

                // Cargamos el total de vuelos encontrados en la vista.
                val totalSize = flightResponse?.best_flights!!.size + flightResponse.other_flights!!.size
                txtResultsFound.text = "$totalSize result founds"

                // Inicializamos las variables que utilizaremos posteriormente con la generacion de entidades.
                var salida : Airport?
                var llegada : Airport?
                var tiempo : String?
                var precio : String?

                // Cargamos en la lista de vuelos la respuesta de la api de mejores vuelos
                for (vuelo in flightResponse.best_flights){
                    salida = vuelo.flights?.get(0)?.departure_airport // Obtenemos el aeropuerto de salida
                    llegada = vuelo.flights?.last()?.arrival_airport // OBtenemos el aeropuerto de llegada

                    // Formateamos el tiempo para la vista
                    val hours = vuelo.total_duration?.div(60)?.toInt() ?: 0
                    val minutes = ((vuelo.total_duration?.div(60))?.minus((vuelo.total_duration?.div(60)?.toInt()!!))
                        ?.times(60))?.toInt()
                    // Adecuamos strings,
                    tiempo = "$hours hr $minutes min"
                    precio = "$" + vuelo.price
                    listaVuelos.add(FlightEntitie(salida?.id, salida?.name, llegada?.id, llegada?.name, tiempo, vuelo.flights?.get(0)?.airline + " Airlines", vuelo.airline_logo, vuelo.flights?.get(0)?.travel_class + " class", precio))
                }
                // Cargamos en la lista de vuelos la espuesta de la api de otros vuelos
                for (vuelo in flightResponse.other_flights){
                     salida = vuelo.flights?.get(0)?.departure_airport // Obtenemos el aeropuerto de salida
                     llegada = vuelo.flights?.last()?.arrival_airport // OBtenemos el aeropuerto de llegada

                    // Formateamos el tiempo para la vista
                    val hours = vuelo.total_duration?.div(60)?.toInt() ?: 0
                    val minutes = ((vuelo.total_duration?.div(60))?.minus((vuelo.total_duration?.div(60)?.toInt()!!))
                        ?.times(60))?.toInt()
                    // Adecuamos strings,
                    tiempo = "$hours hr $minutes min"
                    precio = "$" + vuelo.price
                    listaVuelos.add(FlightEntitie(salida?.id, salida?.name, llegada?.id, llegada?.name, tiempo, vuelo.flights?.get(0)?.airline + " Airlines", vuelo.airline_logo, vuelo.flights?.get(0)?.travel_class + " class", precio))
                }
            } else {
                // En caso de error con la api, se maneja.
            }
        } catch (e: Exception) {
                // En caso de un fatal error. Se maneja
        }
        // Devolvelos la lista de vuelos para manipular el RV
        return listaVuelos
    }
        companion object {
            @JvmStatic
            fun newInstance() =
                FlightFragment().apply {
                    arguments = Bundle().apply {

                    }
                }
        }
    }