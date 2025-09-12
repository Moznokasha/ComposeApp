package com.example.composeapp.ui.screens.repo_list.repositories.reposData

import com.example.composeapp.R
import com.example.composeapp.ui.screens.repo_list.model.RepoUiModel

fun getRepos(): List <RepoUiModel>{
   return listOf(
       RepoUiModel(
           id = 1,
           title = "Less.J",
           owner = "Less",
           description = "Less. The dynamic stylesheet language.",
           stars = "16971",
           icon = R.drawable.less

       ),
       RepoUiModel(
           id = 2,
           title = "rust",
           owner = "rust-lang",
           description = "Empowering everyone to build reliable and efficient software.",
           stars = "87181",
           icon = R.drawable.rust

       ), RepoUiModel(
           id = 3,
           title = "ruby",
           owner = "ruby",
           description = "The ruby programming language.",
           stars = "20981",
           icon = R.drawable.ruby

       ), RepoUiModel(
           id = 4,
           title = "julia",
           owner = "juliaLang",
           description = "The julia programming language.",
           stars = "43541",
           icon = R.drawable.julia

       ), RepoUiModel(
           id = 5,
           title = "language",
           owner = "tolmasky",
           description = "A fast PEG parser written in JavaScript with first class errors.",
           stars = "411",
           icon = R.drawable.ic_launcher_foreground

       ),
       RepoUiModel(
           id = 6,
           title = "Kotlin",
           owner = "JetBrains",
           description = "The Kotlin Programming Language",
           stars = "46289",
           icon = R.drawable.kotlin

       )
    )
}