package org.neutralnews.data

import Stories
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsApi: NewsDataSource) {

    fun getNewsArticles(): Flow<List<Stories>> = flow {
        emit(newsApi.fetchAllArticles())
    }

    fun getNewsArticleById(id: Int): Flow<List<Stories>> = flow {
        emit(newsApi.fetchArticleById(id))
    }
}