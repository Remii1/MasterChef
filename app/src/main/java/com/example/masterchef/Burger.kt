package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Burger : AppCompatActivity() {
    lateinit var chicke:ImageView
    lateinit var beef:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)
        chicke=findViewById(R.id.chicke)
        chicke.setOnClickListener {
            val intent= Intent(this,chickenburger::class.java)
            startActivity(intent)
        }

        beef=findViewById(R.id.beef)
        beef.setOnClickListener {
            val intent= Intent(this,beefburger::class.java)
            startActivity(intent)
        }

    }
}