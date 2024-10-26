package org.neutralnews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import org.neutralnews.di.ActivityLogger
import org.neutralnews.ui.navigation.NavGraph
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java
    }

    @Inject
    lateinit var logger: ActivityLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.log(TAG, "onCreate")
        setContent {
            NavGraph(logger)
        }
    }
}