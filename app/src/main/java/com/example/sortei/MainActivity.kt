package com.example.sortei

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(R.layout.activity_main)
    }

    fun sortedNumber(view: View) {
        val text = findViewById<TextView>(R.id.textView2)
        val numRandom = Random().nextInt(11)
        text.text = "Numero sorteado e: " + numRandom
    }
}