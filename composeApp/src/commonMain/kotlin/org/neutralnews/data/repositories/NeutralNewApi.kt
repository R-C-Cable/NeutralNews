package org.neutralnews.data.repositories

import Stories
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.delay
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

    suspend fun fetchStoryById(apidogResponseId: Int): List<Stories> {
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

    suspend fun fetchAllStory(): List<Stories> {
        // Test delay to simulate network call
        delay(2000)
        return Json.decodeFromString("[\n" +
                "    {\n" +
                "        \"id\": 704,\n" +
                "        \"title\": \"iste ab possimus\",\n" +
                "        \"summary\": \"ut sint esse dolore laboris\",\n" +
                "        \"published_at\": \"2024-08-11T12:04:52.768Z\",\n" +
                "        \"content\": [\n" +
                "            {\n" +
                "                \"id\": 301,\n" +
                "                \"sub_title\": \"occaecati eaque asperiores\",\n" +
                "                \"text\": \"ad Ut\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 359,\n" +
                "                \"sub_title\": \"assumenda illum consequatur\",\n" +
                "                \"text\": \"voluptate\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"sub_title\": \"eveniet doloremque eos\",\n" +
                "                \"text\": \"cillum eiusmod culpa proident labore\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 581,\n" +
                "        \"title\": \"consectetur tempora vel\",\n" +
                "        \"summary\": \"et nisi eiusmod quis\",\n" +
                "        \"published_at\": \"2024-08-10T16:52:57.201Z\",\n" +
                "        \"content\": [\n" +
                "            {\n" +
                "                \"id\": 364,\n" +
                "                \"sub_title\": \"voluptate velit soluta\",\n" +
                "                \"text\": \"Lorem\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 8,\n" +
                "                \"sub_title\": \"veritatis culpa quo\",\n" +
                "                \"text\": \"sed exercitation\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 32,\n" +
                "        \"title\": \"enim animi recusandae\",\n" +
                "        \"summary\": \"voluptate ut non\",\n" +
                "        \"published_at\": \"2024-08-11T05:02:26.579Z\",\n" +
                "        \"content\": [\n" +
                "            {\n" +
                "                \"id\": 883,\n" +
                "                \"sub_title\": \"sequi facere praesentium\",\n" +
                "                \"text\": \"tempor esse\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]")
    }
}