package com.example.sec3_13

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var total = 0

    fun getTotal() = total

    fun setTotal(input: Int) {
        total += input
    }
}
