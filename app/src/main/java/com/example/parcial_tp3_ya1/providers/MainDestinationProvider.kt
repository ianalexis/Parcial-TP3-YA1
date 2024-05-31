package com.example.parcial_tp3_ya1.providers

import com.example.parcial_tp3_ya1.entities.DestinationEntitie

class MainDestinationProvider {
    companion object {
        val mainDestinationListEntities = listOf<DestinationEntitie>(
            DestinationEntitie(
                "Paris",
            "France",
            "1A4N",
            "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/3554a7ed7eeebc38543234a80a3ebb2521989511",
            "Spend 1 day and 4 nights in the city of love! Visit the Eiffel Tower and enjoy the local cuisine.",
            arrayOf("fotosparis1.png", "fotosparis2.png", "fotosparis3.png"),
            "$1299")
        )
    }
}