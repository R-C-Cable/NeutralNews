package com.neutraltimes.today.articles.data.articles

import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val id: Int,
    val title: String,
    val summary: String,
    val created_at: String,
    val updated_at: String,
    val content: String,
    val sources: String
) {
    constructor() : this(0, "", "", "", "", "", "")
}

