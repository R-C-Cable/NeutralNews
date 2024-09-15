package org.neutralnews.data.repositories

import Stories
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class NeutralNewApi {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun fetchData(apidogResponseId: Int): List<Stories> {
//        return client.get("https://127.0.0.1:3658/stories") {
//            parameter("apiKey", apidogResponseId)
//        }.body()

        return Json.decodeFromString("[{\"id\":-31302257.560580492,\"title\":\"ex quasi fugiat\",\"summary\":\"minim Duis sed\",\"published_at\":\"2024-09-15T01:31:56.744Z\",\"content\":[{\"id\":60423409.83435753,\"sub_title\":\"impedit id nobis\",\"text\":\"qui sed elit\"},{\"id\":-7831848.184455484,\"sub_title\":\"deserunt odio possimus\",\"text\":\"aliquip est eiusmod deserunt Excepteur\"},{\"id\":23702024.53644778,\"sub_title\":\"nulla aspernatur illum\",\"text\":\"reprehenderit dolor Lorem\"}]}]")
    }

//    suspend fun fetchData(apidogResponseId: Int): List<Stories> {
//        return client.get("http://127.0.0.1:3658/m2/628863-596787-default/9256935") {
//            parameter("apidogResponseId", apidogResponseId)
//        }.body()
//    }
}