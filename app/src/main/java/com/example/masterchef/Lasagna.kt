package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Lasagna : AppCompatActivity() {
    lateinit var ski: ImageView
    lateinit var cau: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lasagna)
        ski=findViewById(R.id.home)

        ski.setOnClickListener {
            val intent= Intent(this,homemade::class.java)
            startActivity(intent)
        }
        cau=findViewById(R.id.pork)

        cau.setOnClickListener {
            val intent= Intent(this,pork::class.java)
            startActivity(intent)
        }
    }
}