package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Daily : AppCompatActivity() {
    lateinit var smoot:ImageView
    lateinit var avocad:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)

        smoot=findViewById(R.id.green)
        smoot.setOnClickListener {
            val intent= Intent(this,greensmoothie::class.java)
            startActivity(intent)
        }

        avocad=findViewById(R.id.avocado)
        avocad.setOnClickListener {
            val intent= Intent(this,avocado::class.java)
            startActivity(intent)
        }
    }
}