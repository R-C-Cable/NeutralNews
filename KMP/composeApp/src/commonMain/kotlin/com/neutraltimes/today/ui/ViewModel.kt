package com.neutraltimes.today.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.koin.core.component.KoinComponent

open class ViewModel: KoinComponent {
    private val viewModelJob = SupervisorJob()
    protected val viewModelScope = CoroutineScope(Dispatchers.Default + viewModelJob)


    protected fun <T> mutableStateFlowOf(value: T): MutableStateFlow<T> = MutableStateFlow(value)
    protected fun <T> stateFlowOf(value: T): StateFlow<T> = mutableStateFlowOf(value).asStateFlow()

    protected open fun onCleared() {
        // Add any common cleanup logic here
    }

    open fun clear() {
        onCleared()
        viewModelScope.cancel()
    }
}