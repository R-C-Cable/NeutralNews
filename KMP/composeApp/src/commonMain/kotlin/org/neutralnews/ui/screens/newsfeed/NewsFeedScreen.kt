package org.neutralnews.ui.screens.newsfeed

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import org.neutralnews.data.articles.ArticlesRepository
import org.neutralnews.ui.components.StorySummaryCard
import org.neutralnews.ui.screens.articlereader.ArticleReaderScreen

class NewsFeedScreen : Screen {
    init {
        println("NewsFeedScreen")
    }


    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val viewModel: NewsFeedViewModel = remember { NewsFeedViewModel(ArticlesRepository()) }
        val articles = viewModel.articles.collectAsState()
        val isLoading = articles.value.isEmpty()


        LazyVerticalGrid(
            //TODO: Using GridCells.Adaptive is inaccurate.
            //      We should be using screen orientation.
            //      1 column for portrait, and 2 for landscape.
            columns = GridCells.Adaptive(minSize = 400.dp),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Show skeleton or actual items based on isLoading
            items(if (isLoading) 10 else articles.value.size) { index ->
                StorySummaryCard(
                    title = if (isLoading) "" else articles.value[index].title,
                    summary = if (isLoading) "" else articles.value[index].summary,
                    articleId = if (isLoading) 0 else articles.value[index].id
                ) { articleId ->
                    println("onClick of article with id articleId $articleId")
                    navigator?.push(ArticleReaderScreen(articleId)) ?: run {
                        println("ERROR: Failed to open Article due to null navigator.")
                    }
                }
            }
        }

        DisposableEffect(Unit) {
            onDispose {
                viewModel.clear()
            }
        }
    }
}