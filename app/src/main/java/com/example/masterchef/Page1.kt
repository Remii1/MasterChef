package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page1 : AppCompatActivity() {
    lateinit var toast:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        toast=findViewById(R.id.button2)
        toast.setOnClickListener {
            var next=Intent(this,page22::class.java)
            startActivity(next)
        }
    }
}