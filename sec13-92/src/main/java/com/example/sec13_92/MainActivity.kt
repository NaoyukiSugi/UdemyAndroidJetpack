package com.example.sec13_92

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone

//    @Inject
//    lateinit var memoryCard: MemoryCard

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSmartPhoneComponent
                .create()
                .inject(this)
        smartPhone.makeACallWithRecording()
//        memoryCard.getSpaceAvailablity()
    }
}
