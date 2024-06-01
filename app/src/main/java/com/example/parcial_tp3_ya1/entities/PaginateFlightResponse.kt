package com.example.parcial_tp3_ya1.entities

data class PaginateFlightResponse<T>(
    val searchParameters : T,
    val flights : List<T>

)
