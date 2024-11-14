package org.neutralnews.data.articles

import io.ktor.client.HttpClient
import kotlinx.coroutines.delay
import kotlinx.serialization.json.Json

class ArticlesDataSource (private val httpClient: HttpClient) {
    val mockArticlesJson = """
[
  {
    "id": 123.0,
    "title": "Article Title 1",
    "summary": "This is a summary 1",
    "created_at": "2024-11-09T03:17:00.648Z",
    "updated_at": "2024-11-09T03:17:00.648Z",
    "content": [
      {
        "id": 321.0,
        "sub_title": "Subtitle here 1",
        "text": "This is some dummy text 1"
      },
      {
        "id": 322.0,
        "sub_title": "Subtitle here 2",
        "text": "This is some dummy text 2"
      }
    ]
  },
  {
    "id": 456.0,
    "title": "Article Title 2",
    "summary": "This is a summary 2",
    "created_at": "2024-11-10T08:22:00.123Z",
    "updated_at": "2024-11-10T08:22:00.123Z",
    "content": [
      {
        "id": 678.0,
        "sub_title": "Subtitle here 3",
        "text": "This is some dummy text 3"
      }
    ]
  }
]
"""


    val mockArticleJson = """
{
  "id": 123.0,
  "title": "Article Title",
  "summary": "This is a summary",
  "created_at": "2024-11-09T03:17:00.648Z",
  "updated_at": "2024-11-09T03:17:00.648Z",
  "content": [
    {
      "id": 321.0,
      "sub_title": "Subtitle here",
      "text": "This is some dummy text"
    },
    {
      "id": 322.0,
      "sub_title": "Another subtitle",
      "text": "More dummy text" 
    }
  ]
}
"""


    suspend fun getArticles(): List<Article> {
        // mock a network query.
        delay(3_000)
        return Json.decodeFromString<List<Article>>(mockArticlesJson)

        //return httpClient.get("YOUR_API_ENDPOINT").body()
    }

    suspend fun getArticleById(articleId: Double): Article {
        // mock a network query.
        delay(3_000)
        return Json.decodeFromString<Article>(mockArticleJson)

        //return httpClient.get("YOUR_API_ENDPOINT").body()
    }
}