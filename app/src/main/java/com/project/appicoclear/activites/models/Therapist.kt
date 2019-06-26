package com.project.appicoclear.activites.models

import android.os.Parcel
import android.os.Parcelable

class Therapist (
    var _id : String? = null,
    var name: String = "N/A"

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Therapist> {
        override fun createFromParcel(parcel: Parcel): Therapist {
            return Therapist(parcel)
        }

        override fun newArray(size: Int): Array<Therapist?> {
            return arrayOfNulls(size)
        }
    }
}