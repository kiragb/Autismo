package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.aplicativopi.R

class Menu : AppCompatActivity() {
    var inicio: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        inicio = findViewById(R.id.menu)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }

    }


}