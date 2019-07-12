package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lihatstnk.*

class lihatstnk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihatstnk)
        showDataSTNK()
    }

    fun showDataSTNK(){
        tvDisplayNameSTNK.text = ""
        val dbHandler = DatabaseHelperSTNK(this, null)
        val cursor = dbHandler.getAll()
        cursor!!.moveToFirst()
        if(cursor.getCount() != 0) {
            tvDisplayNameSTNK.append((cursor.getString(0)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(1)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(2)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(3)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(4)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(5)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(6)))
            tvDisplayNameSTNK.append("    ")
            tvDisplayNameSTNK.append((cursor.getString(7)))
            tvDisplayNameSTNK.append("\n")
            while (cursor.moveToNext()) {
                tvDisplayNameSTNK.append((cursor.getString(0)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(1)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(2)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(3)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(4)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(5)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(6)))
                tvDisplayNameSTNK.append("    ")
                tvDisplayNameSTNK.append((cursor.getString(7)))
                tvDisplayNameSTNK.append("\n")
            }
            cursor.close()
        }
    }
}
