package org.neutralnews.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@\u00a2\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0080@\u00a2\u0006\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/neutralnews/data/NewsDataSource;", "", "()V", "client", "Lio/ktor/client/HttpClient;", "fetchAllArticles", "", "LStories;", "fetchAllArticles$app_debug", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchArticleById", "apidogResponseId", "", "fetchArticleById$app_debug", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsDataSource {
    @org.jetbrains.annotations.NotNull()
    private final io.ktor.client.HttpClient client = null;
    
    @javax.inject.Inject()
    public NewsDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchArticleById$app_debug(int apidogResponseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<Stories>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAllArticles$app_debug(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<Stories>> $completion) {
        return null;
    }
}