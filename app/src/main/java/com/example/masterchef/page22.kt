package com.example.masterchef

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class page22 : AppCompatActivity() {
    lateinit var card1: CardView
    lateinit var card11: CardView
    lateinit var card21: CardView
    lateinit var logout1: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page22)

        card1=findViewById(R.id.cardBreakfast)
        card11=findViewById(R.id.cardLunch)
        card21=findViewById(R.id.cardSupper)
        logout1=findViewById(R.id.cardLogout)

        card1.setOnClickListener {
            var next= Intent(this,Breakfast::class.java)
            startActivity(next)
        }

        card11.setOnClickListener {
            var next= Intent(this,Lunch::class.java)
            startActivity(next)
        }

        card21.setOnClickListener {
            var next= Intent(this,Supper::class.java)
            startActivity(next)
        }

        logout1.setOnClickListener {
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