package com.example.kotlin_andriod_app

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Radio_button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_button)
        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val btn = findViewById<Button>(R.id.submit1)
        btn.setOnClickListener{
            val result = radio.checkedRadioButtonId
            val subject = when(result) {
            R.id.radioButton -> "DBMS"
            R.id.radioButton2 -> "C/C ++"
            R.id.radioButton3 -> "Data Structures"
            else -> "Ntg is slectec make sure to select"
        }
            Toast.makeText(this,"So the subject selected is $subject " ,Toast.LENGTH_LONG).show()
        }


    }
}