package com.neutraltimes.today.articles.data.articles

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

//Repository should be the Interface to the DataLayer.
class ArticlesRepository : KoinComponent {

    private val articlesDataSource: ArticlesDataSource by inject()

    init {
        getArticles()
    }

    fun getArticles(): Flow<List<Article>> = flow {
       val articles : List<Article> = articlesDataSource.getArticles()
        //TODO: Request data from server and cache in SglDelight database.
        emit(articles)
    }

    fun getArticleById(articleId: Int): Flow<Article> = flow {
        val article : Article = articlesDataSource.getArticleById(articleId);
        delay(3_000)
        //TODO: Request data from server and cache in SglDelight database.
        emit(article)
    }
}