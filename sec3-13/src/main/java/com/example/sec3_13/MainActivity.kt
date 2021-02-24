package com.example.sec3_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sec3_13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        binding.resultText.text = viewModel.getTotal().toString()

        binding.insertButton.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
            binding.resultText.text = viewModel.getTotal().toString()
        }
    }
}
