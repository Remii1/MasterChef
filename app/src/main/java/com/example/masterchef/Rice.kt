package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Rice : AppCompatActivity() {
    lateinit var pea: ImageView
    lateinit var cau: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rice)
        pea=findViewById(R.id.fried)
        pea.setOnClickListener {
            val intent= Intent(this,friedrice::class.java)
            startActivity(intent)
        }

        cau=findViewById(R.id.indian)
        cau.setOnClickListener {
            val intent= Intent(this,indianpilau::class.java)
            startActivity(intent)
        }
    }
}