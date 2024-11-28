package com.example.kotlin_andriod_app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box)
        val btn = findViewById<Button>(R.id.submit)
        btn.setOnClickListener {
            Toast.makeText(this,"Your input is recorded",Toast.LENGTH_LONG).show()
        }

    }
}