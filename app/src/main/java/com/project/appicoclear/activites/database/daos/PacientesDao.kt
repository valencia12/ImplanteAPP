package com.project.appicoclear.activites.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.project.appicoclear.activites.database.entities.PacienteEnti

interface PacientesDao {
    @Query("SELECT * FROM Datos_Paciente")
    fun getAll() : LiveData<List<PacienteEnti>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(match: PacienteEnti)

    @Query("DELETE FROM Datos_Paciente")
    fun nukeAllMatches()
}