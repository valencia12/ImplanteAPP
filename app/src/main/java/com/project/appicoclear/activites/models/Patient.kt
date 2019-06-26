package com.project.appicoclear.activites.models

import android.os.Parcel
import android.os.Parcelable

class Patient (
    var _id : String? = null,
    var name: String = "N/A",
    var lastname: String = "N/A",
    var age: Int = 0,
    var description: String = "N/A"
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(name)
        parcel.writeString(lastname)
        parcel.writeInt(age)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Patient> {
        override fun createFromParcel(parcel: Parcel): Patient {
            return Patient(parcel)
        }

        override fun newArray(size: Int): Array<Patient?> {
            return arrayOfNulls(size)
        }
    }
}