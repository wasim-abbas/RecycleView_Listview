package com.example.recycle_nd_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    val cars = listOf("Volvo", "BMW", "Ford", "Mazda", "RangRover", "Audi", "toyota")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cars)
        //val pos= adapter.getPosition(cars.toString())
        myListview.adapter = adapter

        myListview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                p0: AdapterView<*>?,
                fistview: View?,
                name: Int,
                position: Long
            ) {
                val position = myListview.getItemAtPosition(name) as String
                Toast.makeText(applicationContext, "$name: $position", Toast.LENGTH_SHORT)
                    .show()

            }

        }
    }
}