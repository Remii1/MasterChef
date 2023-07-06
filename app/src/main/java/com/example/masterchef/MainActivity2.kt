package com.example.masterchef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    lateinit var email1:EditText
    lateinit var mypassword:EditText
    lateinit var myconfpassword:EditText
    lateinit var signup: Button
    lateinit var mylogin:TextView
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        email1=findViewById(R.id.editTextTextEmailAddress)
        mypassword=findViewById(R.id.editTextTextPassword)
        myconfpassword=findViewById(R.id.editTextTextPassword2)
        signup=findViewById(R.id.button1)
        mylogin=findViewById(R.id.mess)


        auth= Firebase.auth


        mylogin.setOnClickListener {
            val intent=Intent(this,Loginsignuppage::class.java)
            startActivity(intent)
        }



        signup.setOnClickListener {
            SignUpUser()
        }


    }

    private fun SignUpUser() {
        val email = email1.text.toString()
        val pass = mypassword.text.toString()
        val confirmpass = myconfpassword.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()) {
            Toast.makeText(this, "Please Email and Password cant be empty", Toast.LENGTH_LONG)
                .show()
            return
        } else if (pass != confirmpass) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Signed up succesfully", Toast.LENGTH_LONG).show()
                val intent=Intent(this,Page1::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()
            }
        }
    }
}



