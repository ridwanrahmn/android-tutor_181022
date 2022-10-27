package com.example.android_app_01

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class StaticActivity : ComponentActivity () {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EchoText(){
    var displayedText = remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        if (displayedText.value.isNotEmpty()){
            Text(text = "Hello " + displayedText.value)
        }

        Spacer(modifier = Modifier.height((24.dp)))
        OutlinedTextField(value = displayedText.value, onValueChange = { displayedText.value=it})
    }


}