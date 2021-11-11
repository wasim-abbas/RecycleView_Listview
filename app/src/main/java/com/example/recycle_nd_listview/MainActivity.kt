package com.example.recycle_nd_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val cars = listOf("Volvo", "BMW", "Ford", "Mazda", "RangRover", "Audi", "toyota")

    private var layoutManager:LayoutManager?=null
    private var adapter : RecyclerView.Adapter<MyAdapterView.PhotoHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttobListener()
    }

    fun buttobListener() {
        btnListview.setOnClickListener(this)
        btnRecycelView.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        if (view != null) {
            when (view.id) {
                R.id.btnListview -> startActivity(Intent(this,ListActivity::class.java))
                R.id.btnRecycelView -> startActivity(Intent(this,RecycViewActivity::class.java))
            }
        }
    }
}