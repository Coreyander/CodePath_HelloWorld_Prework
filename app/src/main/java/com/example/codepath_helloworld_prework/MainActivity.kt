package com.example.codepath_helloworld_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.introButton)
        button.setOnClickListener{
            Toast.makeText(this, resources.getString(R.string.applause), Toast.LENGTH_SHORT).show()
        }
    }
}