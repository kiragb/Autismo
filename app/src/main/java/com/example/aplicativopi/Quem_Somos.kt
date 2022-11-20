package com.example.aplicativopi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView

class Quem_Somos : AppCompatActivity() {
    var quemsomos: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quem_somos)

        setupHyperlink()

        quemsomos = findViewById(R.id.menu)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Quem_Somos, Menu_Quem_Somos::class.java)
            startActivity(intent)
        }


    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.activity_main_link)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE)
    }
}