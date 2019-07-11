package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val masukkansim = findViewById <ImageButton> (R.id.imageButton)
        masukkansim.setOnClickListener {
            startActivity(Intent(this@MainActivity, sim::class.java))
        }
        val masukkanstnk = findViewById <ImageButton> (R.id.imageButton2)
        masukkanstnk.setOnClickListener {
            startActivity(Intent(this@MainActivity, stnk::class.java))
        }
        val lihatsim = findViewById<ImageButton>(R.id.imageButton3)
        lihatsim.setOnClickListener {

        }
        val lihatstnk = findViewById<ImageButton>(R.id.imageButton4)
        lihatstnk.setOnClickListener {

        }
    }


}
