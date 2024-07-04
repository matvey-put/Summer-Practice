package com.example.summerpractice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import coil.compose.rememberAsyncImagePainter

@Composable
fun HeroScreen(heroCard: HeroCard, navController: NavController){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(heroCard.heroColor)
    ){

        IconButton(onClick = { navController.navigate("main menu") }) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                modifier = Modifier
                    .padding(horizontal =6.dp , vertical = 5.dp)
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberAsyncImagePainter(heroCard.url),
                contentDescription = null,
                modifier = Modifier
                    .width(300.dp)
                    .height(450.dp)
            )
            Text(
                text = heroCard.name,
                style = TextStyle(
                        fontSize = 30.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Cursive
                ),
                textAlign = TextAlign.Center
            )
            Text(
                text = heroCard.info,
                style = TextStyle(
                    fontSize = 23.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive
                ),
                modifier = Modifier
                    .padding(horizontal = 6.dp)
            )
        }
    }
}
