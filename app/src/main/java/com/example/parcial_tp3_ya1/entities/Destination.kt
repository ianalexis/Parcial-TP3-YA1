package com.example.parcial_tp3_ya1.entities

import android.os.Parcel
import android.os.Parcelable

class Destination (city : String, country : String, code : String, image : String, desc : String, photos : Array<String>, price : String ) : Parcelable {

    var city : String
    var country : String
    var code : String
    var image : String
    var desc : String
    var photos : Array<String>
    var price : String

    constructor(parcel: Parcel) : this(
        parcel.readString().toString()
                parcel.readString().toString()
                parcel.readString().toString()
                parcel.readString().toString()
                parcel.readString().toString()
                parcel.readString().toString()

                parcel.readString().toString()

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Destination> {
        override fun createFromParcel(parcel: Parcel): Destination {
            return Destination(parcel)
        }

        override fun newArray(size: Int): Array<Destination?> {
            return arrayOfNulls(size)
        }
    }


}