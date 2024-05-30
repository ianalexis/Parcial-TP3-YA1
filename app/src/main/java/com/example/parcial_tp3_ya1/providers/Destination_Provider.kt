package com.example.parcial_tp3_ya1.providers

import com.example.parcial_tp3_ya1.entities.Destination

class Destination_Provider {

    companion object {
        val destinationList = listOf<Destination>(
            Destination(
                "Boracay",
                "Philippines",
                "5D4N",
                "Boracay.svg",
                "Spend 5 days and 4 nights in one of the best islands in the world! Bask in the sun while walking in the white sand beach and enjoy the night partying at the popular seaside bars.",
                arrayOf("Fotos_Boracay1.png", "Fotos_Boracay2.png", "Fotos_Boracay3.png"),
                "$349"
            ),
            Destination(
                "Baros",
                "Maldives",
                "7D6N",
                "Baros.svg",
                "Spend 7 days and 6 nights in a private island resort in the Maldives! Enjoy the crystal clear waters and the luxurious accommodations.",
                arrayOf("Fotos_Baros1.png", "Fotos_Baros2.png", "Fotos_Baros3.png"),
                "$999"
            ),
            Destination(
                "Bali",
                "Indonesia",
                "3D2N",
                "Bali.svg",
                "Spend 3 days and 2 nights in the beautiful island of Bali! Visit the famous temples and enjoy the local cuisine.",
                arrayOf("Fotos_Bali1.png", "Fotos_Bali2.png", "Fotos_Bali3.png"),
                "$199"
            ),
            Destination(
                "Palawan",
                "Philippines",
                "3D2N",
                "Palawan.svg",
                "Spend 3 days and 2 nights in the last frontier of the Philippines! Explore the underground river and enjoy the pristine beaches.",
                arrayOf("Fotos_Palawan1.png", "Fotos_Palawan2.png", "Fotos_Palawan3.png"),
                "$249"
            ),
        )
    }
}