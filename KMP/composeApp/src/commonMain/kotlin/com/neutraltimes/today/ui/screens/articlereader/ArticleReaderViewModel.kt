package com.neutraltimes.today.ui.screens.articlereader

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.neutraltimes.today.domain.Article
import com.neutraltimes.today.domain.GetLatestNewsUseCase
import com.neutraltimes.today.ui.ViewModel
import org.koin.core.component.inject

class ArticleReaderViewModel(articleId: Int): ViewModel() {
    private val getLatestNewsUseCase: GetLatestNewsUseCase by inject()
    private val _article = mutableStateFlowOf(Article())
    val article: StateFlow<Article> = _article.asStateFlow()

    init {
        viewModelScope.launch {
            getLatestNewsUseCase.getArticleById(articleId)
                .collect { article ->
                    _article.value = article
                }
        }
    }
}