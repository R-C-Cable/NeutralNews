package com.neutraltimes.today.domain

import com.neutraltimes.today.data.articles.ArticleDto
import com.neutraltimes.today.data.articles.ArticlesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetLatestNewsUseCase(
    private val formatDataUseCase: FormatDataUseCase,
    private val articlesRepository: ArticlesRepository
) {

    fun getArticles(): Flow<List<Article>> =
        articlesRepository.getArticles()
            .map { articlesDtos ->
                articlesDtos.map { articleDto ->
                    articleDtoToArticle(articleDto)
                }
            }

    fun getArticleById(articleId: Int): Flow<Article> =
        articlesRepository.getArticleById(articleId).map { articleDto ->
            articleDtoToArticle(articleDto)
        }

    private fun articleDtoToArticle(articleDto: ArticleDto): Article {
        return Article(
            id = articleDto.id,
            title = articleDto.title,
            summary = articleDto.summary,
            date = formatDataUseCase.formatDate(articleDto.updated_at),
            content = articleDto.content,
            sources = articleDto.sources
        )
    }
}