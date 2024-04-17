package com.example.mad_lab_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mad_lab_2.ui.theme.MADlab2Theme

class ManagingState : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab2Theme{
                ManagingStateScreen();
            }
        }
    }
}

@Composable
fun ManagingStateScreen() {
    val buttonColor = remember { mutableStateOf(Color.Red) }
    Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Button(
            onClick = {
                if(buttonColor.value == Color.Red){
                    buttonColor.value = Color.Green
                }else{
                    buttonColor.value = Color.Red
                }
                 },
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor.value),
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Click Me!")
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MADlab2Theme {
//        ManagingStateScreen()
//    }
//}