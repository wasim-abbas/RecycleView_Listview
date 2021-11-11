package com.example.recycle_nd_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycle_view.*

class RecycViewActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MyAdapterView.PhotoHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_view)
        layoutManager = LinearLayoutManager(this)
        myRecycleView.layoutManager = layoutManager
        adapter = MyAdapterView()
        myRecycleView.adapter = adapter
    }
}