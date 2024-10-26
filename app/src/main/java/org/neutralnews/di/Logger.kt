package org.neutralnews.di

import android.app.Activity
import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import java.util.concurrent.atomic.AtomicInteger
import javax.inject.Inject

interface Logger {
    fun log(clazz: Class<*>?, message: String)
}

@ActivityScoped
class ActivityLogger @Inject constructor(private val activity: Activity) : Logger {

    companion object {
        private val instanceCounter = AtomicInteger(1)
    }

    override fun log(clazz: Class<*>?, message: String) {
        val tag = if (clazz != null) {
            "${activity::class.java.simpleName}-${instanceCounter.getAndIncrement()}/${clazz.simpleName}"
        } else {
            "${activity::class.java.simpleName}-${instanceCounter.getAndIncrement()}"
        }
        Log.d(tag, message)
    }
}