package com.marsha.newscomposeapp.domain.di

import com.marsha.newscomposeapp.data.network.ApiService
import com.marsha.newscomposeapp.data.repository.GetNewsArticleRepoImpl
import com.marsha.newscomposeapp.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    @Provides
    fun providesGetNewsRepo(apiService: ApiService): GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService)
    }

}