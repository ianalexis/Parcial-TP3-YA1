package com.example.parcial_tp3_ya1.providers

import com.example.parcial_tp3_ya1.entities.DestinationEntitie

class DestinationProvider {

    companion object {
        val destinationEntitieLists = listOf<DestinationEntitie>(
            DestinationEntitie(
                "Boracay",
                "Philippines",
                "5D4N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/d6ce932e2b32dca3c90f8f66e2293de2b6acda45",
                "Spend 5 days and 4 nights in one of the best islands in the world! Bask in the sun while walking in the white sand beach and enjoy the night partying at the popular seaside bars.",
                arrayOf("fotosboracay1.png", "fotosboracay2.png", "fotosboracay3.png"),
                "$349"
            ),
            DestinationEntitie(
                "Baros",
                "Maldives",
                "7D6N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/a864c5c02d0b8bbe6de7c895d7f9a2bd1f93cb4a",
                "Spend 7 days and 6 nights in a private island resort in the Maldives! Enjoy the crystal clear waters and the luxurious accommodations.",
                arrayOf("fotosbaros1.png", "fotosbaros2.png", "fotosbaros3.png"),
                "$999"
            ),
            DestinationEntitie(
                "Bali",
                "Indonesia",
                "3D2N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/db9ea9d8830a9cd7f332253ecada83b60351d78c",
                "Spend 3 days and 2 nights in the beautiful island of Bali! Visit the famous temples and enjoy the local cuisine.",
                arrayOf("fotosbali1.png", "fotosbali2.png", "fotosbali3.png"),
                "$199"
            ),
            DestinationEntitie(
                "Palawan",
                "Philippines",
                "3D2N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/117d79f33638fb7469e83bae9aedc5201481b6af",
                "Spend 3 days and 2 nights in the last frontier of the Philippines! Explore the underground river and enjoy the pristine beaches.",
                arrayOf("fotospalawan1.png", "fotospalawan2.png", "fotospalawan3.png"),
                "$249"
            ),
        )
    }
}