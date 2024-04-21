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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mad_lab_2.ui.theme.MADlab2Theme

class CreatingMultipleRows : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab2Theme{
                CreatingMultipleRowsScreen();
            }
        }
    }
}

@Composable
fun CreatingMultipleRowsScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth().background(Color.Gray).padding(horizontal = 10.dp, vertical = 5.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.height(140.dp).fillMaxWidth().background(Color.White).padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ironman),
                    contentDescription = "Some dummy Image",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "Iron Man",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Age: 43")
                }
            }
            Spacer(modifier = Modifier.size(7.dp))
            Row(
                modifier = Modifier.height(140.dp).fillMaxWidth().background(Color.White).padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hulk),
                    contentDescription = "Some dummy Image",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "Hulk",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Age: 38")
                }
            }
            Spacer(modifier = Modifier.size(7.dp))
            Row(
                modifier = Modifier.height(140.dp).fillMaxWidth().background(Color.White).padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.deadpool),
                    contentDescription = "Some dummy Image",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "DeadPool",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Age: 25")
                }
            }
            Spacer(modifier = Modifier.size(7.dp))
            Row(
                modifier = Modifier.height(140.dp).fillMaxWidth().background(Color.White).padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.wolverine),
                    contentDescription = "Some dummy Image",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "Wolverine",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Age: 48")
                }
            }
            Spacer(modifier = Modifier.size(7.dp))
            Row(
                modifier = Modifier.height(140.dp).fillMaxWidth().background(Color.White).padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.blackwidow),
                    contentDescription = "Some dummy Image",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "Black Widow",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Age: 30")
                }
            }
            Spacer(modifier = Modifier.size(7.dp))
            Row(
                modifier = Modifier.height(140.dp).fillMaxWidth().background(Color.White).padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.thor),
                    contentDescription = "Some dummy Image",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "Thor",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Age: 35")
                }
            }
        }
    }
}
