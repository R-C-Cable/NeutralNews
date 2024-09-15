package org.neutralnews

interface Platform {
    val name: String
}

enum class LogLevel {
    VERBOSE, DEBUG, INFO, WARN, ERROR
}

expect fun getPlatform(): Platform