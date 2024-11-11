// Generated by Dagger (https://dagger.dev).
package org.neutralnews.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DataModule_ProvideNewsDataSource$app_debugFactory implements Factory<NewsDataSource> {
  @Override
  public NewsDataSource get() {
    return provideNewsDataSource$app_debug();
  }

  public static DataModule_ProvideNewsDataSource$app_debugFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NewsDataSource provideNewsDataSource$app_debug() {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideNewsDataSource$app_debug());
  }

  private static final class InstanceHolder {
    private static final DataModule_ProvideNewsDataSource$app_debugFactory INSTANCE = new DataModule_ProvideNewsDataSource$app_debugFactory();
  }
}