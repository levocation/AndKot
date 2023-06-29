package com.example.myword

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getWord()

        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener({
            textView.text = getWord()
        })
    }

    private fun getWord(): String {
        val list = listOf(
            "ISTJ",
            "ISTP",
            "INFJ",
            "INTJ",
            "ISFJ",
            "ISFP",
            "INFP",
            "INTP",
            "ESTJ",
            "ESFP",
            "ENFP",
            "ENTP",
            "ESFJ",
            "ESTP",
            "ENFJ",
            "ENTJ"
        )

        return list.random()
    }
}