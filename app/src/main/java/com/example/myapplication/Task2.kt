package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Task2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                Modifier.background(color = Color.Gray)
            ){
                Column(
                    Modifier.padding(it)

                ) {
                    MainComposableTask3()
                }
            }
        }
    }
}

@Composable
fun MainComposableTask3() {
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
            "title" to "Dell Vostro 3671 I7-9400 8GB \n",
            "price" to "500000"
        ),

    )


    LazyColumn {
        items(data, key = { it }) { item ->
            ListItem(
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 10.dp)
                    .background(color = Color.White),
                colors = ListItemDefaults.colors(Color.White),

                headlineContent = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            item["image"] as Painter,
                            contentDescription = "Iron Man",
                            Modifier.size(100.dp)
                        )
                        Column {
                            Text(text = item["title"] as String, fontSize = 22.sp)

                            Text(text = item["release"] as String)
                        }
                    }
                },
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    MainComposableTask3()
}