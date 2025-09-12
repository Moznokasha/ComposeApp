package com.example.composeapp.ui.screens.repo_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices.PIXEL_7
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.ui.screens.repo_list.model.RepoUiModel

@Composable
fun RepoItems(repoUiModel: RepoUiModel,
              onRepoItemItemClicked: ()->Unit = {}
) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .clickable { onRepoItemItemClicked() }
//            .padding(10.dp)
//            .background(MaterialTheme.colorScheme.surface),
//        shape = MaterialTheme.shapes.medium
//    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onRepoItemItemClicked() }
            .padding(10.dp)
            .background(color = MaterialTheme.colorScheme.surface,
                shape = MaterialTheme.shapes.medium)





    )

    {
        Image(
            painter = painterResource(repoUiModel.icon),
            contentDescription = null,
            modifier = Modifier.size(50.dp)
                .clip(RoundedCornerShape(20.dp))
                .padding(10.dp)
        )


        Column (modifier = Modifier.padding(8.dp)){
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {



                Text(
                    repoUiModel.title,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.width(200.dp))

                Text(
                    repoUiModel.stars,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(end = 6.dp)
                )
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = null

                )



            }

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                repoUiModel.owner,
                style = MaterialTheme.typography.bodyLarge,
                //modifier = Modifier.padding(start= 47.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                repoUiModel.description,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 100,
                overflow = TextOverflow.Ellipsis,
                //modifier = Modifier.padding(start = 45.dp, bottom = 10.dp)
            )


        }

    }


}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = PIXEL_7

)

@Composable
private fun PreviewReposItems() {
    RepoItems(repoUiModel = RepoUiModel(
        id = 1,
        title = "Kotlin",
        owner = "JetBrains",
        description = "The Kotlin Programming Language",
        stars = "46289",
        icon = R.drawable.kotlin
    ))

}