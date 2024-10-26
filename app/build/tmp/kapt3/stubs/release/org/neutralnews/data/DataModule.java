package org.neutralnews.data;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lorg/neutralnews/data/DataModule;", "", "()V", "provideNewsDataSource", "Lorg/neutralnews/data/NewsDataSource;", "provideNewsDataSource$app_release", "provideNewsRepository", "Lorg/neutralnews/data/NewsRepository;", "newsDataSource", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final org.neutralnews.data.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @AuthorizedAccess()
    @org.jetbrains.annotations.NotNull()
    public final org.neutralnews.data.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull()
    org.neutralnews.data.NewsDataSource newsDataSource) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final org.neutralnews.data.NewsDataSource provideNewsDataSource$app_release() {
        return null;
    }
}