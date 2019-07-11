package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_stnk.*

class stnk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stnk)

        btnSimpanSTNK.setOnClickListener {
            val dbHandler = DatabaseHelperSTNK(this,null)

            val nostnk = editSTNK.text.toString()
            val platnomor = editPlat.text.toString()
            val almt = editAlmt.text.toString()
            val merk = editMerk.text.toString()
            val jenis = editJenis.text.toString()
            val tahun = editTahun.text.toString()
            val berlaku = editBerlaku.text.toString()
            val tampung = ConsSTNK(nostnk,platnomor,almt,merk,jenis,tahun,berlaku)
            dbHandler.addSTNK(tampung)

        }
        btnHapusSTNK.setOnClickListener {
            editSTNK.setText("")
            editPlat.setText("")
            editAlmt.setText("")
            editMerk.setText("")
            editJenis.setText("")
            editTahun.setText("")
            editBerlaku.setText("")
        }

    }
}
