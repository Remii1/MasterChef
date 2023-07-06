package com.example.masterchef

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class Homeactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var logout: ImageView
        lateinit var contin: ImageView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)
        logout=findViewById(R.id.imageView3)
        contin=findViewById(R.id.imageView2)

        contin.setOnClickListener {
            val intent= Intent(this,Page2::class.java)
            startActivity(intent)
        }


        logout.setOnClickListener {
            var box= AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setNegativeButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setPositiveButton("CANCEL",
                DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Master Chef")
            alert.show()

        }
    }
}