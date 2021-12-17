package com.androidlearning.proverb_lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a","b"))
        list_item.add(ListViewModel("c","d"))
        list_item.add(ListViewModel("e","f"))

        val listview = findViewById<ListView>(R.id.mainListView)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        if(isDouble == true){
            finish()
        }
        Log.d("MainActivity", "backbutton")
        isDouble = true
        Toast.makeText(this, "종료하실러면 한번 더 눌러주세요", Toast.LENGTH_LONG).show()

        Handler().postDelayed({
                isDouble=false
            }, 2000)
    }
}