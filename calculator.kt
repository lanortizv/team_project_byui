package com.example.mwcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


        val message = intent.getStringExtra(EXTRA_MESSAGE2)

        val textView = findViewById<TextView>(R.id.compound).apply{
            text = message
        }
    }
    fun numberEvent (view: View){
    }
}