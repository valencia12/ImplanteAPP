package com.project.appicoclear.activites.viewsAccounts.paciente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.appicoclear.R


import kotlinx.android.synthetic.main.activity_expedient.*

class Expedient : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expedient)
        val myIntent: Intent = intent
        var nombre = myIntent.getStringExtra("Nombre") //actividad donde se genera un el expediente de un paciente
        var apellido = myIntent.getStringExtra("Apellido")
        var edad = myIntent.getStringExtra("Edad")
        var direccion = myIntent.getStringExtra("Direccion")
        tv_nombre.text="Nombre: $nombre"
        tv_apellido.text="Apellido: $apellido"
        tv_edad.text="Edad: $edad"
        tv_direc.text="Direccion: $direccion"
    }
}
