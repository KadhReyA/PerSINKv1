package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lihatsim.*

class lihatsim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihatsim)
        showDataSIM()
    }

    fun showDataSIM(){
        tvDisplayNameSIM.text = ""
        val dbHandler = DatabaseHelperSIM(this, null)
        val cursor = dbHandler.getAll()
        cursor!!.moveToFirst()
        tvDisplayNameSIM.append((cursor.getString(0)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(1)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(2)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(3)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(4)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(5)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(6)))
        tvDisplayNameSIM.append("    ")
        tvDisplayNameSIM.append((cursor.getString(7)))
        tvDisplayNameSIM.append("\n")
        while (cursor.moveToNext()) {
            tvDisplayNameSIM.append((cursor.getString(0)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(1)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(2)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(3)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(4)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(5)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(6)))
            tvDisplayNameSIM.append("    ")
            tvDisplayNameSIM.append((cursor.getString(7)))
            tvDisplayNameSIM.append("\n")
        }
        cursor.close()
    }
}
