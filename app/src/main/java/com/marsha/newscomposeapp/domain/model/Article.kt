package com.marsha.newscomposeapp.domain.model

import com.marsha.newscomposeapp.data.model.Source

data class Article(
    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
