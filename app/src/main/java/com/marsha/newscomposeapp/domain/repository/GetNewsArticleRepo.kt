package com.marsha.newscomposeapp.domain.repository

import com.marsha.newscomposeapp.domain.model.Article

interface GetNewsArticleRepo {
    suspend fun getNewsArticle():List<Article>
}