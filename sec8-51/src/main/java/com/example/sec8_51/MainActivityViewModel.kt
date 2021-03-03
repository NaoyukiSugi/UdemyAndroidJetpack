package com.example.sec8_51

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sec8_51.model.UserRepository

import androidx.lifecycle.viewModelScope
import com.example.sec8_51.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {
    private var userRepository = UserRepository()
    var users: MutableLiveData<List<User>> = MutableLiveData()


    fun getUserData() {
        viewModelScope.launch {
            var result: List<User>? = null
            withContext(Dispatchers.IO) {
                result = userRepository.getUsers()
            }
            users.value = result
        }
    }
}
