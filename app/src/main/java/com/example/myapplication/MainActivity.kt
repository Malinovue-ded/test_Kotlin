package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var text1: TextView
    private lateinit var Btn: Button

    var counter1 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1 = findViewById(R.id.textView);
        Btn = findViewById(R.id.button);


        Btn.setOnClickListener {
            counter1 += 1
            text1.text = counter1.toString()
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val userName = counter1
        outState.putInt("saveCounter", counter1)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val counter = savedInstanceState.getInt("saveCounter", 0)
        counter1 = counter;
        text1.text = counter1.toString();
    }
}
