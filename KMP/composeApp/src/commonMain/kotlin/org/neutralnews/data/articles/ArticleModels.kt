package org.neutralnews.data.articles

import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val id: Double,
    val title: String,
    val summary: String,
    val created_at: String,
    val updated_at: String,
    val content: List<Content>
)

@Serializable
data class Content(
    val id: Double,
    val sub_title: String,
    val text: String
)