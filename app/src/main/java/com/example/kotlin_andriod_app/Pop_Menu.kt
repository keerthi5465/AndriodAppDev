package com.example.kotlin_andriod_app

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pop_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pop_menu)
        val btn = findViewById<Button>(R.id.popup)
        btn.setOnClickListener{
            val s = PopupMenu(this,btn)
            s.menuInflater.inflate(R.menu.popuomenu,s.menu)
            s.setOnMenuItemClickListener {  item : MenuItem->
                when(item.itemId){
                    R.id.lang -> {
                        Toast.makeText(this,"Lang is selected",Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.colour-> {
                        Toast.makeText(this,"Colour is selected",Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> false
                }


            }
            s.show()
        }

    }
}