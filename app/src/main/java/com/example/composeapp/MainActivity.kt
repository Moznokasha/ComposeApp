package com.example.composeapp

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.TextStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
//        Text(
//
//            text = "Hello $name!",
//            modifier = modifier.padding(top = 50.dp, start = 20.dp)
//        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource( R.drawable.part1),
                contentDescription = null,
                modifier = Modifier.weight(1f)
                    .padding(4.dp)

            )
            Image(
                painter = painterResource(R.drawable.part2),
                contentDescription = null,
                modifier = Modifier.weight(1f)
                    .padding(4.dp)

            )
        }

        Image(
            painter = painterResource(R.drawable.part3),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp)

        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "My name is: Mozn ",
                fontSize = 24.sp
            )

            Text(
                text = "My age is : 19",
                fontSize = 24.sp
            )

        }

        val uriHandler = LocalUriHandler.current
        val url = "https://www.linkedin.com/in/mozn-okasha-7b312b2b2?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app"
        Text(
            text = url,
            modifier = Modifier
                .clickable{uriHandler.openUri(url)}
                .padding(4.dp),
            style = TextStyle(
                color = Color(0xFF1E88E5),
                textDecoration = TextDecoration.Underline
            )
        )


    }

}


//fun circularButtonModifier(color: Color) = Modifier
//    .background(color, shape = CircleShape)
//    .padding(8.dp)



@Preview(
    showBackground = true ,
    showSystemUi = true,
    device = Devices.PIXEL_7)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        Greeting("Android")
    }
}