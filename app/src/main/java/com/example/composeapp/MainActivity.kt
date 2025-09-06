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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.focus.focusModifier


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
//                    LazyColumn {
//                        items(dummyData()){(title, description) ->
//                            MyItem(title = title, description = description)
//                            HorizontalDivider()
//                        }
//                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Details",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {  }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "back")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color(0xFFE0E0E0)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.google),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Language",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Row( modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "1525",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = null
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Python",
                        modifier = Modifier.padding(end = 5.dp))
                    Image(painter = painterResource(R.drawable.blue),
                        contentDescription = null)
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "347",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(end = 5.dp))
                    Image(painter = painterResource(R.drawable.fork),
                        contentDescription = null)
                }

            }
            Text(text = "Shared repository for open-sourced projects from the Google AI Language team. ",
                modifier = Modifier.padding(30.dp),
                fontSize = 20.sp)
            Spacer(modifier = Modifier.height(300.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth(0.7f),


            ) {
                Text(text = "Show Issues",
                    fontSize = 25.sp)
            }
        }
    }
}


//fun circularButtonModifier(color: Color) = Modifier
//    .background(color, shape = CircleShape)
//    .padding(8.dp)

//@Composable
//fun MyItem(title: String, description: String){
//    Text(text = title, modifier = Modifier.padding(bottom = 8.dp))
//    Text(text = description )
//
//}
//
//private fun dummyData() = listOf(
//    "repo 1" to "description 1",
//    "repo 2" to "description 2",
//    "repo 3" to "description 3",
//    "repo 4" to "description 4",
//    "repo 5" to "description 5",
//    "repo 6" to "description 6"
//)



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