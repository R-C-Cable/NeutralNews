package org.neutralnews

import android.app.Application
import android.os.StrictMode
import android.widget.Toast
import dagger.hilt.android.HiltAndroidApp

/**
 * An [Application] class for the Neutral News app.
 */
@HiltAndroidApp
class NeutralNewsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (true /*BuildConfig.DEBUG*/) {
            // Thread Policy with Listener
            val threadListener = StrictMode.OnThreadViolationListener { violation ->
                println("Thread StrictMode Violation: ${violation.message}")
            }
            val vmListener = StrictMode.OnVmViolationListener { violation ->
                println("VM StrictMode Violation: ${violation.message}")
            }
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().detectAll().penaltyListener(mainExecutor, threadListener).build())
            StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().detectAll().penaltyListener(mainExecutor, vmListener).build())
        }
    }
}