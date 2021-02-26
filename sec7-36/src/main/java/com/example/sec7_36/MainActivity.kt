package com.example.sec7_36

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitsList =
        listOf(
            Fruit("Mango", "Tom"),
            Fruit("Apple", "Mike"),
            Fruit("Banana", "John"),
            Fruit("Guava", "Jack"),
            Fruit("Lemon", "Bob"),
            Fruit("Pear", "Ben"),
            Fruit("Orange", "Ema")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_recycler_view.setBackgroundColor(Color.YELLOW)
        my_recycler_view.layoutManager = LinearLayoutManager(this)
        my_recycler_view.adapter =
            MyRecyclerViewAdapter(fruitsList) { selectedFruitItem: Fruit ->
                listItemClicked(
                    selectedFruitItem
                )
            }
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(
            this@MainActivity,
            "Supplier name is ${fruit.supplier}", Toast.LENGTH_LONG
        ).show()
    }
}
