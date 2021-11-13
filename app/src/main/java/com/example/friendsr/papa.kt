package com.example.friendsr

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dias.*
import kotlinx.android.synthetic.main.activity_papa.*
private lateinit var mediaPlayer: MediaPlayer
class papa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_papa)
        ratingBar4.setOnRatingBarChangeListener{ratingBar, rating,fromUser->

            Toast.makeText(this,"la Puntuacion de Rafael Diaz es:$rating", Toast.LENGTH_SHORT).show()
            var Nombre5 = "Su Valor es:$rating"
            val intent: Intent = Intent (this, MainActivity::class.java)
            intent.putExtra("Nombre5",Nombre5)
            startActivity(intent)

        }


    }
}