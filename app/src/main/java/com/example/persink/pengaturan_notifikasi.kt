package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pengaturan_notifikasi.*
import java.util.*

class pengaturan_notifikasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan_notifikasi)

        var textDate = ""
        radioTime.setOnCheckedChangeListener { _ , isChecked ->
            if (R.id.radioButton15 == isChecked)
                textDate = "15"
            if (R.id.radioButton10 == isChecked)
                textDate = "10"
            if (R.id.radioButton5 == isChecked)
                textDate = "5"
        }

        buttonDate.setOnClickListener {
            val setTime = textDate
            val timeNotif = Notify()
            timeNotif.timeNotify(setTime)
            val mNotificationTime = Calendar.getInstance().timeInMillis + timeNotif.setTimeMilis //Set after x seconds from the current time.
            NotificationUtils().setNotification(mNotificationTime, this@pengaturan_notifikasi)
            Toast.makeText(this,"Data Tersimpan", Toast.LENGTH_LONG).show()
        }
    }
}
