package com.neutraltimes.today.ui.screens.articlereader

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

class ArticleReaderScreen(private val articleId: Int) : Screen {
    @Composable
    override fun Content() {
        val viewModel: ArticleReaderViewModel =
            remember { ArticleReaderViewModel(articleId) } // Pass articleId
        val article by viewModel.article.collectAsState()
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(20.dp)
                .verticalScroll(scrollState)
        ) {
            Text(
                text = article.title,
                style = MaterialTheme.typography.headlineLarge,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
                    .padding(bottom = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = article.content,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = article.sources,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
    }
}