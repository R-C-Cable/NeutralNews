package org.neutralnews.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005H\u0007\u001a\b\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"ArticleCard", "", "navController", "Landroidx/navigation/NavController;", "modifier", "Landroidx/compose/ui/Modifier;", "article", "LStories;", "HomePage", "logger", "Lorg/neutralnews/di/ActivityLogger;", "viewModel", "Lorg/neutralnews/ui/screens/viewmodels/ArticlesViewModel;", "SkeletonArticleCard", "modifiers", "calculateSkeletonCardCount", "", "app_debug"})
public final class HomePageKt {
    
    @androidx.compose.runtime.Composable()
    public static final void HomePage(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    org.neutralnews.di.ActivityLogger logger, @org.jetbrains.annotations.NotNull()
    org.neutralnews.ui.screens.viewmodels.ArticlesViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ArticleCard(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    Stories article) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SkeletonArticleCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifiers) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final int calculateSkeletonCardCount() {
        return 0;
    }
}