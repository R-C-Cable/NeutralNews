package org.neutralnews.ui

import Stories
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.neutralnews.data.repositories.NeutralNewApi
import org.neutralnews.LogLevel

class HomeScreenViewModel {
    private val apiClient = NeutralNewApi()
    private val myScope = CoroutineScope(SupervisorJob() + Dispatchers.Unconfined)

    private val _stories = MutableStateFlow<List<Stories>>(emptyList())
    val stories: StateFlow<List<Stories>> = _stories.asStateFlow()

    init {

    }

    fun updateStories() {
        myScope.launch {
            val response = apiClient.fetchAllStory()
            println(LogLevel.DEBUG.name + "Response Length:" + response.size)
            println(LogLevel.DEBUG.name + "Response: $response")
            _stories.value = response
        }
    }


}