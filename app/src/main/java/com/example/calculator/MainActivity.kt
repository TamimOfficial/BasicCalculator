package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plus.setOnClickListener {
            val edt1= ed1.text.toString().toInt()
            val edt2 = ed2.text.toString().toInt()
            tvDisplay.text=(edt1+edt2).toString()
        }
        minus.setOnClickListener {
            val edt1= ed1.text.toString().toInt()
            val edt2 = ed2.text.toString().toInt()
            tvDisplay.text=(edt1-edt2).toString()
        }
        Multiply.setOnClickListener {
            val edt1= ed1.text.toString().toInt()
            val edt2 = ed2.text.toString().toInt()
            tvDisplay.text=(edt1*edt2).toString()
        }
        Division.setOnClickListener{
            val edt1= ed1.text.toString().toInt()
            val edt2 = ed2.text.toString().toInt()
            tvDisplay.text=(edt1/edt2).toString()
        }

    }
}