package com.example.composeapp.ui.screens.repo_list.model

import androidx.annotation.DrawableRes

data class RepoUiModel(
    val id: Int,
    val title: String,
    val owner: String,
    val description: String,
    val stars: String,
    @DrawableRes val icon: Int
)