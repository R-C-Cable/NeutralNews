package org.neutralnews.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import org.neutralnews.di.ActivityLogger
import org.neutralnews.ui.screens.viewmodels.ArticlesViewModel

@Composable
fun ArticlePage(navController: NavController,
                articleId: String,
                logger: ActivityLogger,
                viewModel: ArticlesViewModel = hiltViewModel()
) {
    val article by viewModel.article.collectAsState()

    LaunchedEffect(articleId) {
        viewModel.getArticleById(articleId.toIntOrNull() ?: 0)
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Log.d("ArticlePage", "Rendering ArticlePage Column")

        article?.let {
            Log.d("ArticlePage", "it string$it")
            Text(
                it.title,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            it.content.forEach { content ->
                Text(
                    content.sub_title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Text(content.text, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(4.dp)) // Add space between content items
            }
        } ?: run {
            Log.d("ArticlePage", "Article is null")
        }
    }
}