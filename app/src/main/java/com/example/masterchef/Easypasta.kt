package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Easypasta : AppCompatActivity() {
    lateinit var arti:ImageView
    lateinit var bocco:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easypasta)
        arti=findViewById(R.id.art)
        bocco=findViewById(R.id.saladp)

        bocco.setOnClickListener {
            val intent= Intent(this,boccopasta::class.java)
            startActivity(intent)
        }

        arti.setOnClickListener {
            val intent= Intent(this,artipasta::class.java)
            startActivity(intent)
        }
    }
}