package com.example.composeapp.screens.repoDetails.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.theme.ComposeAppTheme
import com.example.composeapp.R

@Composable
fun RepoDetailsItem(title: String, @DrawableRes icon: Int) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(4.dp)
        )

        Image(
            painter = painterResource(icon),
            contentDescription = null
        )
    }
}

@Preview
@Composable
private fun PreviewRepoDetailsItem() {
    ComposeAppTheme {
        RepoDetailsItem("", R.drawable.fork)
    }

}