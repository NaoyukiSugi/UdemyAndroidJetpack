package com.example.sec13_92

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone
}
