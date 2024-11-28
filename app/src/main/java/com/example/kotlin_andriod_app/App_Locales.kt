package com.example.kotlin_andriod_app

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.ConfigurationCompat.setLocales
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class App_Locales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_locales)
        val telugu = findViewById<Button>(R.id.Telugu)
        val hindi = findViewById<Button>(R.id.Hindi)
        telugu.setOnClickListener{
            setLocales("te")
        }
        hindi.setOnClickListener{
            setLocales("hi")
        }
    }

    private fun setLocales(s: String) {
        val current = resources.configuration.locales.get(0).language
        if(s != current){
            val l = Locale(s)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c,resources.displayMetrics)
            recreate()
        }


    }
}