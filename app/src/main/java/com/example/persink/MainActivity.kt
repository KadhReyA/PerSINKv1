package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.design.widget.Snackbar
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


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
            startActivity(Intent( this@MainActivity, com.example.persink.lihatsim::class.java ))
        }

        val lihatstnk = findViewById<ImageButton>(R.id.imageButton4)
        lihatstnk.setOnClickListener {
            startActivity(Intent( this@MainActivity, com.example.persink.lihatstnk::class.java ))
        }

        val panduan = findViewById<ImageButton>(R.id.imageButton5)
        panduan.setOnClickListener {
            val mNotificationTime = Calendar.getInstance().timeInMillis + 5000 //Set after 5 seconds from the current time.
            NotificationUtils().setNotification(mNotificationTime, this@MainActivity)
            startActivity(Intent ( this@MainActivity, com.example.persink.panduan::class.java))
        }
        val pengaturan = findViewById<ImageButton>(R.id.imageButton6)
        pengaturan.setOnClickListener {
            startActivity(Intent (this@MainActivity, pengaturan_notifikasi::class.java))
        }

    }
}
