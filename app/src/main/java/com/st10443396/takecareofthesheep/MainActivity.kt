package com.st10443396.takecareofthesheep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var AppName : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppName = findViewById(R.id.AppName)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            btnStart()
        }
    }
}