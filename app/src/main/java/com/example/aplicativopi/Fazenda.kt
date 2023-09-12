package com.example.aplicativopi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativopi.Menu
import com.example.aplicativopi.R

class Fazenda : AppCompatActivity() {

    private lateinit var videoView: VideoView
    var menu: ImageView? = null
    var fazenda: TextView? = null
    var linkvideo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fazenda)

        // preciso ver isso aqui
        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Fazenda, Menu::class.java)
            startActivity(intent)
        }

        videoView = findViewById(R.id.VideoView)

        // Define o caminho do vídeo a ser reproduzido (a partir do diretório res/raw)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.fazenda

        // Configura a URI do vídeo e os controles de mídia
        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)

        // Configura os controles de mídia (play, pause, avançar, retroceder)


        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)


        // Torna a janela em tela cheia

        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_IMMERSIVE
                )
        // Inicia a reprodução do vídeo

        fazenda = findViewById<View>(R.id.fazendapdf) as TextView
        fazenda!!.setOnClickListener {
            viewpdf() }

        linkvideo = findViewById<View>(R.id.linkvideo) as TextView
        linkvideo!!.setOnClickListener {
            linkvideo() }

    }

    override fun onResume() {
        super.onResume()
        // Mantém a tela sempre ligada enquanto o vídeo estiver em execução
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    override fun onPause() {
        super.onPause()
        // Remove a flag para manter a tela ligada quando a atividade estiver em pausa
        window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    private fun viewpdf() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1pCktBNmwk4KF68rkCK_CDVO1yT7NFIJh/view?usp=sharing"))

        // start activity
        startActivity(intent)
    }
    private fun linkvideo() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=e123lOibPN0&pp=ygUmYW5pbWFpcyBkYSBmYXplbmRhIGVkdWNhw6fDo28gaW5mYW50aWw%3D"))

        // start activity
        startActivity(intent)
    }
}
