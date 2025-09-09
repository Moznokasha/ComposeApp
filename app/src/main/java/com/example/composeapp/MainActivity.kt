package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.composeapp.screens.repoDetails.RepoDetailsContent

import com.example.composeapp.theme.ComposeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppTheme {
                RepoDetailsContent()
//                RepoScreen()

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



//@Preview(
//    showBackground = true ,
//    showSystemUi = true,
//    device = Devices.PIXEL_7)
