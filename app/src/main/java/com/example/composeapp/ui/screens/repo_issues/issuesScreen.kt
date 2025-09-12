package com.example.composeapp.ui.screens.repo_issues

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.R
import com.example.composeapp.ui.common_components.MyAppBar
import com.example.composeapp.ui.screens.repo_issues.components.IssueItems
import com.example.composeapp.ui.screens.repo_issues.model.IssueUiModel

@Composable
fun IssueScreen(onBack:()->Unit = {}) {
    val issues = getIssueData()
    Scaffold(
        topBar ={
            MyAppBar(
                title = R.string.issues,
                showBackButton = true,
                onBackButtonClicked = onBack


            )

        }
    ) {innerPadding->
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ){
            items(issues){issueUiModelItem->
                IssueItems(
                    issueUiModel = issueUiModelItem
                )

            }
        }

    }
    
}

@Preview
    (
    showBackground= true,
    showSystemUi = true
            )
@Composable
private fun PreviewIssueScreen() {
    IssueScreen()

}