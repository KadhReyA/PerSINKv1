package com.example.persink

import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_stnk.*
import java.text.SimpleDateFormat
import java.util.*

class stnk : AppCompatActivity() {

    private var datePickerDialog: DatePickerDialog? = null
    private var dateFormatter: SimpleDateFormat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stnk)
        dateFormatter = SimpleDateFormat("dd-MM-yyyy", Locale.US)

        btnSimpanSTNK.setOnClickListener {
            val dbHandler = DatabaseHelperSTNK(this,null)

            val nostnk = editSTNK.text.toString()
            val platnomor = editPlat.text.toString()
            val almt = editAlmt.text.toString()
            val merk = editMerk.text.toString()
            val jenis = editJenis.text.toString()
            val tahun = editTahun.text.toString()
            val berlaku = textview81.text.toString()
            val tampung = ConsSTNK(nostnk,platnomor,almt,merk,jenis,tahun,berlaku)
            dbHandler.addSTNK(tampung)
            Toast.makeText(this,"Masuk Database", Toast.LENGTH_LONG).show()
        }
        btnHapusSTNK.setOnClickListener {
            editSTNK.setText("")
            editPlat.setText("")
            editAlmt.setText("")
            editMerk.setText("")
            editJenis.setText("")
            editTahun.setText("")
        }
        btnTanggal2.setOnClickListener {
            showDateDialog()
        }

    }
    private fun showDateDialog()
    {
        val newCalendar = Calendar.getInstance()
        datePickerDialog = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {

            override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                val newDate  = Calendar.getInstance()
                newDate.set(year, month, dayOfMonth)
                if(dateFormatter != null)
                {
                    textview81.setText(dateFormatter!!.format(newDate.getTime()))
                }
            }
        }, newCalendar.get(Calendar.YEAR),newCalendar.get(Calendar.MONTH),newCalendar.get(Calendar.DAY_OF_MONTH))

        datePickerDialog!!.show()


    }
}
