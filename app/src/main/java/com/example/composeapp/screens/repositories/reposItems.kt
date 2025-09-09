package com.example.composeapp.screens.repositories

import android.widget.AdapterView
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices.PIXEL_7
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.screens.repositories.reposData.Repos

@Composable
fun ReposItems(repos: Repos, onItemClick: (Repos)->Unit = {}) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(repos) }
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary)
    ) {
        Column {
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(repos.icon),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .padding(10.dp)
                )


                Text(
                    repos.title,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.width(200.dp))

                Text(
                    repos.stars,
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
                repos.owner,
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(start= 47.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                repos.description,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 100,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 45.dp, bottom = 10.dp)
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
    ReposItems(repos = Repos(
        title = "Kotlin",
        owner = "JetBrains",
        description = "The Kotlin Programming Language",
        stars = "46289",
        icon = R.drawable.kotlin
    ))

}