package com.example.ex1gui

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        var layout: LinearLayout= findViewById(R.id.layout)
        var txt1: TextView= findViewById(R.id.txt1)
        var btn1: Button= findViewById(R.id.btn1)
        var btn4: Button= findViewById(R.id.btn4)
        var size: Float= 10f
        btn1.setOnClickListener{
           txt1.setTextSize(size)
           size=(size+5)% 50
        }
        var btn3: Button= findViewById(R.id.btn3)
        var i: Int=0
        btn3.setOnClickListener{
            when(i%3){
                0->txt1.setTextColor(Color.RED)
                1->txt1.setTextColor(Color.BLACK)
                2->txt1.setTextColor(Color.YELLOW)
            }
            i=i+1
        }
        var j: Int=0
        btn4.setOnClickListener {
            when (j % 3) {
                0 -> layout.setBackgroundColor(Color.RED)
                1 -> layout.setBackgroundColor(Color.BLACK)
                2 -> layout.setBackgroundColor(Color.YELLOW)

            }
            j=j+1
        }

    }
}