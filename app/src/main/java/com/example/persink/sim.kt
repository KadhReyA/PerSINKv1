package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sim.*
import java.util.*
import android.app.DatePickerDialog
import android.widget.DatePicker
import java.text.SimpleDateFormat


class sim : AppCompatActivity() {

    private var datePickerDialog: DatePickerDialog? = null
    private var dateFormatter: SimpleDateFormat? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sim)
        dateFormatter = SimpleDateFormat("dd-MM-yyyy", Locale.US)

        var text =""
        radioGroup.setOnCheckedChangeListener { _ , isChecked ->

            text += if (R.id.radioButton==isChecked)"Laki-Laki" else "Perempuan"
        }
        btnSimpanSIM.setOnClickListener {
            val dbHandler = DatabaseHelperSIM(this, null)

            val SIM = editSIM.text.toString()
            val Nama = editNama.text.toString()
            val Alamat = editAlamat.text.toString()
            val Tempat = editTempat.text.toString()
            val Tanggal = editTTL.text.toString()
            val jeniskelamin = text
            val waktu = textview80.text.toString()
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
        }
        btnTanggal.setOnClickListener {
            showDateDialog()
        }
    }
    private fun showDateDialog() {

        val newCalendar = Calendar.getInstance()
        datePickerDialog = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {

            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {

                val newDate = Calendar.getInstance()
                newDate.set(year, monthOfYear, dayOfMonth)
                if (dateFormatter != null) {
                    textview80.setText(dateFormatter!!.format(newDate.getTime()))
                }
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH))

        /**
         * Tampilkan DatePicker dialog
         */
        datePickerDialog!!.show()
    }
}
