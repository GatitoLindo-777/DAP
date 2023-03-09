package com.ort.dap_actinicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ort.myapplication.R

class MainActivity : AppCompatActivity() {

    lateinit var label : TextView
    lateinit var btnShow : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label = findViewById(R.id.TEXT1)
        btnShow = findViewById(R.id.BUTTON1)

        label.text = ""

        btnShow.setOnClickListener {
            label.text = "hace calor"
        }
    }



}