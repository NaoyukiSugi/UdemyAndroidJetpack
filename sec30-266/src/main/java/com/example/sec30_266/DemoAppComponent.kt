package com.example.sec30_266

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class DemoAppComponent(private val activityName: String) : LifecycleObserver {

    private val TAG = "lifecycle"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i(TAG, "***************    DemoAppComponent onCreate() invoked for $activityName")
    }
}
