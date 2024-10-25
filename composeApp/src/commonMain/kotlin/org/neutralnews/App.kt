package org.neutralnews

import Stories
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

import org.neutralnews.ui.HomeScreenViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                HomeScreenContent();
            }
        }
    }
}

@Composable
fun HomeScreenContent() {
    val viewModel = remember { HomeScreenViewModel() }
    LaunchedEffect(viewModel) { // Fetch stories when the composable enters the composition
        viewModel.updateStories()
    }

    val stories by viewModel.stories.collectAsState()

    LazyVerticalGrid(
        columns = GridCells.Adaptive(180.dp),
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(stories) { story ->
            StoryCard(story)
        }
    }
}

@Composable
fun StoryCard(story: Stories) {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Display story details here (e.g., title, image, description)
            Text(text = story.title, style = MaterialTheme.typography.h6)
            Text(text = story.summary, style = MaterialTheme.typography.body1)
            // ... other composables to display story information ...
        }
    }
}
