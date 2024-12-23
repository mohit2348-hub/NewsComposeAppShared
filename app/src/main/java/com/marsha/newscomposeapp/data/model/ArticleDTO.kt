package com.marsha.newscomposeapp.data.model

data class ArticleDTO(
    val articles: List<Article>,
    val status: String?,
    val totalResults: Int?
)