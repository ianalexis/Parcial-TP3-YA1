package com.example.parcial_tp3_ya1.providers

import com.example.parcial_tp3_ya1.entities.DestinationEntitie
import com.example.parcial_tp3_ya1.entities.OffersEntitie

class OffersProvider {
    companion object {
        val offersEntitieLists = listOf<OffersEntitie>(
            OffersEntitie(
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/c170cfebb32112aa4cb8c4dc3daa1093bf0bb7d2",
                "20% discount for mastercard users",
                "Get 20% discount with your Master credit cards",
                "Limited time offer!",
                "Use your mastercard with any transaction and get 20% discount instantly!"


            ),
            OffersEntitie(
            "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/ea0f06aea1a9e938b34eba04c4c3ee2af37f2010",
            "25% discount with your Visa credit cards",
            "25% discount with your VISA credit or debit cards",
            "Limited time offer!",
            "Use your VISA credit or debit card with any transaction and get 25% discount instantly! "
        )

        )
    }
}