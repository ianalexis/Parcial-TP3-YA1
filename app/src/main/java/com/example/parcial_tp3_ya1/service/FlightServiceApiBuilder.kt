package com.example.parcial_tp3_ya1.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FlightServiceApiBuilder {

    private val BASE_URL = "https://d9811bf4-5e67-4a8c-bdcf-603cbbfc0275.mock.pstmn.io/"
 //   private val GET_ENDPOINT = "search?engine=google_flights&api_key=123&departure_id=EZE&arrival_id=MIA&outbound_date=2024-05-31&return_date=2024-06-10"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun create() : FlightService{
        return retrofit.create(FlightService::class.java)
    }
}