package com.example.parcial_tp3_ya1.entities

import android.os.Parcel
import android.os.Parcelable

class ProfileEntitie (name: String?, city: String?, desc: String?, profileimage: String?, backgroundimage: String?) : Parcelable {
    var name: String?
    var city: String?
    var desc: String?
    var profileimage: String?
    var backgroundimage: String?

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    init {
        this.name = name
        this.city = city
        this.desc = desc
        this.profileimage = profileimage
        this.backgroundimage = backgroundimage
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(city)
        parcel.writeString(desc)
        parcel.writeString(profileimage)
        parcel.writeString(backgroundimage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProfileEntitie> {
        override fun createFromParcel(parcel: Parcel): ProfileEntitie {
            return ProfileEntitie(parcel)
        }

        override fun newArray(size: Int): Array<ProfileEntitie?> {
            return arrayOfNulls(size)
        }
    }
}