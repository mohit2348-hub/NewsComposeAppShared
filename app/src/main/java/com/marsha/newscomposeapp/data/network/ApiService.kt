package com.marsha.newscomposeapp.data.network

import com.marsha.newscomposeapp.data.model.ArticleDTO
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=1753a63a05014e1095112357e80a6af7

    @GET("top-headlines")
    suspend fun getNewsArticle( @Query("country") country:String="us",
                                @Query("category") category:String="business",
                                @Query("apiKey") apiKey:String="1753a63a05014e1095112357e80a6af7"
    ):retrofit2.Response<ArticleDTO>
}