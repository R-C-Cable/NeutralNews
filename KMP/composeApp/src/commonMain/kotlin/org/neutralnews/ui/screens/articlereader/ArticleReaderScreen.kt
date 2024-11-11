package org.neutralnews.ui.screens.articlereader

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import cafe.adriel.voyager.core.screen.Screen

class ArticleReaderScreen(private val articleId: Double) : Screen {
    @Composable
    override fun Content() {
        val viewModel: ArticleReaderViewModel = remember { ArticleReaderViewModel(articleId) } // Pass articleId
        val article by viewModel.article.collectAsState()

            Column {
                Text(
                    text = article.title,
                    style = MaterialTheme.typography.headlineLarge
                )
                article.content.forEach { content ->
                    Text(
                        text = content.sub_title,
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Text(
                        text = content.text,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
    }
}