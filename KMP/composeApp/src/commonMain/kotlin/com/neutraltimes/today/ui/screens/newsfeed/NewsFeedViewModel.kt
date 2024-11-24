package com.neutraltimes.today.ui.screens.newsfeed

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.neutraltimes.today.domain.Article
import com.neutraltimes.today.domain.GetLatestNewsUseCase
import com.neutraltimes.today.ui.ViewModel
import org.koin.core.component.inject

class NewsFeedViewModel : ViewModel()  {
    private val getLatestNewsUseCase: GetLatestNewsUseCase by inject()
    private val _articles = mutableStateFlowOf<List<Article>>(emptyList())
    val articles: StateFlow<List<Article>> = _articles.asStateFlow()

    init {
        println("NewsFeedViewModel.init")
        viewModelScope.launch {
            getLatestNewsUseCase.getArticles()
                .collect { articles ->
                    _articles.value = articles
                }
        }
    }
}