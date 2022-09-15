package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.aplicativopi.R

class Menu_Videos_Educativos : AppCompatActivity() {

    var videos: ImageView? = null
    var inicio: ImageView? = null
    var video: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_videos_educativos)
        videos = findViewById(R.id.menu)
        videos!!.setOnClickListener {
            val intent = Intent(this@Menu_Videos_Educativos, Videos_Educativos::class.java)
            startActivity(intent)
        }
        video = findViewById(R.id.videoicon)
        video!!.setOnClickListener {
            val intent = Intent(this@Menu_Videos_Educativos, Videos_Educativos::class.java)
            startActivity(intent)
        }

        inicio = findViewById(R.id.casa)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu_Videos_Educativos, MainActivity::class.java)
            startActivity(intent)
        }

    }
}