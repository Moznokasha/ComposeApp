package com.example.composeapp.ui.screens.repo_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices.PIXEL_7
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composeapp.R
import com.example.composeapp.ui.common_components.MyAppBar
import com.example.composeapp.ui.screens.repo_list.components.RepoItems
import com.example.composeapp.ui.screens.repo_list.repositories.reposData.getRepos

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReposScreen(onBack: () -> Unit = {}){
    val repositories = getRepos()
    Scaffold(
        topBar = {
            MyAppBar(
                title = R.string.github_repositories,
                showBackButton = true,
                onBackButtonClicked = onBack
            )
        }
    ) { innerPadding ->
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ){
            items(repositories){repoUiModelItem->
                RepoItems(
                    repoUiModel = repoUiModelItem
                )

            }
        }

    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
    device = PIXEL_7
)
@Composable
private fun PreviewReposScreen() {
    ReposScreen()
}