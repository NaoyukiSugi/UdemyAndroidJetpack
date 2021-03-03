package com.example.sec13_92

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor() {
    init {
        Log.i("MYTAG", "Memory Card Constructed")
    }

    fun getSpaceAvailablity() {
        Log.i("MYTAG", "Memory space available")
    }
}
