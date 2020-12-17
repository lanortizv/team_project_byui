package com.cs246.mylab

import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE2 = "com.example.mwcalculator.MESSAGE"

class DisplayMessageActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)


        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView5).apply{
            text = message
        }
    }
    fun sendMessage (view: View){
        val editText = findViewById<EditText>(R.id.cc)
        val message = editText.text.toString()
        val intent = Intent (this, calculator::class.java).apply{
            putExtra(EXTRA_MESSAGE2, message)
        }
        startActivity(intent)
    }
}