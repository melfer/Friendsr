package com.example.friendsr

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_arjona.*
import kotlinx.android.synthetic.main.activity_dias.*

class arjona : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arjona)

        ratingBar5.setOnRatingBarChangeListener{ratingBar, rating,fromUser->

            Toast.makeText(this,"la Puntuacion de Patricia Acosta es:$rating", Toast.LENGTH_SHORT).show()
            var Nombre4 = "Su Valor es:$rating"
            val intent: Intent = Intent (this, MainActivity::class.java)
            intent.putExtra("Nombre4",Nombre4)
            startActivity(intent)

        }
    }
}