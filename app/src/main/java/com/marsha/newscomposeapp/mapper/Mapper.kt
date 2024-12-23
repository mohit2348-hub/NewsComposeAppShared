package com.marsha.newscomposeapp.mapper

import com.marsha.newscomposeapp.data.model.Article
import com.marsha.newscomposeapp.data.model.ArticleDTO


fun List<Article>.toDomain(): List<com.marsha.newscomposeapp.domain.model.Article> {
    return map {
        com.marsha.newscomposeapp.domain.model.Article(
            content = it.content ?: "",
            description = it.description ?: "",
            title = it.title ?: "",
            urlToImage = it.urlToImage ?: ""
        )
    }
}