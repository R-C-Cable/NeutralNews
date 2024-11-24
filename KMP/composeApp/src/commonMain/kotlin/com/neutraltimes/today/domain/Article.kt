package com.neutraltimes.today.domain

data class Article(
    val id: Int,
    val title: String,
    val summary: String,
    val date: String,
    val content: String,
    val sources: String
) {
    constructor() : this(0, "/n", "/n", "", "", "")
}