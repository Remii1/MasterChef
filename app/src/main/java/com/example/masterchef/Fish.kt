package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Fish : AppCompatActivity() {
    lateinit var fish1: ImageView
    lateinit var fish2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fish)
        fish1=findViewById(R.id.braised)
        fish1.setOnClickListener {
            val intent= Intent(this,braisedfish::class.java)
            startActivity(intent)
        }

        fish2=findViewById(R.id.lemon)
        fish2.setOnClickListener {
            val intent= Intent(this,lemonfish::class.java)
            startActivity(intent)
        }
    }
}