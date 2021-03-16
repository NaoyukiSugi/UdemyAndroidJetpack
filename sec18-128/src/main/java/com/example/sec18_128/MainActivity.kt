package com.example.sec18_128

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.sec18_128.databinding.ActivityMainBinding
import com.example.sec18_128.presentation.adapter.NewsAdapter
import com.example.sec18_128.presentation.viewmodel.NewsViewModel
import com.example.sec18_128.presentation.viewmodel.NewsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: NewsViewModelFactory

    @Inject
    lateinit var newsAdapter: NewsAdapter
    lateinit var viewModel: NewsViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnvNews.setupWithNavController(
            fragment.findNavController()
        )
        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
    }
}
