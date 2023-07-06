package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Supper : AppCompatActivity() {
    lateinit var pasta:CardView
    lateinit var smooth:CardView
    lateinit var gluten:CardView
    lateinit var salmon:CardView
    lateinit var rice:CardView
    lateinit var lasagna:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supper)
        pasta=findViewById(R.id.cardPasta)
        gluten=findViewById(R.id.cardGluten)
        salmon=findViewById(R.id.cardSalmon)
        rice=findViewById(R.id.cardRice)
        lasagna=findViewById(R.id.cardLasagna)

        pasta.setOnClickListener {
            val intent= Intent(this,Easypasta::class.java)
            startActivity(intent)
        }
        smooth=findViewById(R.id.cardSmoothie)

        smooth.setOnClickListener {
            val intent= Intent(this,Smoothie::class.java)
            startActivity(intent)
        }
        gluten.setOnClickListener {
            val intent= Intent(this,Glutenfree::class.java)
            startActivity(intent)
        }

       salmon.setOnClickListener {
            val intent= Intent(this,Salmon::class.java)
            startActivity(intent)
        }
        rice.setOnClickListener {
            val intent= Intent(this,Rice::class.java)
            startActivity(intent)
        }
        lasagna.setOnClickListener {
            val intent= Intent(this,Lasagna::class.java)
            startActivity(intent)
        }


    }
}