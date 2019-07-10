package com.example.persink

import android.content.ContentValues
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sim.*
import java.util.*
import java.util.jar.Attributes

class sim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sim)
        btnSimpanSIM.setOnClickListener {
            val dbHandler = DatabaseHelperSIM(this, null)
            ContentValues ctv = new ContentValues()
            val ConsSim.SIM = ConsSim(editSIM.text.toString())
            val Nama = ConsSim(editNama.text.toString())
            val Alamat = ConsSim(editAlamat.text.toString())
            val Tempat = ConsSim(editTempat.text.toString())
            val Tanggal = ConsSim(editTTL.text.toString())
            val jeniskelamin = ConsSim(editSIM.text.toString())
            val waktu = ConsSim(editDate.text.toString())
            dbHandler.addName(SIM, Nama, Alamat, Tempat, Tanggal, jeniskelamin, waktu)
            //showData()
        }
    }
}
