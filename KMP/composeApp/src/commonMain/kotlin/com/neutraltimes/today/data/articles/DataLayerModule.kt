package com.neutraltimes.today.data.articles

import io.ktor.client.*
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import com.neutraltimes.today.createHttpClientEngine

val networkModule = module {
    single {
        HttpClient(createHttpClientEngine()) {
            install(ContentNegotiation) {
                json(
                    Json {
                        ignoreUnknownKeys = true
                })
            }
            install(HttpTimeout) {
                requestTimeoutMillis = 30000 // 30 seconds
                connectTimeoutMillis = 10000 // 10 seconds
                socketTimeoutMillis = 10000  // 10 seconds
            }
        }
    }
}

val articlesModule = module {
    single { ArticlesRepository(articlesDataSource = get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
}