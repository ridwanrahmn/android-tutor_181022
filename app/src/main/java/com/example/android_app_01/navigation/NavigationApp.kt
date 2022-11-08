package com.example.android_app_01.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_app_01.ScrollLayoutApp
import com.example.android_app_01.data.ListMotivation

class NavigationApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavApp()
        }
    }
}

@Composable
fun NavApp(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "screen_satu"
    ) {
        composable("screen_satu"){
            ScreenSatu(navController)
        }
        composable("screen_dua"){
            ScreenDua(navController)
        }
    }
}

