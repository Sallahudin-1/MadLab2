package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Task3 : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = { TopAppBar(
                    modifier = Modifier.background(color = Color.Blue),
                    title = {
                        Text(text = "Lazy Grid Layout")
                    }

                )
                }
            ) {

                Column(
                    Modifier.padding(it)
                ) {
                    MainComposableTask4()
                }
            }
        }
    }
}

@Composable
fun MainComposableTask4() {
    val data = listOf(
        mapOf(
            "image" to painterResource(id = R.drawable.dell),
            "title" to " Dell Vostro 3671 I7-9400 8GB 1TB Desktop Tower\n",
            "price" to "129990"
        ),
        mapOf(
            "image" to painterResource(id = R.drawable.bglenovo),
            "title" to "Lenovo LOQ 15 Ryzen 7 7840HS 8GB 512GB SSD \n",
            "price" to "130009"
        ),
        mapOf(
            "image" to painterResource(id = R.drawable.leno),
            "title" to "Lenovo V60T 13IMB Core I5-1023\n",
            "price" to "298372"
        ),
        mapOf(
            "image" to painterResource(id = R.drawable.delltwo),
            "title" to "Dell Vostro 3671 I7-9400 8GB",
            "price" to "500000"
        ),
    )


    Box(
        Modifier.padding(20.dp)
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2), content = {
                items(data.size){
                    Box {
                        Column {
                            Image(painter = data[it]["image"] as Painter,
                                contentDescription = "Images",
                                modifier = Modifier
                                    .size(200.dp)
                                    .fillMaxSize()


                            )
                            Row(
                                horizontalArrangement = Arrangement.Center

                            ) {
                                Text(text = data[it]["title"] as String, fontSize = 21.sp)
                            }
                        }
                    }
                }
            }

        )
    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview4() {
    MainComposableTask4()
}