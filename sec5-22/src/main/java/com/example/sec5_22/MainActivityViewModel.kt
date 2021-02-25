package com.example.sec5_22

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        userName.value = "Frank"
    }
}
