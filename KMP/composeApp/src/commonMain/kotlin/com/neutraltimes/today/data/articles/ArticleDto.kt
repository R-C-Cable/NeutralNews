package com.neutraltimes.today.data.articles

import kotlinx.serialization.Serializable

@Serializable
data class ArticleDto(
    val id: Int,
    val title: String,
    val summary: String,
    val created_at: String,
    val updated_at: String,
    val content: String,
    val sources: String
) {
    constructor() : this(0, "/n", "/n", "", "", "", "")
}

