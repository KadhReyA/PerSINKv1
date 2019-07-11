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
        var text =""
        radioGroup.setOnCheckedChangeListener { _ , isChecked ->

            text += if (R.id.radioGroup==isChecked)"Laki-Laki" else "Perempuan"
        }
        btnSimpanSIM.setOnClickListener {
            val dbHandler = DatabaseHelperSIM(this, null)

            val SIM = editSIM.text.toString()
            val Nama = editNama.text.toString()
            val Alamat = editAlamat.text.toString()
            val Tempat = editTempat.text.toString()
            val Tanggal = editTTL.text.toString()
            val jeniskelamin = text
            val waktu = editDate.text.toString()
            val tampung = ConsSim(SIM,Nama,Alamat,Tempat,Tanggal,jeniskelamin,waktu)
            dbHandler.addName(tampung)
            Toast.makeText(this,"Masuk Database",Toast.LENGTH_LONG).show()
        }
        btnHapusSIM.setOnClickListener {
            editSIM.setText("")
            editNama.setText("")
            editAlamat.setText("")
            editTempat.setText("")
            editTTL.setText("")
            radioButton
            editDate.setText("")
        }
    }
}
