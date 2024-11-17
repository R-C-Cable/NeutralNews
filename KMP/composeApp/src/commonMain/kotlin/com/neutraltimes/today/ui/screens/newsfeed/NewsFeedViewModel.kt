package com.neutraltimes.today.ui.screens.newsfeed

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.neutraltimes.today.articles.data.articles.Article
import com.neutraltimes.today.articles.data.articles.ArticlesRepository
import com.neutraltimes.today.ui.ViewModel

class NewsFeedViewModel(private val repository: ArticlesRepository) : ViewModel()  {
    private val _articles = mutableStateFlowOf<List<Article>>(emptyList())
    val articles: StateFlow<List<Article>> = _articles.asStateFlow()

    init {
        viewModelScope.launch {
            println("repository.getArticles()")
            repository.getArticles()
                .collect { articles ->
                    _articles.value = articles
                }
        }
    }
}