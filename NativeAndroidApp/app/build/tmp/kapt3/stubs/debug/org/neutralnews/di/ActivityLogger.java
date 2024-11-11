package org.neutralnews.di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/neutralnews/di/ActivityLogger;", "Lorg/neutralnews/di/Logger;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "log", "", "clazz", "Ljava/lang/Class;", "message", "", "Companion", "app_debug"})
@dagger.hilt.android.scopes.ActivityScoped()
public final class ActivityLogger implements org.neutralnews.di.Logger {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.atomic.AtomicInteger instanceCounter = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.neutralnews.di.ActivityLogger.Companion Companion = null;
    
    @javax.inject.Inject()
    public ActivityLogger(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @java.lang.Override()
    public void log(@org.jetbrains.annotations.Nullable()
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/neutralnews/di/ActivityLogger$Companion;", "", "()V", "instanceCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}