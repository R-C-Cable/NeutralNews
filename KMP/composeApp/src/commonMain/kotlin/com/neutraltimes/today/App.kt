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
import com.neutraltimes.today.domain.di.domainDiModule
import com.neutraltimes.today.ui.components.ScreenTopBar

import com.neutraltimes.today.ui.screens.newsfeed.NewsFeedScreen
import org.koin.core.component.KoinComponent

object App: KoinComponent {
    init {
        startKoin {
            modules(
                networkModule,
                articlesModule,
                domainDiModule
            )
        }
    }
}

@Composable
@Preview
fun App() {
    App // Access the App Koin Component to trigger the singleton init block.

    Navigator(NewsFeedScreen()) { navigator ->
        Scaffold(topBar = { ScreenTopBar() }) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                navigator.lastItem.Content()
            }
        }
    }
}
