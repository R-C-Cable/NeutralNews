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
        when (val result: Result<List<Article>> = articlesDataSource.getArticles()) {
            is Result.Success -> {
                //TODO: Request data from server and cache in SglDelight database.
                emit(result.data)
            }
            is Result.Error -> {
                //TODO: Pass error up to UI to display.
                println("Error: ${result.statusCode}, ${result.message}")
            }
        }
    }

    fun getArticleById(articleId: Int): Flow<Article> = flow {
        when (val result: Result<Article> = articlesDataSource.getArticleById(articleId)) {
            is Result.Success -> {
                emit(result.data)
            }
            is Result.Error -> {
                //TODO: Pass error up to UI to display.
                println("Error: ${result.statusCode}, ${result.message}")
            }
        }
    }
}