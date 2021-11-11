package com.example.recycle_nd_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MyAdapterView : RecyclerView.Adapter<MyAdapterView.PhotoHolder>() {
    val cars = listOf("Prado","Lamborghini","Volvo", "BMW", "Ford", "Mazda", "RangRover", "Audi", "toyota","Honda","Grande","Volkswagen","Daimler")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item_row, parent, false)
        return PhotoHolder(inflater)

    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {

        holder.mytext.text = cars[position]

    }

    override fun getItemCount() = cars.size

    inner class PhotoHolder(v: View) : RecyclerView.ViewHolder(v) {
        var mytext: TextView

        init {
            mytext = v.findViewById<TextView>(R.id.mytextView)

            mytext.setOnClickListener {
                val pos: Int = adapterPosition
                val name: String = cars[pos]
                Toast.makeText(v.context, "${name} :$pos", Toast.LENGTH_SHORT).show()

            }


        } }

    }






