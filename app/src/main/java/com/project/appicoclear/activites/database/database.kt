package com.project.appicoclear.activites.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

private const val SQL_CREATE_PATIENTS =
    "TABLE ${databaseConstrac.Patient.TABLE_NAME}(" +
            "${databaseConstrac.Patient.COLUMN_ID}TEXT PRIMARY KEY," +
            "${databaseConstrac.Patient.COLUMN_NAME} TEXT," +
            "${databaseConstrac.Patient.COLUMN_LASTNAME} TEXT," +
            "${databaseConstrac.Patient.COLUMN_AGE} INTEGER,)" +
            "${databaseConstrac.Patient.COLUMN_description} TEXT;" +
            "CREATE TABLE ${databaseConstrac.Therapist.TABLE_NAME}(" +
            "${databaseConstrac.Therapist.COLUMN_ID} TEXT PRIMARY KEY," +
            "${databaseConstrac.Therapist.COLUMN_NAME} TEXT)"

private const val SQL_DELETE_PATIENTS = "DROP TABLE IF EXISTS ${databaseConstrac.Patient.TABLE_NAME}"
private const val SQL_DELETE_Therapist = "DROP TABLE IF EXISTS ${databaseConstrac.Therapist.TABLE_NAME}"

class DatabaseSQL(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_PATIENTS)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(SQL_DELETE_PATIENTS)
        db.execSQL(SQL_DELETE_Therapist)
        onCreate(db)
    }

    companion object {
        const val DATABASE_NAME = "miprimerabase.db"
        const val DATABASE_VERSION = 4
    }
}