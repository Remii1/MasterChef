package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView

class Healthy : AppCompatActivity() {
    lateinit var pizz:ImageView
    lateinit var tac:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthy)


        pizz=findViewById(R.id.bagel)
        pizz.setOnClickListener {
            val intent= Intent(this,pizzabagel::class.java)
            startActivity(intent)
        }

        tac=findViewById(R.id.tacos)
        tac.setOnClickListener {
            val intent= Intent(this,tacos::class.java)
            startActivity(intent)
        }



    }
}