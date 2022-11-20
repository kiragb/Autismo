package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var menu: ImageView? = null
    var acoescotidianas: Button? = null
    var musica: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu::class.java)
            startActivity(intent)
        }
        acoescotidianas = findViewById(R.id.acoescotidianas)
        acoescotidianas!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Acoes_Cotidianas::class.java)
            startActivity(intent)
        }

        musica = findViewById(R.id.musica)
        musica!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Musicas_Educativas::class.java)
            startActivity(intent)
        }
    }
}