package com.neutraltimes.today.ui.components

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenTopBar() {
    val navigator = LocalNavigator.currentOrThrow

    CenterAlignedTopAppBar(
        title = {
            Text(
                "Neutral Times",
                color = MaterialTheme.colorScheme.onSecondary
            )
        }, // Fixed title
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.secondary),
        navigationIcon = {
            // Show back button only if there's a screen to pop
            if (navigator.canPop) {
                IconButton(
                    onClick = { navigator.pop() },
                    colors = IconButtonDefaults.iconButtonColors(
                        contentColor = MaterialTheme.colorScheme.onSecondary
                    )
                ) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        }
    )
}