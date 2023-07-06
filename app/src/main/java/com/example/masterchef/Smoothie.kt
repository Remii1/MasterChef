package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Smoothie : AppCompatActivity() {
    lateinit var pea: ImageView
    lateinit var cau: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smoothie)
        pea=findViewById(R.id.peach)
        pea.setOnClickListener {
            val intent= Intent(this,peachsmoothie::class.java)
            startActivity(intent)
        }

        cau=findViewById(R.id.coconut)
        cau.setOnClickListener {
            val intent= Intent(this,coconutsmoothie::class.java)
            startActivity(intent)
        }
    }
}