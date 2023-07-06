package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Loginsignuppage : AppCompatActivity() {
    private lateinit var myemail:EditText
    private lateinit var mypassword1:EditText
    lateinit var login1:Button
    private lateinit var auth:FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginsignuppage)

        myemail=findViewById(R.id.editTextTextEmailAddress2)
        mypassword1=findViewById(R.id.editTextTextPassword)
        login1=findViewById(R.id.button2)

        auth=FirebaseAuth.getInstance()

        login1.setOnClickListener {
            login()
        }
    }

    private fun login(){
        val email=myemail.text.toString()
        val pass=mypassword1.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if(it.isSuccessful ){
                Toast.makeText(this,"Successfully logged in",Toast.LENGTH_LONG).show()
                val intent=Intent(this,Homeactivity::class.java)
                startActivity(intent)
            }else
                Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show()
        }
    }
    }

