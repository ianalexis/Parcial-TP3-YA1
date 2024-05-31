package com.example.parcial_tp3_ya1.entities

import android.os.Parcel
import android.os.Parcelable

class OffersEntitie(image: String?, title : String?, desc: String?) : Parcelable {

    var image : String?
    var title : String?
    var desc : String?


    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
       ) {
    }
    init {
        this.image = image
        this.title = title
        this.desc = desc
        }
     override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(image)
         parcel.writeString(title)
        parcel.writeString(desc)
    }


    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OffersEntitie> {
        override fun createFromParcel(parcel: Parcel): OffersEntitie {
            return OffersEntitie(parcel)
        }

        override fun newArray(size: Int): Array<OffersEntitie?> {
            return arrayOfNulls(size)
        }
    }


}