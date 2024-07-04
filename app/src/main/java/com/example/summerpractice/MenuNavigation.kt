package com.example.summerpractice

import androidx.compose.runtime.Composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MenuNavigation(){
    val navController = rememberNavController()
    NavHost(navController= navController, startDestination = "main menu"){
        composable("main menu"){
            MainScreen(heroList =HeroList.conversationSample , navController)
        }
        composable("Wolverine"){


            HeroScreen(heroCard = HeroList.conversationSample[0], navController)
        }
        composable("Thor"){
            HeroScreen(heroCard = HeroList.conversationSample[1], navController)
        }
        composable("Hulk"){
            HeroScreen(heroCard = HeroList.conversationSample[2], navController)
        }
        composable("Spider man"){
            HeroScreen(heroCard = HeroList.conversationSample[3], navController)
        }
    }
}
