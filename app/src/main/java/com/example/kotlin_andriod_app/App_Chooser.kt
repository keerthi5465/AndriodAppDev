package com.example.kotlin_andriod_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class App_Chooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)
        val btn = findViewById<Button>(R.id.share)
        btn.setOnClickListener{
            shareBy("Which app do you want to share to")
        }

    }

    private fun shareBy(s: String) {
        val send = Intent().apply{
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,s)
            type = "text/plain"



        }
        val i = Intent.createChooser(send,"Share Via")
        startActivity(i)

    }
}