package org.neutralnews.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.neutralnews.di.ActivityLogger
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class AuthorizedAccess

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    @AuthorizedAccess
    fun provideNewsRepository(newsDataSource: NewsDataSource): NewsRepository {
        return NewsRepository(newsDataSource);
    }

    @Provides
    @Singleton
    internal fun provideNewsDataSource(): NewsDataSource {
        return NewsDataSource()
    }
}