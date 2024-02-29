package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainComposable()
        }
    }
}

@Composable
fun MainComposable() {

    var context = LocalContext.current

    Scaffold {
        Modifier.padding(it)
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = {
                    val intent = Intent(context, Task1::class.java)
                    context.startActivity(intent)
                }) {
                Text(text = "Task 1", fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {
                    val intent = Intent(context, Task2::class.java)
                    context.startActivity(intent)
                }) {
                Text(text = "Task 2", fontWeight = FontWeight.Bold)
            }

            Button(
                onClick = {
                    val intent = Intent(context, Task3::class.java)
                    context.startActivity(intent)
                }) {
                Text(text = "Task 3", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MainComposable()
}