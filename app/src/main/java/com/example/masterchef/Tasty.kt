package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Tasty : AppCompatActivity() {
    lateinit var pist:ImageView
    lateinit var turk:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasty)

        pist=findViewById(R.id.pistachio)
        pist.setOnClickListener {
            val intent= Intent(this,pistachiocookies::class.java)
            startActivity(intent)
        }

        turk=findViewById(R.id.turkey)
        turk.setOnClickListener {
            val intent= Intent(this,turkeybacon::class.java)
            startActivity(intent)
        }
    }
}