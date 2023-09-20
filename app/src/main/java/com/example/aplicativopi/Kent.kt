package com.example.aplicativopi
<<<<<<< HEAD

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

class Kent : AppCompatActivity() {

    private lateinit var videoView: VideoView
    var menu: ImageView? = null
    var kent: TextView? = null
    var linkvideo: TextView? = null

=======
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.SurfaceTexture
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.Surface
import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Kent : AppCompatActivity() {

    private lateinit var textureView: TextureView
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var playPauseImageView: ImageView
    private lateinit var stopButton: ImageView
    private lateinit var progressSeekBar: SeekBar
    private val handler = Handler()
    private var isPlaying = false
    var menu: ImageView? = null
    var dentinhospdf: TextView? = null
    var linkvideo: TextView? = null
    @SuppressLint("MissingInflatedId")
>>>>>>> c51f9ad (videos postos)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kent)

<<<<<<< HEAD
        // preciso ver isso aqui
=======
>>>>>>> c51f9ad (videos postos)
        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Kent, Menu::class.java)
            startActivity(intent)
        }

<<<<<<< HEAD
        videoView = findViewById(R.id.VideoView)

        // Define o caminho do vídeo a ser reproduzido (a partir do diretório res/raw)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.kent

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

        kent = findViewById<View>(R.id.kentpdf) as TextView
        kent!!.setOnClickListener {
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

=======
        textureView = findViewById(R.id.textureView)
        playPauseImageView = findViewById(R.id.playPauseImageView)
        progressSeekBar = findViewById(R.id.progressSeekBar)

        // Configurar um SurfaceTextureListener para a TextureView
        textureView.surfaceTextureListener = object : TextureView.SurfaceTextureListener {
            override fun onSurfaceTextureAvailable(
                surfaceTexture: SurfaceTexture,
                width: Int,
                height: Int
            ) {
                // Quando a superfície estiver pronta, configure o MediaPlayer
                val surface = Surface(surfaceTexture)
                mediaPlayer = MediaPlayer()

                try {
                    // Carregue o vídeo a partir dos recursos raw
                    val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.kent)
                    mediaPlayer.setDataSource(applicationContext, videoUri)
                    mediaPlayer.setSurface(surface)
                    mediaPlayer.isLooping = true // Repetir o vídeo



                    mediaPlayer.prepareAsync() // Preparar o MediaPlayer de forma assíncrona
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                // Iniciar a atualização da SeekBar de progresso
                progressSeekBar.max = mediaPlayer.duration

                startProgressUpdate()
            }

            override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, width: Int, height: Int) {
                // Lidar com mudanças no tamanho da superfície, se necessário
            }

            override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
                // Lidar com a destruição da superfície, se necessário
                return true
            }

            override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
                // Atualizações da superfície (não usadas neste exemplo)
            }

            // ... Outros métodos do SurfaceTextureListener ...
        }

        playPauseImageView.setOnClickListener {
            if (isPlaying) {
                mediaPlayer.pause()
                playPauseImageView.setImageResource(R.drawable.ic_play) // Altere para a imagem "play"
            } else {
                mediaPlayer.start()
                playPauseImageView.setImageResource(R.drawable.ic_pause) // Altere para a imagem "pause"
            }
            isPlaying = !isPlaying // Inverta o estado de reprodução
        }




        progressSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Atualize a posição de reprodução do vídeo quando o usuário arrastar a SeekBar de progresso
                if (fromUser) {
                    mediaPlayer.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Não necessário
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Não necessário
            }
        })

        dentinhospdf = findViewById<View>(R.id.kentpdf) as TextView
        dentinhospdf!!.setOnClickListener {
            viewpdf() }

        linkvideo = findViewById<View>(R.id.linkvideo) as TextView
        linkvideo!!.setOnClickListener {
            linkvideo() }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(progressUpdateRunnable) // Pare a atualização da SeekBar de progresso
        mediaPlayer.release()
    }

    private val progressUpdateRunnable = object : Runnable {
        override fun run() {
            if (mediaPlayer.isPlaying) {
                val currentPosition = mediaPlayer.currentPosition
                progressSeekBar.progress = currentPosition
            }
            handler.postDelayed(this, 1000) // Atualize a cada segundo
        }
    }

    private fun startProgressUpdate() {
        handler.post(progressUpdateRunnable)
    }


>>>>>>> c51f9ad (videos postos)
    private fun viewpdf() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VKmIjAFaI_4ANcx24nqjiTjsRC5MuS3G/view?usp=sharing"))

        // start activity
        startActivity(intent)
    }
<<<<<<< HEAD
private fun linkvideo() {
    // add the link of pdf
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PHx94xIKS_0&pp=ygULa2VudCBxdWFydG8%3D"))

    // start activity
    startActivity(intent)
}
=======
    private fun linkvideo() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PHx94xIKS_0&pp=ygULa2VudCBxdWFydG8%3D"))

        // start activity
        startActivity(intent)
    }
>>>>>>> c51f9ad (videos postos)
}
