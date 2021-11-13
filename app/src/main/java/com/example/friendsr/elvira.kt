package com.example.friendsr

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dias.*
import kotlinx.android.synthetic.main.activity_elvira.*
private lateinit var mediaPlayer: MediaPlayer
class elvira : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elvira)



        ratingBar3.setOnRatingBarChangeListener{ratingBar, rating,fromUser->


            Toast.makeText(this,"la Puntuacion de Elvira Maestre es:$rating", Toast.LENGTH_SHORT).show()
            var Nombre3 = "Su Valor es:$rating"
            val intent: Intent = Intent (this, MainActivity::class.java)
            intent.putExtra("Nombre3",Nombre3)
            startActivity(intent)

        }
    }


}