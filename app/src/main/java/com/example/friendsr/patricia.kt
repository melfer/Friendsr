package com.example.friendsr

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dias.*
import kotlinx.android.synthetic.main.activity_patricia.*


class patricia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patricia)

        ratingBar6.setOnRatingBarChangeListener{ratingBar, rating,fromUser->


            Toast.makeText(this,"la Puntuacion de el mono Arjona es:$rating", Toast.LENGTH_SHORT).show()
            var Nombre6 = "Su Valor es:$rating"
            val intent: Intent = Intent (this, MainActivity::class.java)
            intent.putExtra("Nombre6",Nombre6)
            startActivity(intent)

        }
    }
}


