package com.project.appicoclear.activites.database.entities

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity

@Entity(tableName = "Datos_Paciente")
data class PacienteEnti(
    var Nombre: String,
    var Apellido: String,
    var age: Int,
    var descripcion: String,
    var date: String,
    var time: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Nombre)
        parcel.writeString(Apellido)
        parcel.writeInt(age)
        parcel.writeString(descripcion)
        parcel.writeString(date)
        parcel.writeString(time)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PacienteEnti> {
        override fun createFromParcel(parcel: Parcel): PacienteEnti {
            return PacienteEnti(parcel)
        }

        override fun newArray(size: Int): Array<PacienteEnti?> {
            return arrayOfNulls(size)
        }
    }
}
