package org.neutralnews.ui.screens.viewmodels

import Stories
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import org.neutralnews.data.AuthorizedAccess
import org.neutralnews.data.NewsRepository
import javax.inject.Inject

@HiltViewModel
class ArticlesViewModel @Inject constructor(
    @AuthorizedAccess private val repository: NewsRepository
) : ViewModel() {

    private val _articles = MutableStateFlow<List<Stories>>(emptyList())
    val articles: StateFlow<List<Stories>> = _articles.asStateFlow()

    private val _article = MutableStateFlow<Stories?>(null)
    val article: StateFlow<Stories?> = _article.asStateFlow()

    init {
        viewModelScope.launch {
            Log.d("ArticlesViewModel", "Fetching articles...")
            repository.getNewsArticles()
                .flowOn(Dispatchers.IO)
                .catch { e ->
                    println("Error fetching articles: ${e.message}")
                }
                .collect { articles ->
                    Log.d("ArticlesViewModel", "Received ${articles.size} articles")
                    _articles.value = articles
                }
        }
    }

    fun getArticleById(articleId: Int) {
        Log.d("ArticlesViewModel", "Fetching article with ID: $articleId")
        viewModelScope.launch {
            repository.getNewsArticleById(articleId)
                .flowOn(Dispatchers.IO)
                .catch { e ->
                    println("Error fetching article: ${e.message}")
                }
                .collect { articles ->
                    if (articles.isNotEmpty()) {
                        _article.value = articles[0]
                    }
                }
        }
    }
}