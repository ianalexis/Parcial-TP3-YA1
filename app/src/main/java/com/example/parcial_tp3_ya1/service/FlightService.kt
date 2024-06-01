package com.example.parcial_tp3_ya1.service

import com.example.parcial_tp3_ya1.entities.PaginateFlightResponse
import retrofit2.Call
import retrofit2.http.GET

interface FlightService {

    @GET("search?engine=google_flights&api_key=123&departure_id=EZE&arrival_id=MIA&outbound_date=2024-05-31&return_date=2024-06-10")
    fun getFlights() : Call<PaginateFlightResponse<FlightEntitie>> //

}