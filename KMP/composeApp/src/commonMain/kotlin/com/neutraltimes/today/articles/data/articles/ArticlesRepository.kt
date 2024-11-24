package com.neutraltimes.today.articles.data.articles

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ArticlesRepository(private val articlesDataSource: ArticlesDataSource) {

    fun getArticles(): Flow<List<ArticleDto>> = flow {
        println("getArticles called")
        when (val result: Result<List<ArticleDto>> = articlesDataSource.getArticles()) {
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

    fun getArticleById(articleId: Int): Flow<ArticleDto> = flow {
        println("getArticleById called")
        when (val result: Result<ArticleDto> = articlesDataSource.getArticleById(articleId)) {
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