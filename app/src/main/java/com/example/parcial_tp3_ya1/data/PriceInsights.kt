package com.example.parcial_tp3_ya1.data

data class PriceInsights(
    val lowest_price: Int?,
    val price_history: List<List<Int>>?,
    val price_level: String?,
    val typical_price_range: List<Int>?
)