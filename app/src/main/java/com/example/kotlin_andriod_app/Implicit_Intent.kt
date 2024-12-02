package com.example.kotlin_andriod_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Implicit_Intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        val url = findViewById<EditText>(R.id.url)
        val btn = findViewById<Button>(R.id.click)
        btn.setOnClickListener{
            val urls = url.text.toString()
            val intenturl = Intent(Intent.ACTION_VIEW, Uri.parse(urls))
            startActivity(intenturl)

        }
    }
}