package com.example.parcial_tp3_ya1.services

import com.example.parcial_tp3_ya1.data.FlightResponse
import retrofit2.Response
import retrofit2.http.GET

interface FlightService {

    @GET("search?engine=google_flights&api_key=123&departure_id=EZE&arrival_id=MIA&outbound_date=2024-05-31&return_date=2024-06-10")

    //fun getFlights() : Call<FlightResponse> //
    suspend fun getFlights(): Response<FlightResponse>


}