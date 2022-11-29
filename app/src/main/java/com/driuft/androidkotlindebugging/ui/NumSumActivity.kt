package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class NumSumActivity : AppCompatActivity() {

    private val resultText: TextView get() = findViewById(R.id.result_text)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_sum)

        val a = 2
        val b = "2" as Int

        resultText.text = "${sumOfTwo(a, b)}"
    }

    private fun sumOfTwo(x: Int, y: Int) : Int {
        return x + y
    }
}