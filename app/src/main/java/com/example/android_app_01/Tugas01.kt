package com.example.android_app_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val warnaa1 = 0x98def5aaaa
val warnaa2 = 0x98fedadf4156df

class Tugas01 : ComponentActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier,
            )   {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .fillMaxHeight(0.5f)
                        .background(Color(83, 146, 230))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.remake__avatar__2),
                        contentDescription = "Logo"
                    )
                    Text(
                        text = "Ridwan",
                        fontSize = 20.sp)
                }
            }
        }
    }
}



