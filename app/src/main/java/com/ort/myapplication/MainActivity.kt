package com.ort.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ort.myapplication.R

class MainActivity : AppCompatActivity() {

    lateinit var label : TextView
    lateinit var btnShow : Button
    lateinit var btnHide : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label = findViewById(R.id.TEXT1)
        btnShow = findViewById(R.id.BUTTON1)
        btnHide = findViewById(R.id.BUTTON2)

        label.text = ""

        btnShow.setOnClickListener {
            label.text = "hola!"
        }
        btnHide.setOnClickListener{
            label.text = ""
        }
    }



}