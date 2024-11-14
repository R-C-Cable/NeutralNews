package org.neutralnews

import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.neutralnews.data.articles.articlesModule
import org.neutralnews.data.articles.networkModule

import org.neutralnews.ui.screens.newsfeed.NewsFeedScreen

@Composable
@Preview
fun App() {
    startKoin {
        modules(
            networkModule,
            articlesModule
        )
    }
    Navigator(NewsFeedScreen())
}
