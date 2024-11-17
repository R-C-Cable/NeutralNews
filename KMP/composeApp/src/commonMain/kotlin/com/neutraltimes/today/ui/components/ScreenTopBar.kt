package com.neutraltimes.today.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenTopBar() {
    val navigator = LocalNavigator.currentOrThrow

    CenterAlignedTopAppBar(
        title = { Text("Neutral News") }, // Fixed title
        navigationIcon = {
            // Show back button only if there's a screen to pop
            if (navigator.canPop) {
                IconButton(onClick = { navigator.pop() }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        }
    )
}