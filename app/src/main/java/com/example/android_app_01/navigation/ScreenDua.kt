package com.example.android_app_01.navigation

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.android_app_01.R

@Composable
fun ScreenDua(navController: NavController){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(81, 138, 224),
                contentColor = Color.White
            )) {
            Text(text = "Click This")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenDuaPreview(){
    ScreenDua(rememberNavController())
}
