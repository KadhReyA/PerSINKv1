package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.Button;
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val masukkansim = findViewById <ImageButton> (R.id.imageButton)
        masukkansim.setOnClickListener {
             startActivity(Intent(this, sim::class.java))
        }
        val masukkanstnk = findViewById <ImageButton> (R.id.imageButton2)
        masukkanstnk.setOnClickListener {
            startActivity(Intent(this, stnk::class.java))
        }
    }


}
