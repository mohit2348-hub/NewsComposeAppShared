package com.marsha.newscomposeapp.presentation

import com.marsha.newscomposeapp.domain.model.Article

data class HomeStateHolder(
    val isLoading:Boolean=false,
    val dataList:List<Article>?=null,
    val error:String=""


)
