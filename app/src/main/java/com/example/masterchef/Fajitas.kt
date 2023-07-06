package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Fajitas : AppCompatActivity() {
    lateinit var chick:ImageView
    lateinit var bf:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fajitas)

        bf=findViewById(R.id.beef)
        bf.setOnClickListener {
            val intent= Intent(this,beeffajita::class.java)
            startActivity(intent)
        }

        chick=findViewById(R.id.ch)
        chick.setOnClickListener {
            val intent= Intent(this,chickenfajita::class.java)
            startActivity(intent)
        }
    }
}