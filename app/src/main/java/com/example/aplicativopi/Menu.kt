package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu : AppCompatActivity() {
    var inicio: ImageView? = null
    var videoicon: ImageView? = null
    var casa: ImageView? = null
    var saibamais: ImageView? = null
    var tutoriais: ImageView? = null
    var quemsomos: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        saibamais = findViewById(R.id.saibamais)
        saibamais!!.setOnClickListener {
            val intent = Intent(this@Menu, Saiba_Mais::class.java)
            startActivity(intent)
        }


        quemsomos = findViewById(R.id.quemsomos)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Menu, Quem_Somos::class.java)
            startActivity(intent)
        }

        inicio = findViewById(R.id.menu)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }

        casa = findViewById(R.id.casa)
        casa!!.setOnClickListener {
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }

        videoicon = findViewById(R.id.videoicon)
        videoicon!!.setOnClickListener {
            val intent = Intent(this@Menu, Videos_Educativos::class.java)
            startActivity(intent)
        }

        tutoriais = findViewById(R.id.tutoriais)
        tutoriais!!.setOnClickListener {
            val intent = Intent(this@Menu, Tutoriais::class.java)
            startActivity(intent)
        }
    }


}