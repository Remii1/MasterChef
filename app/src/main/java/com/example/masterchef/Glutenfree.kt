package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Glutenfree : AppCompatActivity() {
    lateinit var cream:ImageView
    lateinit var zucchi:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glutenfree)
        cream=findViewById(R.id.creamy)
        zucchi=findViewById(R.id.zucc)

        cream.setOnClickListener {
            val intent= Intent(this,creamyquinoa::class.java)
            startActivity(intent)
        }


        zucchi.setOnClickListener {
            val intent= Intent(this,zucchinipasta::class.java)
            startActivity(intent)
        }

    }
}