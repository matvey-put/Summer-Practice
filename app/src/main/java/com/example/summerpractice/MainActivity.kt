package com.example.summerpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Card

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.summerpractice.ui.theme.SummerPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SummerPracticeTheme {
                MainScreen(HeroList.conversationSample)
            }
        }
    }
}

@Composable
fun MainScreen(heroList: List<HeroCard>) {
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
                    fontSize = 30.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )
            Scrolling(heroList)
        }
    }
}

@Composable
fun Scrolling(heroCard: List<HeroCard>){

    LazyRow(horizontalArrangement = Arrangement.spacedBy(40.dp),
        contentPadding = PaddingValues(horizontal = 60.dp)){
        items(heroCard){
                heroCard ->
        Box() {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = rememberAsyncImagePainter(heroCard.url),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(vertical = 20.dp, horizontal = 0.dp)
                        .height(365.dp)
                        .width(250.dp)
                )
                Text(
                    text = heroCard.name,
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    ),

                )
            }
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Backgraund()
//
//}