package org.neutralnews.ui.screens.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/neutralnews/ui/screens/viewmodels/ArticlesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lorg/neutralnews/data/NewsRepository;", "(Lorg/neutralnews/data/NewsRepository;)V", "_articles", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "LStories;", "articles", "Lkotlinx/coroutines/flow/StateFlow;", "getArticles", "()Lkotlinx/coroutines/flow/StateFlow;", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ArticlesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.neutralnews.data.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<Stories>> _articles = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<Stories>> articles = null;
    
    @javax.inject.Inject()
    public ArticlesViewModel(@org.neutralnews.data.AuthorizedAccess()
    @org.jetbrains.annotations.NotNull()
    org.neutralnews.data.NewsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<Stories>> getArticles() {
        return null;
    }
}