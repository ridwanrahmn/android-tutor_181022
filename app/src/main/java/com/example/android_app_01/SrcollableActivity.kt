package com.example.android_app_01

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_app_01.data.listMotivation
import com.example.android_app_01.model.Motivation

class ScrollableActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollLayoutApp(listMotivation = listMotivation().loadMotivation())
        }
    }
}

@Composable
fun ScrollLayoutApp(listMotivation: List<Motivation>){
    Column() {
        listMotivation.forEach { motivation ->
            ScrollLayoutCard(motivation)
        }
    }
}

@Composable
fun ScrollLayoutCard(motivation: Motivation) {
    Card (
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.image1_1),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = R.string.affirmation1),
                modifier = Modifier.padding(6.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScrollLayoutPreview(){
    ScrollLayoutCard()
}