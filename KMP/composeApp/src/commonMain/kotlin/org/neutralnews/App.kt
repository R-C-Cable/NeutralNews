package org.neutralnews

import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.neutralnews.data.articles.articlesModule
import org.neutralnews.data.articles.networkModule

import org.neutralnews.ui.screens.newsfeed.NewsFeedScreen

//TODO implement a proper solution.
// We should not need this boolean.
var koinInitialized = false;

@Composable
@Preview
fun App() {
    if (!koinInitialized) {
        startKoin {
            modules(
                networkModule,
                articlesModule
            )
        }
        koinInitialized = true;
    }
    Navigator(NewsFeedScreen())
}
