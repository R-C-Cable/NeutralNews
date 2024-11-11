package org.neutralnews.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/neutralnews/data/NewsRepository;", "", "newsApi", "Lorg/neutralnews/data/NewsDataSource;", "(Lorg/neutralnews/data/NewsDataSource;)V", "getNewsArticleById", "Lkotlinx/coroutines/flow/Flow;", "", "LStories;", "id", "", "getNewsArticles", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private final org.neutralnews.data.NewsDataSource newsApi = null;
    
    @javax.inject.Inject()
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    org.neutralnews.data.NewsDataSource newsApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<Stories>> getNewsArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<Stories>> getNewsArticleById(int id) {
        return null;
    }
}