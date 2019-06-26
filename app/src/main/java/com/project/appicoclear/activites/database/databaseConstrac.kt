package com.project.appicoclear.activites.database

import android.provider.BaseColumns

object databaseConstrac {

    object Patient : BaseColumns {
        const val TABLE_NAME = "Patient"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
        const val COLUMN_LASTNAME = "lastName"
        const val COLUMN_AGE = "age"
        const val COLUMN_description = "description"
    }

    object Therapist : BaseColumns {
        const val TABLE_NAME = "therapist"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
    }
}