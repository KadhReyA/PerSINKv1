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

            val SIM = editSIM.text.toString()
            val Nama = editNama.text.toString()
            val Alamat = editAlamat.text.toString()
            val Tempat = editTempat.text.toString()
            val Tanggal = editTTL.text.toString()
            val jeniskelamin = editSIM.text.toString()
            val waktu = editDate.text.toString()
            val tampung = ConsSim(SIM,Nama,Alamat,Tempat,Tanggal,jeniskelamin,waktu)
            dbHandler.addName(tampung)
            //showData()
        }
    }
}
