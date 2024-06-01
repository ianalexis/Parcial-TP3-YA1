package com.example.parcial_tp3_ya1.data

data class FlightX(
    val airline: String,
    val airline_logo: String,
    val airplane: String,
    val arrival_airport: ArrivalAirportX,
    val departure_airport: DepartureAirportX,
    val duration: Int,
    val extensions: List<String>,
    val flight_number: String,
    val legroom: String,
    val overnight: Boolean,
    val travel_class: String
)