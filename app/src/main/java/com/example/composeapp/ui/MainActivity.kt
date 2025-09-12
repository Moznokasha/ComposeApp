package com.example.composeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.composeapp.R
import com.example.composeapp.ui.common_components.MyAppBar
import com.example.composeapp.ui.screens.repoDetails.RepoDetailsContent
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppTheme {
//                RepoDetailsContent()

                Scaffold(
                    topBar = {
                        MyAppBar(
                            title = R.string.repo_details_screen_title,
                        )
                    }
                ) { innerPadding ->
                    RepoDetailsContent(innerPadding)

                }
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