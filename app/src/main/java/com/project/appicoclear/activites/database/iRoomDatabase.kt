package com.project.appicoclear.activites.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.project.appicoclear.activites.database.daos.PacientesDao
import com.project.appicoclear.activites.database.entities.PacienteEnti

@Database(entities = [PacienteEnti::class], version = 2)
public abstract class iRoomDatabase: RoomDatabase(){
    abstract fun PacientesDao(): PacientesDao

    companion object{
        @Volatile
        private var INSTANCE: iRoomDatabase? = null

        fun getDatabase(context: Context
        ):iRoomDatabase{

            return INSTANCE?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    iRoomDatabase::class.java,
                    "word_database"
                )
                    .build()
                INSTANCE = instance
                instance
            }

        }
    }
}