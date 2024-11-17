package com.neutraltimes.today

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import com.neutraltimes.today.articles.data.articles.articlesModule
import com.neutraltimes.today.articles.data.articles.networkModule
import com.neutraltimes.today.ui.components.ScreenTopBar

import com.neutraltimes.today.ui.screens.newsfeed.NewsFeedScreen

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

    Navigator(NewsFeedScreen()) { navigator ->
        Scaffold(topBar = { ScreenTopBar() }) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                navigator.lastItem.Content()
            }
        }
    }
}
