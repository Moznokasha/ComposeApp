package com.example.composeapp.ui.screens.repo_issues.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.screens.repo_issues.model.IssueUiModel

@Composable
fun IssueItems(issueUiModel: IssueUiModel,
               onIssueItemClicked:()->Unit = {}) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .clickable{onIssueItemClicked()}
            .background(color = MaterialTheme.colorScheme.surface,
                shape = MaterialTheme.shapes.medium)
            .padding(10.dp)

    ) {
        Image(
            painter = painterResource(R.drawable.issues),
            contentDescription = null,
            modifier = Modifier.clip(RoundedCornerShape(20.dp))
                .padding(8.dp)
                .size(50.dp)
        )

        Column (
            modifier = Modifier.padding(8.dp)
        ){
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = issueUiModel.issue,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = issueUiModel.status,
                    style = MaterialTheme.typography.labelLarge
                )


            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = issueUiModel.none,
                style = MaterialTheme.typography.bodyLarge

                )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = issueUiModel.createdAt,
                    style = MaterialTheme.typography.titleSmall
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = issueUiModel.date,
                    style = MaterialTheme.typography.bodySmall
                )
            }


        }


    }
    
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun PreviewIssueItems() {
    IssueItems(issueUiModel = IssueUiModel(
        1,
        "Bump pyarrow from 7...",
        "Open",
        "None",
        "CreatedAt:",
        "2023-11-9, 23:0 PM"

    ))
}