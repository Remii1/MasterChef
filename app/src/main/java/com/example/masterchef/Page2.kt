package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class Page2 : AppCompatActivity() {

    lateinit var card:CardView
    lateinit var card1:CardView
    lateinit var card2:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        card=findViewById(R.id.cardBreakfast)
        card1=findViewById(R.id.cardLunch)
        card2=findViewById(R.id.cardSupper)

        card.setOnClickListener {
            var next=Intent(this,Breakfast::class.java)
            startActivity(next)
        }

        card1.setOnClickListener {
            var next=Intent(this,Lunch::class.java)
            startActivity(next)
        }

        card2.setOnClickListener {
            var next=Intent(this,Supper::class.java)
            startActivity(next)
        }
    }
}