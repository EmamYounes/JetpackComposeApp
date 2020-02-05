package com.example.jetpackcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
//            Text("Hello World")
            Greeting("Android")
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text("Hello $name")
    }
}
