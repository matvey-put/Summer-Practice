@file:OptIn(ExperimentalFoundationApi::class)

package com.example.summerpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi

import com.example.summerpractice.ui.theme.SummerPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SummerPracticeTheme {
                MenuNavigation()
            }
        }
    }
}
