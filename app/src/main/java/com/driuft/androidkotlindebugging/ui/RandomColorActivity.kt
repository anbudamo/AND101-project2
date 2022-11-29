package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.driuft.androidkotlindebugging.R
import java.util.*

class RandomColorActivity : AppCompatActivity() {

    private val rootView: View get() = findViewById(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_color)

        rootView.setOnClickListener { it.setBackgroundColor(getRandomColor()) }
    }

    private fun getRandomColor(): Int {
        // Get random color// Get random color// Get random color// Get random color
        getRandomColor()

        val rnd = Random()
        return Color.argb(
            255,
            rnd.nextInt(256),
            rnd.nextInt(256),
            rnd.nextInt(256)
        )
    }
}