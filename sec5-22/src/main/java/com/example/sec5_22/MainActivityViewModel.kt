package com.example.sec5_22

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val userName = MutableLiveData<String>()
    val userNameData: LiveData<String>
        get() = userName

    init {
        userName.value = "Frank"
    }
}
