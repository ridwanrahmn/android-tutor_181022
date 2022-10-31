package com.example.android_app_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Tugas01 : ComponentActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            codes()
        }
    }
}

@Preview
@Composable
fun codes(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxHeight(0.5f)){
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(242, 209, 119)){
                contents()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(237, 120, 104)) {
                contents()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(196, 104, 184)) {
                contents()
            }
        }
        Row(modifier = Modifier.fillMaxHeight()){
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(104, 136, 217)){
                contents()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(102, 212, 113)) {
                contents()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(130, 237, 235)) {
                contents()
            }
        }
    }
}

@Composable
fun contents(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            ){
        Image(
            painter = painterResource(id = R.drawable.logo_with_bg),
            contentDescription = "Logo",
            alignment = Alignment.Center,
            modifier = Modifier
                .clip(CircleShape)
                .size(87.dp, 87.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(
            text = "ridwanrahmn",
            color = Color.Black,
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "191344027",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}




