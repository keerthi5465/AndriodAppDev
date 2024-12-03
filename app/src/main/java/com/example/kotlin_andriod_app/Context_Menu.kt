package com.example.kotlin_andriod_app

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Context_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        // Locate the ImageView and register for context menu
        val imgbtn = findViewById<ImageView>(R.id.Imgbtn)
        registerForContextMenu(imgbtn)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context, menu) // Inflate context menu
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val imgBtn = findViewById<ImageView>(R.id.Imgbtn)

        return when (item.itemId) {
            R.id.black -> {
                imgBtn.setColorFilter(Color.GRAY) // Apply gray filter
                true
            }
            R.id.white -> {
                imgBtn.clearColorFilter() // Clear any filters applied
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}
