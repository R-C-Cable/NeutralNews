package org.neutralnews.data.articles

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ArticlesRepository {
    fun getArticles(): Flow<List<Article>> = flow {
        delay(3_000)
        //TODO: Request data from server and cache in SglDelight database.
        emit(getMockArticles())
    }

    fun getArticleById(articleId: Double): Flow<Article> = flow {
        delay(3_000)
        //TODO: Request data from server and cache in SglDelight database.
        emit(getMockArticleById())
    }


    fun getMockArticleById(): Article {
        return Article(
            123.00,
            "Article Title",
            "This is a summary",
            "2024-11-09T03:17:00.648Z",
            "2024-11-09T03:17:00.648Z",
            listOf(
                Content(321.00, "Subtitle here", "This is some dummy text"),
                Content(321.00, "Subtitle here", "This is some dummy text")
            )
        )
    }


    fun getMockArticles(): List<Article> {
        println("getMockArticles")
        var listOfArticle = mutableListOf<Article>()

        for (i in 1..5) {
            listOfArticle.add(
                Article(
                    123.00,
                    "Article Title",
                    "This is a summary",
                    "2024-11-09T03:17:00.648Z",
                    "2024-11-09T03:17:00.648Z",
                    listOf(
                        Content(321.00, "Subtitle here", "This is some dummy text"),
                        Content(321.00, "Subtitle here", "This is some dummy text")
                    )
                )
            )
        }
        return listOfArticle
    }
}