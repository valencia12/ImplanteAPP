package com.project.appicoclear.activites.database

import android.content.ContentValues
import android.content.Context
import android.util.Log
import com.project.appicoclear.activites.models.Patient
import com.project.appicoclear.activites.models.Therapist

class localDb(appContext: Context) {
    private val dbHelper = DatabaseSQL(appContext)

    fun closeDb() {
        dbHelper.close()
    }

    fun writeToLocalDB(data: ArrayList<Patient>): ArrayList<Boolean> {
        val db = dbHelper.writableDatabase
        val listBase = readMoney()
        val dataStatus = java.util.ArrayList<Boolean>()
        data.forEach {
            val values = ContentValues().apply {
                put(databaseConstrac.Patient.COLUMN_ID, it._id)
                put(databaseConstrac.Patient.COLUMN_NAME, it.name)
                put(databaseConstrac.Patient.COLUMN_LASTNAME, it.lastname)
                put(databaseConstrac.Patient.COLUMN_description, it.description)
            }
            var isAlreadyIn = false
            listBase.forEach { elem ->
                if (elem._id == it._id) {
                    isAlreadyIn = true
                    Log.d("DatabaseUPdate", "${it.name} is already on db")
                }
            }
            if(isAlreadyIn){
                updateCoin(it)
            } else {
                val newRowId = db?.insert(databaseConstrac.Patient.TABLE_NAME, null, values)
                dataStatus.add(newRowId != -1L)
            }
        }

        return dataStatus
    }
    fun readMoney(): ArrayList<Patient> {
        val db = dbHelper.readableDatabase
        val projection = arrayOf(
            databaseConstrac.Patient.COLUMN_ID,
            databaseConstrac.Patient.COLUMN_NAME,
            databaseConstrac.Patient.COLUMN_LASTNAME,
            databaseConstrac.Patient.COLUMN_description
        )
        val sortOrder = "${databaseConstrac.Patient.COLUMN_NAME} DESC"

        val cursor = db.query(
            databaseConstrac.Patient.TABLE_NAME, // nombre de la tabla
            projection, // columnas que se devolverán
            null, // Columns where clausule
            null, // values Where clausule
            null, // Do not group rows
            null, // do not filter by row
            sortOrder // sort order
        )
        val list = ArrayList<Patient>()
        with(cursor) {
            while (moveToNext()) {
                val patient = Patient(
                    getString(getColumnIndexOrThrow(databaseConstrac.Patient.COLUMN_ID)),
                    getString(getColumnIndexOrThrow(databaseConstrac.Patient.COLUMN_NAME)),
                    getString(getColumnIndexOrThrow(databaseConstrac.Patient.COLUMN_LASTNAME)),
                    getInt(getColumnIndexOrThrow(databaseConstrac.Patient.COLUMN_description))

                )
                Log.i("LocalDB", "From local datbase ${patient._id} ${patient.name} ${patient.lastname}")
                list.add(patient)
            }
        }
        return list
    }

    fun readCountries(): ArrayList<Therapist> {
        val db = dbHelper.readableDatabase
        val projection = arrayOf(
            databaseConstrac.Therapist.COLUMN_ID,
            databaseConstrac.Therapist.COLUMN_NAME
        )
        val sortOrder = "${databaseConstrac.Therapist.COLUMN_NAME} DESC"
        val cursor = db.query(
            databaseConstrac.Therapist.TABLE_NAME, // nombre de la tabla
            projection, // columnas que se devolverán
            null, // Columns where clausule
            null, // values Where clausule
            null, // Do not group rows
            null, // do not filter by row
            sortOrder // sort order
        )
        val list = ArrayList<Therapist>()
        with(cursor) {
            while (moveToNext()) {
                val therapist = Therapist(
                    getString(getColumnIndexOrThrow(databaseConstrac.Therapist.COLUMN_ID)),
                    getString(getColumnIndexOrThrow(databaseConstrac.Therapist.COLUMN_NAME))
                )
                Log.i("LocalDB", "From local datbase ${therapist._id} ${therapist.name}")
                list.add(therapist)
            }
        }
        return list
    }

}