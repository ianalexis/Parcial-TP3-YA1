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
            arrayOf("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg/640px-La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Paris_M%C3%A9tro_Line_8_at_Night.jpg/640px-Paris_M%C3%A9tro_Line_8_at_Night.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Notre_Dame_%2839898572641%29.jpg/640px-Notre_Dame_%2839898572641%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Arcdetriomphe_2.jpg/640px-Arcdetriomphe_2.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Paris_Opera_full_frontal_architecture%2C_May_2009_%28cropped%29.jpg/640px-Paris_Opera_full_frontal_architecture%2C_May_2009_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Louvre_Courtyard%2C_Looking_West.jpg/640px-Louvre_Courtyard%2C_Looking_West.jpg"),
            "$1299")
        )
    }
}