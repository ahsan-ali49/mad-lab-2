package com.example.mad_lab_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mad_lab_2.ui.theme.MADlab2Theme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class CreatingGridusingLazyGrid : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab2Theme{
                val images = listOf(R.drawable.blackwidow, R.drawable.deadpool, R.drawable.hulk, R.drawable.ironman)
                val names = listOf("BlackWidow","DeadPool", "Hulk", "Ironman")
                CreatingGridusingLazyGridScreen(images, names)
            }
        }
    }
}

@Composable
fun CreatingGridusingLazyGridScreen(images: List<Int>, names: List<String>){
    // Using fixed column count
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Number of columns
        contentPadding = PaddingValues(8.dp) // Padding around the grid
    ) {
        itemsIndexed(images) { index, image ->
            Column (modifier = Modifier.padding(4.dp)){
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "Grid Image"
                )
                Text(
                    text = names[index],
                    modifier = Modifier.fillMaxWidth().background(Color.Magenta).padding(4.dp),
                    color = Color.White

                )
            }

        }
    }
}