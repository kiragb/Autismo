package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Acoes_Cotidianas : AppCompatActivity() {
    var menu: ImageView? = null
    var escovardentinhos: ImageView? = null
    var textescovar: TextView? = null
    var descriescovar: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acoes_cotidianas)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Menu::class.java)
            startActivity(intent)
        }

        escovardentinhos = findViewById(R.id.escovardentinhos)
        escovardentinhos!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Escovar_Dentinhos::class.java)
            startActivity(intent)
        }

        textescovar = findViewById(R.id.textescovar)
        textescovar!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Escovar_Dentinhos::class.java)
            startActivity(intent)
        }

        descriescovar = findViewById(R.id.descriescovar)
        descriescovar!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Escovar_Dentinhos::class.java)
            startActivity(intent)
        }


    }


}