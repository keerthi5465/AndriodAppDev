package com.example.kotlin_andriod_app

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class List_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        val a = findViewById<EditText>(R.id.todo)
        val b = findViewById<Button>(R.id.delete)
        val todo = findViewById<ListView>(R.id.todolist)
        val todo_list = ArrayList<String>()
        var d = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,todo_list)
        todo.adapter = d
        b.setOnClickListener{
            var e = a.text.toString()
            if(e.isNotEmpty()){
                todo_list.add(e)
                d.notifyDataSetChanged()
                a.text.clear()
            }else{
                Toast.makeText(this,"Enter something to the todo",Toast.LENGTH_LONG).show()
            }
        }

    }
}