package com.androidlearning.proverb_lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<String>()

        list_item.add("a")
        list_item.add("b")
        list_item.add("c")

        val listview = findViewById<ListView>(R.id.mainListView)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter

    }
}