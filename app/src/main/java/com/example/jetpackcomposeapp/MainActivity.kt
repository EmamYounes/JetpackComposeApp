package com.example.jetpackcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            NewsStory()
        }
    }

    @Composable
    fun NewsStory() {
        val image = +imageResource(R.drawable.background)
        Column(
            modifier = Spacing(16.dp)
        ) {
            Container(modifier = Spacing(90.dp)) {
                DrawImage(image)
            }

            HeightSpacer(16.dp)

            Text("A day in Shark Fin Cove")
            Text("Davenport, California")
            Text("December 2018")
        }
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }


    // lesson one
/*    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {

            Text("Hello World")
            Greeting("Android")
            PreviewGreeting()

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
    }*/
}
