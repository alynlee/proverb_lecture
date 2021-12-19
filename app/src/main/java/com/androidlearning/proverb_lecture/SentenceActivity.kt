package com.androidlearning.proverb_lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("조금도 도전하지 않으려고 하는 것이 인생에서 가장 위험한 일이다.")
        sentenceList.add("남들이 할 수 있거나 하려는 일을 하지 말고 남들이 할 수 없거나 하지 않으려는 일을 하라.")
        sentenceList.add("새로운 일에 도전하다 보면 가끔 실수를 저지를 수 있다. 자신의 실수를 빨리 인정하고 다른 시도에 집중하는 것이 최선이다.")
        sentenceList.add("용기란 죽을만큼 두려워도 무언가 해보는 것이다.")
        sentenceList.add("인생에서 실패한 사람의 대부분은 성공이 눈앞에 왔는데도 모르고 포기한 사람들이다.")
        sentenceList.add("태도는 사소한 것이지만 그것이 만드는 차이는 엄청나다.")

        val listview = findViewById<ListView>(R.id.setntence_listView)
        val listAdapter = ListViewAdapter(sentenceList)
        listview.adapter = listAdapter

    }
}