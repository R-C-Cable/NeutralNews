package com.neutraltimes.today.articles.data.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode
import io.ktor.http.isSuccess


//TODO: This class needs to be moved, so it can be used by other data sources.
sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val statusCode: HttpStatusCode, val message: String? = null) : Result<Nothing>()
}

class ArticlesDataSource (private val httpClient: HttpClient) {
    private val baseUrl: String = "https://neutralnews.dev"


    suspend fun getArticles(): Result<List<ArticleDto>> {
        return try {
            val response = httpClient.get("$baseUrl/articles")
            if (response.status.isSuccess()) {
                //TODO: This is a testing log and should be removed
                println("getArticles response: $response")
                Result.Success(response.body())
            } else {
                //TODO: This should be replaced with some sort of remote monitoring logging system
                println("Error fetching articles: ${response.status}")
                Result.Error(response.status, "Failed to get articles")
            }
        } catch (e: Exception) {
            Result.Error(HttpStatusCode.InternalServerError, "An unexpected error occurred: ${e.message}")
        }
    }

    suspend fun getArticleById(articleId: Int): Result<ArticleDto> {
        return try {
            val response = httpClient.get("$baseUrl/articles/$articleId")

            if (response.status.isSuccess()) {
                //TODO: This is a testing log and should be removed
                println("getArticleById response: $response")
                Result.Success(response.body())
            } else {
                //TODO: This should be replaced with some sort of remote monitoring logging system
                println("Error fetching article with id: $articleId, and response code: ${response.status}")
                Result.Error(response.status, "Failed to get article with id: $articleId")
            }
        } catch (e: Exception) {
            Result.Error(HttpStatusCode.InternalServerError, "An unexpected error occurred: ${e.message}")
        }
    }
}