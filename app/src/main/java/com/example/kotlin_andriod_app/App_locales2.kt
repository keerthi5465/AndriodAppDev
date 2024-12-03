package com.example.kotlin_andriod_app

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class App_locales2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_locales2)


        val btn1 = findViewById<Button>(R.id.Telugu2)
        val btn2 = findViewById<Button>(R.id.Hindi2)
        btn1.setOnClickListener{
            setLocals("te")
        }
        btn2.setOnClickListener {
            setLocals("hi")
        }

    }

    private fun setLocals(s: String) {
        val current = resources.configuration.locales.get(0).language
        if (s != current){
            val l = Locale(s)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c,resources.displayMetrics)
            recreate()
        }

    }
}