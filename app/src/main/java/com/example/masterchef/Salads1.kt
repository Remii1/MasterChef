package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Salads1 : AppCompatActivity() {
 lateinit var fruit:ImageView
 lateinit var chi:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salads1)
        fruit=findViewById(R.id.salad1)

        fruit.setOnClickListener {
            val intent= Intent(this,fruitsalad::class.java)
            startActivity(intent)
        }
        chi=findViewById(R.id.salad2)

         chi.setOnClickListener {
            val intent= Intent(this,chickensalad::class.java)
            startActivity(intent)
        }
    }
}