package com.neutraltimes.today.articles.data.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesDataSource (private val httpClient: HttpClient) {

    suspend fun getArticles(): List<Article> {
        return httpClient.get("https://neutralnews.dev/articles").body()
    }

    suspend fun getArticleById(articleId: Int): Article {
        return httpClient.get("https://neutralnews.dev/articles/$articleId").body()
    }
}