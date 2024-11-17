package com.neutraltimes.today

import io.ktor.client.engine.HttpClientEngine

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun createHttpClientEngine(): HttpClientEngine