package com.example.composeapp.ui.screens.repoDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.composeapp.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices.PIXEL_7
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.screens.repoDetails.components.RepoDetailsItem
import com.example.composeapp.ui.theme.ComposeAppTheme

@Composable
fun RepoDetailsContent(innerPadding: PaddingValues
//                       = modifier: Modifier = Modifier
                       ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(4.dp)
            .background(Color(0xFFE0E0E0)),
        horizontalAlignment = Alignment.CenterHorizontally




    ){
        Image(
            painter = painterResource(R.drawable.google),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Language",
            style = MaterialTheme.typography.headlineSmall,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Row(
            modifier = Modifier.padding(top = 12.dp),

        ) {
            RepoDetailsItem(
                "1525",
                R.drawable.star
            )

            Spacer(modifier = Modifier.width(16.dp))
            RepoDetailsItem(
                "Python",
                R.drawable.blue
            )
           Spacer(modifier = Modifier.width(16.dp))
//          Row(
//              verticalAlignment = Alignment.CenterVertically
//          ) {
//              Text(
//                  text = "Python",
//                  style = MaterialTheme.typography.bodySmall
//              )
//
//              Box(
//                  modifier = Modifier.clip(CircleShape)
//                      .size(20.dp)
//                      .background(MaterialTheme.colorScheme.secondary)
//                      .padding(start = 4.dp)
//              )
//          }

            RepoDetailsItem(
                "347",
                R.drawable.fork
            )

        }
        Text(
            text = "Shared repository for open-sourced projects from the Google AI Language team. ",
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 100,
            overflow = TextOverflow.Ellipsis

            )
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )) {
            Text(
                text = "Show Issues",
                style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.onSecondary)
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
fun PreviewRepoDetailsContent () {
    ComposeAppTheme {
        RepoDetailsContent(innerPadding = PaddingValues(0.dp))
    }
    
}