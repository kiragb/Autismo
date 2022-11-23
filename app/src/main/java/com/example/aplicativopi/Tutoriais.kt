package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
class Tutoriais : AppCompatActivity() {

    var tutoriais: ImageView? = null
    var quebra: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutoriais)

        tutoriais = findViewById(R.id.menu)
        tutoriais!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Menu_Tutoriais::class.java)
            startActivity(intent)

        }

        quebra = findViewById(R.id.quebra)
        quebra!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Quebra_Cabeca::class.java)
            startActivity(intent)

        }
    }
}