package com.cs246.mylab

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*

class calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val message = intent.getStringExtra(EXTRA_MESSAGE2)
        val textView = findViewById<TextView>(R.id.compound).apply {
            text = message
        }
        c.setOnClickListener(View.OnClickListener {
            result += 12
            code += "c"
            editText.text = "The compound is $code and the result is: $result"
        })
        k.setOnClickListener(View.OnClickListener {
            result += 156
            code += "k"
            editText.text = "The compound is $code and the result is: $result"
        })
        cd.setOnClickListener(View.OnClickListener {
            result +=112
            code += "cd"
            editText.text = "The compound is $code and the result is: $result"
        })
        s.setOnClickListener(View.OnClickListener {
            result += 32
            code += "s"
            editText.text = "The compound is $code and the result is: $result"
        })
        cu.setOnClickListener(View.OnClickListener {
            result += 63
            code += "cu"
            editText.text = "The compound is $code and the result is: $result"
        })
        p.setOnClickListener(View.OnClickListener {
            result += 31
            code += "p"
            editText.text = "The compound is $code and the result is: $result"
        })
        al.setOnClickListener(View.OnClickListener {
            result += 27
            code += "al"
            editText.text = "The compound is $code and the result is: $result"
        })
        f.setOnClickListener(View.OnClickListener {
            result +=19
            code += "f"
            editText.text = "The compound is $code and the result is: $result"
        })
        zn.setOnClickListener(View.OnClickListener {
            result += 85
            code += "zn"
            editText.text = "The compound is $code and the result is: $result"
        })
        h.setOnClickListener(View.OnClickListener {
            result += 1
            code += "h"
            editText.text = "The compound is $code and the result is: $result"
        })
        n.setOnClickListener(View.OnClickListener {
            result += 13
            code += "n"
            editText.text = "The compound is $code and the result is: $result"
        })
        ni.setOnClickListener(View.OnClickListener {
            result += 59
            code += "ni"
            editText.text = "The compound is $code and the result is: $result"
        })
        ba.setOnClickListener(View.OnClickListener {
            result += 137
            code += "ba"
            editText.text = "The compound is $code and the result is: $result"
        })
        li.setOnClickListener(View.OnClickListener {
            result += 7
            code += "li"
            editText.text = "The compound is $code and the result is: $result"
        })
        ca.setOnClickListener(View.OnClickListener {
            result += 40
            code += "ca"
            editText.text = "The compound is $code and the result is: $result"
        })
        b.setOnClickListener(View.OnClickListener {
            result +=10
            code += "b"
            editText.text = "The compound is $code and the result is: $result"
        })
        fe.setOnClickListener(View.OnClickListener {
            result +=56
            code += "fe"
            editText.text = "The compound is $code and the result is: $result"
        })
        br.setOnClickListener(View.OnClickListener {
            result +=80
            code += "br"
            editText.text = "The compound is $code and the result is: $result"
        })
        na.setOnClickListener(View.OnClickListener {
            result += 23
            code += "na"
            editText.text = "The compound is $code and the result is: $result"
        })
        ma.setOnClickListener(View.OnClickListener {
            result += 24
            code += "ma"
            editText.text = "The compound is $code and the result is: $result"
        })
        cl.setOnClickListener(View.OnClickListener {
            result +=35
            code += "cl"
            editText.text = "The compound is $code and the result is: $result"
        })
        i.setOnClickListener(View.OnClickListener {
            result +=127
            code += "i"
            editText.text = "The compound is $code and the result is: $result"
        })
        co.setOnClickListener(View.OnClickListener {
            result +=59
            code += "co"
            editText.text = "The compound is $code and the result is: $result"
        })
        o.setOnClickListener(View.OnClickListener {
            result += 16
            code += "o"
            editText.text = "The compound is $code and the result is: $result"
        })
        clear.setOnClickListener(View.OnClickListener {
            result = 0
            code = ""
            editText.text = "Select the elements"
        })

    }

    fun numberEvent(view: View) {
    }

    companion object {
        var result: Int = 0
        var code:String=""
    }
}