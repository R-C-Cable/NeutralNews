package com.neutraltimes.today.articles.data.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.isSuccess

class ArticlesDataSource (private val httpClient: HttpClient) {

    suspend fun getArticles(): List<Article> {
         val response = httpClient.get("https://neutralnews.dev/articles")

        if (!response.status.isSuccess()) {
            println("Error fetching articles: ${response.status}")
        } else {
            // This is a testing log and should be removed
            println("getArticles response: $response")
        }

        return response.body()
    }

    suspend fun getArticleById(articleId: Int): Article {
        val response = httpClient.get("https://neutralnews.dev/articles/$articleId")

        if (!response.status.isSuccess()) {
            println("Error fetching articles: ${response.status}")
        } else {
            // This is a testing log and should be removed
            println("getArticleById response: $response")
        }

        return response.body()
    }
}