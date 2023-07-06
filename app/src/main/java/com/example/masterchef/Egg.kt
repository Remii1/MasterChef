package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Egg : AppCompatActivity() {
    lateinit var egg1:ImageView
    lateinit var egg2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egg)

        egg1=findViewById(R.id.frit)
        egg1.setOnClickListener {
            val intent= Intent(this,frittata::class.java)
            startActivity(intent)
        }

        egg2=findViewById(R.id.omlet)
        egg2.setOnClickListener {
            val intent= Intent(this,omlette::class.java)
            startActivity(intent)
        }
    }
}