package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Salmon : AppCompatActivity() {
    lateinit var pea: ImageView
    lateinit var cau: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salmon)
        pea=findViewById(R.id.garlic)
        pea.setOnClickListener {
            val intent= Intent(this,garlichoneysalmon::class.java)
            startActivity(intent)
        }

        cau=findViewById(R.id.grilled)
        cau.setOnClickListener {
            val intent= Intent(this,grilledsalmon::class.java)
            startActivity(intent)
        }
    }
}