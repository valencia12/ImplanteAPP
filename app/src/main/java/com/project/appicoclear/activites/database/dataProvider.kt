package com.project.appicoclear.activites.database

import android.content.Context

class dataProvider(appContext: Context) {
    private val tag = this@dataProvider::class.java.simpleName
    private val realtimeData = RealTimeDatabase()
    private val localData = LocalDB(appContext)

}