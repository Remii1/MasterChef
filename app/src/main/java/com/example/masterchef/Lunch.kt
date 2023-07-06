package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Lunch : AppCompatActivity() {
    lateinit var hea: CardView
    lateinit var spaght: CardView
    lateinit var fajita: CardView
    lateinit var fish1: CardView
    lateinit var salad: CardView
    lateinit var burg: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunch)
        hea=findViewById(R.id.cardHealthy1)
        spaght=findViewById(R.id.cardSpag)
        fajita=findViewById(R.id.cardFaj)
        fish1=findViewById(R.id.cardFish)
        salad=findViewById(R.id.cardSalad)
        burg=findViewById(R.id.cardBurger)

        hea.setOnClickListener {
            val intent= Intent(this,healthybbq::class.java)
            startActivity(intent)
        }
        spaght.setOnClickListener {
            val intent= Intent(this,Spaghetti::class.java)
            startActivity(intent)
        }
        fajita.setOnClickListener {
            val intent= Intent(this,Fajitas::class.java)
            startActivity(intent)
        }
        fish1.setOnClickListener {
            val intent= Intent(this,Fish::class.java)
            startActivity(intent)
        }
        salad.setOnClickListener {
            val intent= Intent(this,Salads1::class.java)
            startActivity(intent)
        }
       burg.setOnClickListener {
            val intent= Intent(this,Burger::class.java)
            startActivity(intent)
        }
    }
}