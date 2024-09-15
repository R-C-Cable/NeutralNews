package org.neutralnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform