package com.marsha.newscomposeapp.domain.use_case

import com.marsha.newscomposeapp.domain.model.Article
import com.marsha.newscomposeapp.domain.repository.GetNewsArticleRepo
import com.marsha.newscomposeapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading(""))
         try {
             emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))
        } catch (e:Exception) {
            emit(Resource.Error(e.message))
        }
    }
}