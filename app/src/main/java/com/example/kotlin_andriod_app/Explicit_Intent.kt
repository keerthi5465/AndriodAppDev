package com.example.kotlin_andriod_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Explicit_Intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit_intent)
        val name = findViewById<EditText>(R.id.Name)
        val btn = findViewById<Button>(R.id.Pass)
        btn.setOnClickListener{
            val edt = name.text.toString()
            val intent = Intent(this,Explicit_Intent2 ::class.java)
            intent.putExtra("name",edt)
            startActivity(intent)

        }



    }
}