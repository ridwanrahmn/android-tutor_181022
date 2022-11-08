package com.example.android_app_01.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.android_app_01.R

@Composable
fun ScreenSatu(navController: NavController) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.remake__avatar__2), contentDescription = "logo")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("screen_dua") }
        ) {
            Text(text = "Welcome!!")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenSatuPreview(){
    ScreenSatu(rememberNavController())
}