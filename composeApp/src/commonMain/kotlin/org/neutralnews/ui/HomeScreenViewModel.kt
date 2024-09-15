package org.neutralnews.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.neutralnews.Platform
import org.neutralnews.data.repositories.NeutralNewApi
import org.neutralnews.LogLevel

class HomeScreenViewModel {
    private val apiClient = NeutralNewApi()
    private val myScope = CoroutineScope(SupervisorJob() + Dispatchers.Unconfined)

    init {
        myScope.launch {
            val response = apiClient.fetchData(2626174)
            println(LogLevel.DEBUG.name + "Response Length:" + response.size)
            println(LogLevel.DEBUG.name + "Response: $response")
            // ... process the response
        }
    }
}