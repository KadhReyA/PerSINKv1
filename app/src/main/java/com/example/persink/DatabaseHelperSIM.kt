package com.example.persink

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DatabaseHelperSIM(context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                + COL_1  + " TEXT,"
                + COL_2  + " TEXT,"
                + COL_3  + " TEXT,"
                + COL_4  + " TEXT,"
                + COL_5  + " TEXT,"
                + COL_6  + " TEXT,"
                + COLUMN_NAME_EXP  + " TEXT"
                + ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }
    fun addName(cons : ConsSim) {
        val values = ContentValues()
        values.put(COL_1, cons.NoSIM)
        values.put(COL_2, cons.Nama)
        values.put(COL_3, cons.Alamat)
        values.put(COL_4, cons.Tempat)
        values.put(COL_5, cons.TanggalLahir)
        values.put(COL_6, cons.JenisKelamin)
        values.put(COLUMN_NAME_EXP, cons.TanggalExp)
        val db = this.writableDatabase
        db.insert(TABLE_NAME, null, values)
        db.close()
    }
    fun getAll(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
    }

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "PerSINK.db"
        val TABLE_NAME = "NoSIM"
        val COLUMN_ID = "id"
        val COL_1 = "NoSim"
        val COL_2 = "Nama"
        val COL_3 = "Alamat"
        val COL_4 = "Tempat"
        val COL_5 = "TanggalLahir"
        val COL_6 = "JenisKelamin"
        val COLUMN_NAME_EXP = "TanggalExp"
    }
}