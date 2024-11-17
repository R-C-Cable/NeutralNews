package org.neutralnews.ui.screens.articlereader

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.neutralnews.data.articles.Article
import org.neutralnews.data.articles.ArticlesRepository
import org.neutralnews.ui.ViewModel

class ArticleReaderViewModel(articleId: Int): ViewModel() {
    private val repository = ArticlesRepository()
    private val _article = mutableStateFlowOf(Article())
    val article: StateFlow<Article> = _article.asStateFlow()

    init {
        viewModelScope.launch {
            println("repository.getArticles()")
            repository.getArticleById(articleId)
                .collect { article ->
                    _article.value = article
                }
        }
    }
}