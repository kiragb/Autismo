package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu_Saiba_Mais : AppCompatActivity() {

    var videos: ImageView? = null
    var inicio: ImageView? = null
    var saibamais: ImageView? = null
var saibamaisicon: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_saiba_mais)

        videos = findViewById(R.id.videoicon)
        videos!!.setOnClickListener {
            val intent = Intent(this@Menu_Saiba_Mais, Videos_Educativos::class.java)
            startActivity(intent)
        }
        saibamais = findViewById(R.id.saibamais)
        saibamais!!.setOnClickListener {
            val intent = Intent(this@Menu_Saiba_Mais, Saiba_Mais::class.java)
            startActivity(intent)
        }
        saibamaisicon = findViewById(R.id.menu)
        saibamaisicon!!.setOnClickListener {
            val intent = Intent(this@Menu_Saiba_Mais, Saiba_Mais::class.java)
            startActivity(intent)
        }

        inicio = findViewById(R.id.casa)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu_Saiba_Mais, MainActivity::class.java)
            startActivity(intent)
        }
    }
}