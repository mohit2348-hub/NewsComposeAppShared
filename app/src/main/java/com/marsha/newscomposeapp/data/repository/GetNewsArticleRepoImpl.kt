package com.marsha.newscomposeapp.data.repository

import com.marsha.newscomposeapp.data.network.ApiService
import com.marsha.newscomposeapp.domain.model.Article
import com.marsha.newscomposeapp.domain.repository.GetNewsArticleRepo
import com.marsha.newscomposeapp.mapper.toDomain
import com.marsha.newscomposeapp.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService:ApiService):GetNewsArticleRepo,SafeApiRequest() {
    override suspend fun getNewsArticle(): List<Article> {
val response =safeApiRequest { apiService.getNewsArticle() }
        return response.articles.toDomain()!!
    }
}