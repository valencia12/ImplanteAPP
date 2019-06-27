package com.project.appicoclear.activites.viewsAccounts.paciente
data class Paciente(var nombre: String,var apellido: String,var edad: String,var direccion: String)

object Supplier {

    val pacientes = listOf(
        Paciente("Mario Ernesto","suarez Gomez","41","41 av. Sur, Sn Salvador"),
        Paciente("Felipe juan","Galdamez s.","41","41 av. Sur, Sn Salvador"),
        Paciente("Mauricio Alexander","suarez","41","41 av. Sur, Sn Salvador"),
        Paciente("Cecilia Gabriela","suarez","41","41 av. Sur, Sn Salvador"),
        Paciente("MAria Juana","suarez","41","41 av. Sur, Sn Salvador"),
        Paciente("Teresa Sofia","suarez","41","41 av. Sur, Sn Salvador")


        )


}