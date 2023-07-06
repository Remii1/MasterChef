package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Breakfast : AppCompatActivity() {

    lateinit var health:CardView
    lateinit var tasty:CardView
    lateinit var african:CardView
    lateinit var delight:CardView
    lateinit var daily:CardView
    lateinit var egg:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)
        health=findViewById(R.id.cardHealthy)
        tasty=findViewById(R.id.cardTasty)
        african=findViewById(R.id.cardAfrican)
        delight=findViewById(R.id.cardDelight)
        daily=findViewById(R.id.cardDaily)
        egg=findViewById(R.id.cardEgg)

        health.setOnClickListener {
            val intent= Intent(this,Healthy::class.java)
            startActivity(intent)
        }
       tasty.setOnClickListener {
            val intent= Intent(this,Tasty::class.java)
            startActivity(intent)
        }
        african.setOnClickListener {
            val intent= Intent(this,African::class.java)
            startActivity(intent)
        }
        delight.setOnClickListener {
            val intent= Intent(this,Delight::class.java)
            startActivity(intent)
        }
        daily.setOnClickListener {
            val intent= Intent(this,Daily::class.java)
            startActivity(intent)
        }
        egg.setOnClickListener {
            val intent= Intent(this,Egg::class.java)
            startActivity(intent)
        }
    }
}