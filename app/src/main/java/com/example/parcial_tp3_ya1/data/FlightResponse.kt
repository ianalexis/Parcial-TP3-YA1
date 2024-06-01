package com.example.parcial_tp3_ya1.data

data class FlightResponse(
    val best_flights: List<AllFlight>?,
    val other_flights: List<AllFlight>?,
 //   val price_insights: PriceInsights?,
  //  val search_metadata: SearchMetadata?,
    val search_parameters: SearchParameters?
)