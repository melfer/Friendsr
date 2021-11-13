package com.example.friendsr

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dias.*
import kotlinx.android.synthetic.main.activity_dias.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_silvestre.*
import kotlinx.android.synthetic.main.activity_silvestre.view.*

private lateinit var mediaPlayer: MediaPlayer
class silvestre : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silvestre)


        ratingBar2.setOnRatingBarChangeListener{ratingBar, rating,fromUser->


            Toast.makeText(this,"Valoracion es:$rating", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
                var Nombre = "Su Valor es:$rating"
                val intent: Intent = Intent (this, MainActivity::class.java)
                intent.putExtra("Nombre",Nombre)
                startActivity(intent)


        }

        }

    }
