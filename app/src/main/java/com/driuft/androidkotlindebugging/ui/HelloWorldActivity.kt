package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
    }
}