package com.neutraltimes.today.ui.screens.articlereader

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.neutraltimes.today.articles.data.articles.Article
import com.neutraltimes.today.articles.data.articles.ArticlesRepository
import com.neutraltimes.today.ui.ViewModel

class ArticleReaderViewModel(articleId: Int): ViewModel() {
    private val repository = ArticlesRepository()
    private val _article = mutableStateFlowOf(Article())
    val article: StateFlow<Article> = _article.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getArticleById(articleId)
                .collect { article ->
                    _article.value = article
                }
        }
    }
}