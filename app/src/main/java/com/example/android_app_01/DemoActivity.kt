package com.example.android_app_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val warna01 = 0x98def5aaaa
val warna02 = 0x98fedadf4156df


class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
            )   {
                Surface(
                    color = Color(warna02),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Hello Ridwan",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
                Surface(
                    color = Color(warna01),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Selamat Siang!!",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            Image(
                painter = painterResource(id = R.drawable.remake__avatar__2),
                contentDescription = "Logo"

            )
            }
        }
    }
}