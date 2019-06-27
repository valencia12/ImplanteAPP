package com.project.appicoclear.activites.database.repository


//import android.support.annotation.WorkerThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.project.appicoclear.activites.database.daos.PacientesDao
import com.project.appicoclear.activites.database.entities.PacienteEnti

class ContadorRepo(private val PacientesDao: PacientesDao) {

    val part: LiveData<List<PacienteEnti>> = PacientesDao.getAll()

    @WorkerThread
    suspend fun insert(pacienteEnti: PacienteEnti) {
        PacientesDao.insert(pacienteEnti)
    }
}

/*class ContadorRepo(private val ContadorDao: ContadorDao){

    val part : LiveData<List<ContadorP>> = ContadorDao.getAll()

    @WorkerThread
    suspend fun insert(ContadorP: ContadorP){
        ContadorDao.insert(ContadorP)
    }
}*/