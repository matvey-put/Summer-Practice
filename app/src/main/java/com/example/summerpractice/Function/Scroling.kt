@file:OptIn(ExperimentalFoundationApi::class)

package com.example.summerpractice

import androidx.compose.foundation.ExperimentalFoundationApi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState

import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import coil.compose.rememberAsyncImagePainter

@Composable
fun Scrolling(heroCard: List<HeroCard>,navController: NavController){

    val lazyListState = rememberLazyListState()
    val snapBehavior = rememberSnapFlingBehavior(lazyListState = lazyListState)

    LazyRow(horizontalArrangement = Arrangement.spacedBy(40.dp),
        contentPadding = PaddingValues(horizontal = 60.dp),
        state = lazyListState,
        flingBehavior = snapBehavior
    ){
        items(heroCard){
                heroCard ->
            Box() {
                Surface(
                    color = heroCard.heroColor,
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .clickable{navController.navigate(heroCard.name)}
                ) {
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
                                fontSize = 30.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Cursive
                            )
                        )
                    }
                }
            }
        }
    }
}
