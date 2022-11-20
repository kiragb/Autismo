package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Musicas_Educativas : AppCompatActivity() {
    var menu: ImageView? = null
    var amigo: ImageView? = null
    var textamigo: TextView? = null
    var descriamigo: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicas_educativas)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Menu::class.java)
            startActivity(intent)
        }

        amigo = findViewById(R.id.amigo)
        amigo!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Amigossauro::class.java)
            startActivity(intent)
        }

        textamigo = findViewById(R.id.textamigo)
        textamigo!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Amigossauro::class.java)
            startActivity(intent)
        }

        descriamigo= findViewById(R.id.descriescovar)
        descriamigo!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Amigossauro::class.java)
            startActivity(intent)
        }
    }
}