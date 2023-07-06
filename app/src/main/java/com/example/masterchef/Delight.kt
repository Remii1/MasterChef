package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Delight : AppCompatActivity() {
    lateinit var saus:ImageView
    lateinit var blackbean:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delight)

        saus=findViewById(R.id.sausage)
        saus.setOnClickListener {
            val intent= Intent(this,sausageburrito::class.java)
            startActivity(intent)
        }
        blackbean=findViewById(R.id.bean)
        blackbean.setOnClickListener {
            val intent= Intent(this,blackbeanburrito::class.java)
            startActivity(intent)
        }
    }
}