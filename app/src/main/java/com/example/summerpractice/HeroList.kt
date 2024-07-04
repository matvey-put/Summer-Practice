package com.example.summerpractice
import androidx.compose.ui.graphics.Color
//https://i.pinimg.com/originals/74/2d/64/742d649b06da5d12fc0c8c9bda7f3df3.png
//https://i.pinimg.com/originals/6c/4a/0f/6c4a0f2a1a79c731d20ca8fad369f71e.png
object HeroList {  val conversationSample = listOf(
    HeroCard(
        "https://pngimg.com/uploads/wolverine/wolverine_PNG45.png",
        "Wolverine",
        "Бесконечно регенерированный",
        Color(red = 0xFF, green = 0xFF, blue = 0x33)
    ),
    HeroCard(
        "https://i.pinimg.com/originals/01/9d/59/019d59040b067a42b9412f47b424d202.png",
        "Thor",
        "Мужик с молотом",
        Color(red = 0x33, green = 0x33, blue = 0xFF)
    ),
    HeroCard(
        "https://i.pinimg.com/originals/2b/b2/f9/2bb2f965ed55972bfd8aa90613cb6f5c.png",
        "Hulk",
        "Красный мужик с камнем во лбу",
        Color(red = 0x66, green = 0xCC, blue = 0x14)
    ),
    HeroCard(
        "https://gas-kvas.com/uploads/posts/2023-02/1675475672_gas-kvas-com-p-fonovii-risunok-chelovek-pauk-48.png",
        "Spider Man",
        "Дружелюбный сосед",
        Color(red = 0xCC, green = 0x00, blue = 0x00)
    )
)
}