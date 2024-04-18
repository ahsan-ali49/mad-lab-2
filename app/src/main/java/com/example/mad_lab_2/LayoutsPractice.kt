package com.example.mad_lab_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mad_lab_2.ui.theme.MADlab2Theme

class LayoutsPractice : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab2Theme{
                LayoutsPracticeScreen();
            }
        }
    }
}

@Composable
fun LayoutsPracticeScreen(){
    Row (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Some dummy pic",
            modifier = Modifier.clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.size(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                    text = "1",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Gray),
                    color = Color.White
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(
                    text = "2",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Gray),
                    color = Color.White
            )
        }
    }
}