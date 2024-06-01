package com.example.parcial_tp3_ya1.data

data class OtherFlight(
    val airline_logo: String,
    val carbon_emissions: CarbonEmissions,
    val departure_token: String,
    val flights: List<FlightX>,
    val layovers: List<Layover>,
    val price: Int,
    val total_duration: Int,
    val type: String
)