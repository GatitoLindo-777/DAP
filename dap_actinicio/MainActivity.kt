package com.ort.dap_actinicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.awt.Button
import java.awt.font.TextLayout

lateinit var label : TEXT1
lateinit var btnShow : BUTTON1

class MainActivity : AppCompatActivity() {

    lateinit var label : TEXT1
    lateinit var btnShow : BUTTON1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lable = findViewById(R.id.TEXT1)
        btnShow = findViewById(R.id.button)

        lable.text = ""

        btnShow.setOnClickListener {
            lable.text = "hace calor"
        }
    }



}