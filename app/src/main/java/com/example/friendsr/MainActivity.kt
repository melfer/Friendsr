package com.example.friendsr

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dias.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_silvestre.*

private lateinit var mediaPlayer: MediaPlayer
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.audio1)
        mediaPlayer.start()

        val objetoIntent: Intent = intent
        var Nombre = objetoIntent.getStringExtra("Nombre")
        textView18.text=Nombre

        val objetoIntent2: Intent = intent
        var Nombre2 = objetoIntent.getStringExtra("Nombre2")
        textView19.text=Nombre2

        val objetoIntent3: Intent = intent
        var Nombre3 = objetoIntent.getStringExtra("Nombre3")
        textView21.text=Nombre3

        val objetoIntent4: Intent = intent
        var Nombre4 = objetoIntent.getStringExtra("Nombre4")
        textView24.text=Nombre4

        val objetoIntent5: Intent = intent
        var Nombre5 = objetoIntent.getStringExtra("Nombre5")
        textView23.text=Nombre5

        val objetoIntent6: Intent = intent
        var Nombre6 = objetoIntent.getStringExtra("Nombre6")
        textView22.text=Nombre6

        dangon.setOnClickListener {
            startActivity(Intent(this, silvestre::class.java))


        }

        diomedes.setOnClickListener {
            startActivity(Intent(this, dias::class.java))

        }

        elvira1.setOnClickListener {
            startActivity(Intent(this, elvira::class.java))

        }

        imageView5.setOnClickListener {
            startActivity(Intent(this, papa::class.java))

        }

        imageView6.setOnClickListener {
            startActivity(Intent(this, arjona::class.java))

        }

        arjona12.setOnClickListener {
            startActivity(Intent(this, patricia::class.java))

        }


    }



}





