package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
class Tutoriais : AppCompatActivity() {

    var tutoriais: ImageView? = null
    var quebra: Button? = null
    var ante: Button? = null
    var silabas: Button? = null


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

        ante = findViewById(R.id.ante)
        ante!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Antecessores_e_Sucessores::class.java)
            startActivity(intent)

        }

        silabas = findViewById(R.id.silabas)
        silabas!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Jogo_das_Silabas::class.java)
            startActivity(intent)

        }
    }
}