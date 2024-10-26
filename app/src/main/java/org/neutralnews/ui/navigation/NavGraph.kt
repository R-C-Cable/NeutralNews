package org.neutralnews.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.neutralnews.di.ActivityLogger
import org.neutralnews.ui.screens.ArticlePage
import org.neutralnews.ui.screens.HomePage

@Composable
fun NavGraph(logger: ActivityLogger) {
    val navController = rememberNavController()

    Scaffold(
        topBar = { TopBar(navController) }
    ) { innerPadding ->
        run {
            NavHost(
                navController = navController,
                startDestination = "HomePage",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("HomePage") {
                    HomePage(navController, logger)
                }
                composable(
                    route = "ArticlePage/{articleId}",
                    arguments = listOf(navArgument("articleId") { type = NavType.StringType })
                ) { backStackEntry ->
                    ArticlePage(
                        navController,
                        backStackEntry.arguments?.getString("articleId") ?: "",
                        logger
                    )
                }
            }
        }
    }
}