package com.example.kotlin_andriod_app

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Action_Bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_action_bar)
        val t= findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(t)
        supportActionBar?.setTitle("Action_Bar")

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.langs,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.Telugulang -> {
                Toast.makeText(this,"Its Telugu",Toast.LENGTH_LONG).show()
                true
            }
            R.id.HindiLang -> {
                Toast.makeText(this,"Its Hindi",Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}