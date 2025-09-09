package com.example.composeapp.screens.repositories.reposData

import androidx.annotation.DrawableRes

data class Repos(
    val title: String,
    val owner: String,
    val description: String,
    val stars: String,
    @DrawableRes val icon: Int
)