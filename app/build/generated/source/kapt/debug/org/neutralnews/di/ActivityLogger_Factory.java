// Generated by Dagger (https://dagger.dev).
package org.neutralnews.di;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ActivityLogger_Factory implements Factory<ActivityLogger> {
  private final Provider<Activity> activityProvider;

  public ActivityLogger_Factory(Provider<Activity> activityProvider) {
    this.activityProvider = activityProvider;
  }

  @Override
  public ActivityLogger get() {
    return newInstance(activityProvider.get());
  }

  public static ActivityLogger_Factory create(Provider<Activity> activityProvider) {
    return new ActivityLogger_Factory(activityProvider);
  }

  public static ActivityLogger newInstance(Activity activity) {
    return new ActivityLogger(activity);
  }
}