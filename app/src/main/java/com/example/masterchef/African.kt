package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class African : AppCompatActivity() {
    lateinit var ski:ImageView
    lateinit var cau:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_african)
       ski=findViewById(R.id.skin)

        ski.setOnClickListener {
            val intent= Intent(this,skinnyfries::class.java)
            startActivity(intent)
        }
        cau=findViewById(R.id.cauli)

        cau.setOnClickListener {
            val intent= Intent(this,cauliflower::class.java)
            startActivity(intent)
        }
    }
}