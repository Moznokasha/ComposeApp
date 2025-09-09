package com.example.composeapp.screens.repositories.reposData

import com.example.composeapp.R

fun getRepos(): List <Repos>{
   return listOf(
       Repos(
           title = "Less.J",
           owner = "Less",
           description = "Less. The dynamic stylesheet language.",
           stars = "16971",
           icon = R.drawable.less

       ),
       Repos(
           title = "rust",
           owner = "rust-lang",
           description = "Empowering everyone to build reliable and efficient software.",
           stars = "87181",
           icon = R.drawable.rust

       ), Repos(
           title = "ruby",
           owner = "ruby",
           description = "The ruby programming language.",
           stars = "20981",
           icon = R.drawable.ruby

       ), Repos(
           title = "julia",
           owner = "juliaLang",
           description = "The julia programming language.",
           stars = "43541",
           icon = R.drawable.julia

       ), Repos(
           title = "language",
           owner = "tolmasky",
           description = "A fast PEG parser written in JavaScript with first class errors.",
           stars = "411",
           icon = R.drawable.ic_launcher_foreground

       ),
       Repos(
           title = "Kotlin",
           owner = "JetBrains",
           description = "The Kotlin Programming Language",
           stars = "46289",
           icon = R.drawable.kotlin

       )
    )
}