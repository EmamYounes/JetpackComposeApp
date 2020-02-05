package com.example.jetpackcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {

            //            Text("Hello World")
           Greeting("Android")
//            PreviewGreeting()

        }
    }

    @Composable
    fun Greeting(name: String) {
        Text("Hello $name")
    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting("Android")
    }
    @Preview
    @Composable
    fun DefaultPreview() {
        Greeting("Android")
    }
}
