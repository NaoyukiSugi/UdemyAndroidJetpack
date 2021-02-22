package com.example.sec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sec2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.apply {
            val message = "Hello! " + nameEditText.text
            greetingTextView.text = message
        }
    }
}
