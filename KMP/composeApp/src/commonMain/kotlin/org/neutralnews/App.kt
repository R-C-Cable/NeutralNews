package org.neutralnews

import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview

import org.neutralnews.ui.screens.newsfeed.NewsFeedScreen

@Composable
@Preview
fun App() {
    Navigator(NewsFeedScreen())
}
