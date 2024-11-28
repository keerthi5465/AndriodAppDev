package com.example.kotlin_andriod_app

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)
        val spinneer = findViewById<Spinner>(R.id.spinner)
        val country = arrayOf("India","USA","Spain","Africa")
        var connect = ArrayAdapter(this,android.R.layout.simple_spinner_item,country)
        connect.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinneer.adapter = connect




    }
}