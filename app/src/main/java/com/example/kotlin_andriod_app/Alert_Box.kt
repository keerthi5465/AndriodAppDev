package com.example.kotlin_andriod_app

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Alert_Box : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_box)
        val btn = findViewById<Button>(R.id.alert)
        btn.setOnClickListener {
            val b = AlertDialog.Builder(this)
            b.setTitle("REMINDER")
            b.setMessage("Its IMPORTANT")
            b.setPositiveButton("yes") { dialog, _ -> finish() }
            b.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
            b.create().show()
        }
    }
}
