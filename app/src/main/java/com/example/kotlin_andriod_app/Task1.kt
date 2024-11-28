package com.example.kotlin_andriod_app

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task1 : AppCompatActivity() {
    private val isDarkTheme = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task1)
        val toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.task1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.profile -> {
                openProfileOption()
                true
            }
            R.id.Setting ->{
                openSettingOption()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openProfileOption() {
        TODO("Not yet implemented")
    }

    private fun openSettingOption() {
        val options = arrayOf("ChangeTheme", "Change Password")
        val builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Profile Options")
            .setItems(options) { _, which ->
                when (which) {
                    0 -> toggleTheme() // Change Theme
                    1 -> changePassword() // Change Password
                }
            }
            .show()
    }

    private fun toggleTheme() {
        TODO("Not yet implemented")
    }


    private fun changePassword() {
        Toast.makeText(this, "Password change clicked", Toast.LENGTH_SHORT).show()
        // Add password change functionality here
    }
}