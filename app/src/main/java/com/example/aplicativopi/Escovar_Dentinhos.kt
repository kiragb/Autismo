package com.example.aplicativopi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


open class Escovar_Dentinhos : AppCompatActivity() {
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null
    var dentinhospdf: TextView? = null
    var menu: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escovar_dentinhos)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Escovar_Dentinhos, Menu::class.java)
            startActivity(intent)
        }

        // Find your VideoView in your video_main.xml layout
        simpleVideoView = findViewById<View>(R.id.simpleVideoView) as VideoView
        if (mediaControls == null) {
            // create an object of media controller class
            mediaControls = MediaController(this@Escovar_Dentinhos)
            mediaControls!!.setAnchorView(simpleVideoView)
        }
        // set the media controller for video view
        simpleVideoView!!.setMediaController(mediaControls)
        // set the uri for the video view
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.escovar))
        // start a video
        simpleVideoView!!.start()


        // implement on completion listener on video view
        simpleVideoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Parabéns, você terminou o vídeo!!!", Toast.LENGTH_LONG)
                .show() // display a toast when an video is completed
        }
        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(
                applicationContext,
                "Oops An Error Occur While Playing Video...!!!",
                Toast.LENGTH_LONG
            ).show() // display a toast when an error is occured while playing an video
            false
        }



        dentinhospdf = findViewById<View>(R.id.dentinhospdf) as TextView
        dentinhospdf!!.setOnClickListener {
                viewpdf() }

    }
     private fun viewpdf() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1I2k5m4o3IUEiwkcrqB5iJAOCWMabj5oc/view?usp=share_link"))

        // start activity
        startActivity(intent)
    }

}