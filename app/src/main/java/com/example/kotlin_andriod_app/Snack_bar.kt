package com.example.kotlin_andriod_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Snack_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_bar)
        val btn1 = findViewById<Button>(R.id.Delete)
        val btn2 = findViewById<Button>(R.id.Press)
        btn1.setOnClickListener{
            val s1 = Snackbar.make(it,"This Message is Dismissed",Snackbar.LENGTH_INDEFINITE)
            s1.setAction("Dismiss"){s1.dismiss()}
            s1.show()
        }
        btn2.setOnClickListener{
            val s2 = Snackbar.make(it,"Press the Press button",Snackbar.LENGTH_LONG)
            s2.setAction("undo",View.OnClickListener {
                val s3 = Snackbar.make(it,"Ntg is going to change",Snackbar.LENGTH_LONG)
                s3.show()
            })
            s2.show()
        }
    }
}