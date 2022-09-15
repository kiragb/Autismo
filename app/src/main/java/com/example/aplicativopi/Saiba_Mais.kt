package com.example.aplicativopi

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Saiba_Mais : AppCompatActivity() {
    var video: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saiba_mais)
        video = findViewById(R.id.menu)
        video!!.setOnClickListener {
            val intent = Intent(this@Saiba_Mais, Menu_Saiba_Mais::class.java)
            startActivity(intent)
        }
    }

}