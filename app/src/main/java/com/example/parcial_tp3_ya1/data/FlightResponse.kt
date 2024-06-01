package com.example.parcial_tp3_ya1.data

data class FlightResponse(
    val best_flights: List<BestFlight>?,
    val other_flights: List<OtherFlight>?,
    val price_insights: PriceInsights?,
  //  val search_metadata: SearchMetadata?,
    val search_parameters: SearchParameters?
)