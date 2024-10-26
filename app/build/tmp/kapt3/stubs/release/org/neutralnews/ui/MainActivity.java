package org.neutralnews.ui;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lorg/neutralnews/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "logger", "Lorg/neutralnews/di/ActivityLogger;", "getLogger", "()Lorg/neutralnews/di/ActivityLogger;", "setLogger", "(Lorg/neutralnews/di/ActivityLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Class<org.neutralnews.ui.MainActivity> TAG = null;
    @javax.inject.Inject()
    public org.neutralnews.di.ActivityLogger logger;
    @org.jetbrains.annotations.NotNull()
    public static final org.neutralnews.ui.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.neutralnews.di.ActivityLogger getLogger() {
        return null;
    }
    
    public final void setLogger(@org.jetbrains.annotations.NotNull()
    org.neutralnews.di.ActivityLogger p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/neutralnews/ui/MainActivity$Companion;", "", "()V", "TAG", "Ljava/lang/Class;", "Lorg/neutralnews/ui/MainActivity;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}