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
                color = Color(146, 105, 100)){
                contents1()

            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(237, 120, 104)) {
                contents2()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(196, 104, 184)) {
                contents3()
            }
        }
        Row(modifier = Modifier.fillMaxHeight()){
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(104, 136, 217)){
                contents4()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(102, 212, 113)) {
                contents5()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(130, 237, 235)) {
                contents6()
            }
        }
    }
}

@Composable
fun contents1(){
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
            text = "@ridwanrahmn_",
            color = Color.Black,
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "1",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun contents2(){
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
            text = "Ridwan",
            color = Color.Black,
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "2",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun contents3(){
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
            text = "3",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun contents4(){
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
            text = "4",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun contents5(){
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
            text = "Rahmansyah",
            color = Color.Black,
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "5",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun contents6(){
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
            text = "@ridwanrahmn_",
            color = Color.Black,
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "6",
            color = Color.Black,
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}




