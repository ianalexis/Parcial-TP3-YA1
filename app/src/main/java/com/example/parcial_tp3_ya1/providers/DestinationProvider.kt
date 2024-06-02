package com.example.parcial_tp3_ya1.providers

import com.example.parcial_tp3_ya1.entities.DestinationEntitie

class DestinationProvider {

    companion object {

        private val listaFotos =
            arrayOf(
            "https://s3-alpha-sig.figma.com/img/243c/f01b/00586922841de5ebc281a4e038890f61?Expires=1717977600&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Dq4rszCD6ieEd1vAXRQ9Cu0W1fZsv85Rcclefvb~FdWMAlsDJkfumXUkNU8lMHf1SLA5dCylukl5T3ubp80~3INsPz8HsxshYfSppN97-z5QzItSTyvr0MNb5ZNFaUm37eIOJpglhfT09gvGP3anLA7dzFFVWur~qViGgojZiatVLjhcJF7aT0Q3EpGnFU~UWX6KY~dhJIQ3gTbTnzvGgpmxWK5JhvhTLQ5ATXZOdy2yhfMUyowrYzojHm95VZifhkwLgxwf6UrYs863qAL1xRP9uuHJIZYJEmIbxDbZ7uEysTTcGMzqBkD2Q5p6zbjila6JudP9dafuSzpHmmjnow__",
            "https://s3-alpha-sig.figma.com/img/4b3f/f8b5/17caec8dfda00cd78f97b88e306a2470?Expires=1717977600&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=R~g4HDn~FKvcCx1yhK5cuT5mLE2nErkIIh7x3GmaqkOlLAi0SqScL-7xX7oc4vEeNzNQq9vaqqRoK9IRBYoUHQDBzsQxJlg3qNTUF~0g3zjUfkRCTQk9fL4tYpSHmA6yF0QAzmhR9EKMFILX6fspU5Gm7kqU3Bvs99pqgFrvzGUO5bgQjZXYQ7H~GZRyFFEa1ZxhkvSoUCmoy4EpNyL2OWIggYERk4nwugLPsVbLbyXTp0n7DAUrR9g3FzEMwwDZbwP92Ai1WaiPN1j5DpKTsf2AmlIN1KRWJBCiIAr8UdAVO2kkBl3VZy4CWumi8gz0Dwhj9~uEdPl6u6r3Im~87g__",
            "https://s3-alpha-sig.figma.com/img/88a4/6e96/088ba42b1069b8d7acb36b33e1857f9c?Expires=1717977600&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=hjVznO8IxtJ~DakynJiXOxsWP5zUGlMiZYTQNYpDQXsLHP7uGjH-pvuP6-WhCWZXI9TnUb3aABoMPfXI4AYF6LZE0poi7dLZA0Ru5Xzq-swlRgsYPb9trhMvyErW~KJdAIBCdbs3jcVAaAddv0KZtT55ufTU3hkZ2lFb0M55WeOMYl161xM5ejIqbTm02HvHs4cmeep8-k-CZoP6MwpyGUqeQBsS8TgI92plEnCxK4GZuRTUHZhK4EJd43LfnINjJf29mMx~9eOmN~fODaFQbrLQgYdW2ajSN8pY~wg6YbJEb-E~Uk6EQ0r-XdBbhiQS3JG7V2MchKl9witfWhYfdQ__",
             // Agregar mas aca si es necesario
             )
        val destinationEntitieLists = listOf<DestinationEntitie>(
            DestinationEntitie(
                "Boracay",
                "Philippines",
                "5D4N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/d6ce932e2b32dca3c90f8f66e2293de2b6acda45",
                "Spend 5 days and 4 nights in one of the best islands in the world! Bask in the sun while walking in the white sand beach and enjoy the night partying at the popular seaside bars.",
                this.listaFotos,
                "$349"
            ),
            DestinationEntitie(
                "Baros",
                "Maldives",
                "7D6N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/a864c5c02d0b8bbe6de7c895d7f9a2bd1f93cb4a",
                "Spend 7 days and 6 nights in a private island resort in the Maldives! Enjoy the crystal clear waters and the luxurious accommodations.",
                this.listaFotos,
                "$999"
            ),
            DestinationEntitie(
                "Bali",
                "Indonesia",
                "3D2N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/db9ea9d8830a9cd7f332253ecada83b60351d78c",
                "Spend 3 days and 2 nights in the beautiful island of Bali! Visit the famous temples and enjoy the local cuisine.",
               this.listaFotos,
                "$199"
            ),
            DestinationEntitie(
                "Palawan",
                "Philippines",
                "3D2N",
                "https://www.figma.com/file/3fpcDil0eOVslxFzD2S5hP/image/117d79f33638fb7469e83bae9aedc5201481b6af",
                "Spend 3 days and 2 nights in the last frontier of the Philippines! Explore the underground river and enjoy the pristine beaches.",
                this.listaFotos,
                "$249"
            ),
        )
    }
}