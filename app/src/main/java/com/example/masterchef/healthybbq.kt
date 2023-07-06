package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class healthybbq : AppCompatActivity() {
    lateinit var chic: ImageView
    lateinit var tof: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthybbq)

        tof=findViewById(R.id.tofu)
        tof.setOnClickListener {
            val intent= Intent(this,bakedtofu::class.java)
            startActivity(intent)
        }

        chic=findViewById(R.id.bbqchick)
        chic.setOnClickListener {
            val intent= Intent(this,bbqchick::class.java)
            startActivity(intent)
        }
    }
}