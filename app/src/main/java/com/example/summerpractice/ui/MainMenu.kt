package com.example.summerpractice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import coil.compose.rememberAsyncImagePainter

@Composable
fun MainScreen(heroList: List<HeroCard>, navController: NavController) {
    Box(Modifier.background(Color.Black))
    {
        Image(
            painter = painterResource(R.drawable.back),
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxSize(1f)

        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = rememberAsyncImagePainter("https://iili.io/JMnuvbp.png"),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 120.dp)
                    .width(150.dp)
                    .height(100.dp)

            )
            Text(
                text = "Choose your hero",
                style = TextStyle(
                    fontSize = 34.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive
                )
            )
            Scrolling(heroList,navController)
        }
    }
}
