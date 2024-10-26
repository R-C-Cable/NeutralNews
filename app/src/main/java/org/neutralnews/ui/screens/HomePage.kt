package org.neutralnews.ui.screens

import Stories
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.neutralnews.di.ActivityLogger
import org.neutralnews.ui.screens.viewmodels.ArticlesViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomePage(
    navController: NavController,
    logger: ActivityLogger,
    viewModel: ArticlesViewModel = hiltViewModel()
) {
    val articles = viewModel.articles.collectAsState()
    val numSkeletonCards = calculateSkeletonCardCount()
    // Adding card modifiers here, so that they they are the same for both cards.
    val cardModifier = Modifier
        .padding(16.dp)
        .height(IntrinsicSize.Min)


    logger.log(ActivityLogger.Companion::class.java,"staring HomePage")
    LazyVerticalGrid(
        columns = GridCells.Adaptive(180.dp),
    ) {
        items(numSkeletonCards) { index ->
            if (index < articles.value.size) {
                ArticleCard(navController, cardModifier, articles.value[index])
            } else {
                SkeletonArticleCard(cardModifier)
            }
        }
    }
}

@Composable
fun ArticleCard(navController: NavController, modifier: Modifier, article: Stories) {
    Card(
        modifier = modifier
            .clickable { navController.navigate("ArticlePage/${article.id}") },
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column (modifier = Modifier.padding(16.dp)) {
            Text(text = article.title)
            Text(text = article.summary)
            Text(text = article.published_at)
        }
    }
}

@Composable
fun SkeletonArticleCard(modifiers: Modifier) {
    Card(
        modifier = modifiers,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray) // Simulate loading
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Simulate title, summary, and date with boxes
            Box(modifier = Modifier.fillMaxWidth().height(20.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Box(modifier = Modifier.fillMaxWidth().height(16.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Box(modifier = Modifier.fillMaxWidth().height(14.dp))
        }
    }
}

@Composable
fun calculateSkeletonCardCount(): Int {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val cardWidth = 180.dp // Approximate width of a card
    val numColumns = (screenWidth / cardWidth).toInt()
    val numRows = 5 // Approximate number of rows to fill the screen
    return numColumns * numRows
}