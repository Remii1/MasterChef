package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Spaghetti : AppCompatActivity() {
    lateinit var cheese:ImageView
    lateinit var shrimp:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti)

        cheese=findViewById(R.id.chicken)
        cheese.setOnClickListener {
            val intent= Intent(this,chickencheese::class.java)
            startActivity(intent)
        }

        shrimp=findViewById(R.id.garlic)
        shrimp.setOnClickListener {
            val intent= Intent(this,garlicshrimp::class.java)
            startActivity(intent)
        }
    }
}