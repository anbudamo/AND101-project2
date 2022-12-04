package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class FavoriteNumber : AppCompatActivity() {

    private val favoriteNumber: TextView get() = findViewById(R.id.favorite_number)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)

        val number: Int = null!!
        favoriteNumber.text = "$number"
    }
}